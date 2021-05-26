
package logica;

import dao.Usuario;
import dao.Clase;
import database.Conexiones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OperClase implements Operaciones<Clase> {

    @Override
    public int guardar(Clase dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int validarr(Clase dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearClase(Clase dato) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql = "insert into datosclase (titulo, codigo) values (?,?)";
                PreparedStatement us =  cActiva.prepareStatement(sql);
                us.setString(1, dato.getTituloClase());
                us.setLong(2, dato.getCodigoClase());
                int rta = us.executeUpdate();
                return rta;
            } catch (SQLException ex) {
                Logger.getLogger(OperClase.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                c.desconectase(cActiva);
            }
        }
        return 0;
    }

    @Override
    public Clase subirTarea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearTarea(Clase s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
