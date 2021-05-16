
package dao;


public enum Rol {
    ESTUDIANTE("Alumno"),
    PROFESOR("Docente");
    private String nombre;

    Rol(String nombre){
        this.nombre = nombre;     
    }

    public String getNombre() {
        return nombre;
    }

}
