

package web;
import dao.Usuario;
import dao.Clase;
import dao.Rol;
import database.Conexiones;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logica.OperClase;
import logica.OperUsuario;

@ManagedBean
@SessionScoped
public class ClaseBean implements Serializable{
    private String tituloClase;
    private Integer codigoClase;
    private String mensaje;
    
    
    public String getTituloClase(){
        return tituloClase;
    }
    
    public void setTituloClase(String tituloClase){
        this.tituloClase = tituloClase;
    }
    
    public Integer getCodigoClase(){
        return codigoClase;
    }
    
    public void setCodigoClase(Integer codigoClase){
        this.codigoClase = codigoClase;
    }
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void crearClase(){
        OperClase oper = new OperClase();
        Clase c = new Clase();
        c.setTituloClase(this.tituloClase);
        c.setCodigoClase(this.codigoClase);
        
        
        System.out.println("Clase "+c);
        this.mensaje = "Se ha creado la clase";
        System.out.println();
        if (oper.crearClase(c) >0){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Se guardó la información de la clase"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconveniente en el almacenamiento, intente mas tarde "));
        }
    }
}