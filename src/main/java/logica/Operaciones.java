
package logica;

import java.util.List;


public interface Operaciones<S> { //Interface para dar obligatoriedad a la implementaciòn
    public int guardar(S dato);
    public int validarr(S dato);
    public int crearClase(S dato);
    public S subirTarea();
    public int crearTarea(S dato);
    

    
}
