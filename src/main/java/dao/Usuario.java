
package dao;


public class Usuario {
    private Long id;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String correo;
    private String numero;
    private String clave;
    private Rol rol;
   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getClave(){
        return clave;
    }
    
    public void setClave(String clave){
        this.clave = clave;
    }
    
    public Rol getRol(){
        return rol;
    }
    
    public void setRol(Rol rol){
        this.rol = rol;
    }
    
    @Override
    public String toString() {
        return  this.id +""+
                this.identificacion +""+
                this.nombre+""+
                this.apellido+""+
                this.correo+""+
                this.numero+""+
                this.clave+""+
                this.rol.getNombre();
    }
    
}
