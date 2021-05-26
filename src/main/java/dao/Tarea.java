
package dao;

import java.util.Date;


public class Tarea {
    private String tituloTarea;
    private String descripTarea;
    private Date fechaTarea;
    
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
    
     @Override
    public String toString() {
        return  this.tituloTarea +""+
                this.descripTarea +""+
                this.fechaTarea;
    }
    
}
