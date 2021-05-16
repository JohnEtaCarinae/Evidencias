
package dao;


public class Estudiante {
    private Long id;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String correo;
    private String numero;
    private String contraseña;
    private Rol ocupacion;
   
    
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
    
    public String getContraseña(){
        return contraseña;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    public Rol getRol(){
        return ocupacion;
    }
    
    public void setRol(Rol ocupacion){
        this.ocupacion = ocupacion;
    }
    
    @Override
    public String toString() {
        return  this.id +""+
                this.identificacion +""+
                this.nombre+""+
                this.apellido+""+
                this.correo+""+
                this.numero+""+
                this.contraseña+""+
                this.ocupacion.getNombre();
    }
    
}
