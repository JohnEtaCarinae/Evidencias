
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
import logica.OperUsuario;

@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable {
    private long id;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String correo;
    private String numero;
    private String clave;
    private Integer rol;
    private String mensaje;
    
    
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
    
    public Integer getRol(){
        return rol;
    }
    
    public void setRol(Integer rol){
        this.rol = rol;
    }
    
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void insertar(){
        OperUsuario oper = new OperUsuario();
        Usuario u = new Usuario();
        u.setIdentificacion(this.identificacion);
        u.setNombre(this.nombre);
        u.setApellido(this.apellido);
        u.setCorreo(this.correo);
        u.setNumero(this.numero);
        u.setClave(this.clave);
        if (this.rol == 1)
            u.setRol(Rol.ESTUDIANTE);
        if (this.rol == 2)
            u.setRol(Rol.PROFESOR);
        
        System.out.println("Usuario "+u);
        this.mensaje = "Se guardó la información";
        System.out.println();
        if (oper.guardar(u) >0){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Se guardó la información del usuario"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconveniente en el almacenamiento, intente mas tarde "));
        }
    }
}
