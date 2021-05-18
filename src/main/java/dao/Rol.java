
package dao;


public enum Rol {
    ESTUDIANTE("Estudiante"),
    PROFESOR("Profesor");
    private String nombre;

    Rol(String nombre){
        this.nombre = nombre;     
    }

    public String getNombre() {
        return nombre;
    }

}
