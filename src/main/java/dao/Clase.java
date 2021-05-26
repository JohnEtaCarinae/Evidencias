
package dao;


public class Clase {
    private String tituloClase;
    private Integer codigoClase;
    
    
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
    
     @Override
    public String toString() {
        return  this.tituloClase +""+
                this.codigoClase;
    }
}
