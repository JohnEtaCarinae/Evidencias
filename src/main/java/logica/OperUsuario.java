
package logica;

import dao.Usuario;
import database.Conexiones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperUsuario implements Operaciones<Usuario> {

    @Override
    public int guardar(Usuario dato) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql = "insert into usuarios (identificacion, nombre, apellido, correo, numero, clave, ocupacion ) values (?,?,?,?,?,?,?)";
                PreparedStatement us =  cActiva.prepareStatement(sql);
                us.setString(1, dato.getIdentificacion());
                us.setString(2, dato.getNombre());
                us.setString(3, dato.getApellido());
                us.setString(4, dato.getCorreo());
                us.setString(5, dato.getNumero());
                us.setString(6, dato.getClave());
                us.setString(7, dato.getRol().getNombre());
                int rta = us.executeUpdate();
                return rta;
            } catch (SQLException ex) {
                Logger.getLogger(OperUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                c.desconectase(cActiva);
            }
        }
        return 0;
    }

    @Override
    public Usuario subirTarea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int validarr(Usuario dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public int crearClase(Usuario dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearTarea(Usuario s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
