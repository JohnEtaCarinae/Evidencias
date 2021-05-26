
package logica;

import dao.Tarea;
import database.Conexiones;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OperTarea implements Operaciones<Tarea> {

    @Override
    public int guardar(Tarea dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int validarr(Tarea dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearClase(Tarea dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tarea subirTarea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearTarea(Tarea dato) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql = "insert into tareas (titulotarea, descriptarea, fechatarea) values (?,?,?)";
                PreparedStatement us =  cActiva.prepareStatement(sql);
                us.setString(1, dato.getTituloTarea());
                us.setString(2, dato.getDescripTarea());
                us.setDate(3, (Date) dato.getFechaTarea());
                int rta = us.executeUpdate();
                return rta;
            } catch (SQLException ex) {
                Logger.getLogger(OperTarea.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                c.desconectase(cActiva);
            }
        }
        return 0;
    }
    
}
