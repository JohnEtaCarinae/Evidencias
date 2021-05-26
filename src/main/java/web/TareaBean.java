
package web;

import dao.Tarea;
import dao.Rol;
import database.Conexiones;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logica.OperTarea;

@ManagedBean
@SessionScoped
public class TareaBean implements Serializable {
    
    private String tituloTarea;
    private String descripTarea;
    private Date fechaTarea;
    private String mensaje;
    
    public String getTituloTarea(){
        return tituloTarea;
    }
    
    public void setTituloTarea(String tituloTarea){
        this.tituloTarea = tituloTarea;
    }
    
    public String getDescripTarea(){
        return tituloTarea;
    }
    
    public void setDescripTarea(String descripTarea){
        this.descripTarea = descripTarea;
    }
    
    public Date getFechaTarea() {
        return fechaTarea;
    }

    public void setFechaTarea(Date fechaTarea) {
        this.fechaTarea = fechaTarea;
    }
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void crearTarea(){
        OperTarea oper = new OperTarea();
        Tarea t = new Tarea();
        t.setTituloTarea(this.tituloTarea);
        t.setDescripTarea(this.descripTarea);
        t.setFechaTarea(this.fechaTarea);
        System.out.println("Tarea "+t);
        this.mensaje = "Se ha creado la tarea";
        System.out.println();
        if (oper.crearTarea(t) >0){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Se ha creado la tarea"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconveniente en la persistencia, intente mas tarde "));
        }
    }
    
}
