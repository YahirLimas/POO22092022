/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.db;

import ico.fes.herencia.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteException;

/**
 *
 * @author YAHIR LIMAS
 */
public class PersonaDAO implements interfazDao{

    public PersonaDAO() {
    }

    @Override
    public ArrayList obtenerTodo() throws SQLiteException {
        ArrayList<Persona> info = new ArrayList<Persona>();
        try {
            Statement stm = BaseDeDatos.getInstance().getConexion().createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM persona;");
            
            while (rst.next()) {                
                info.add(new Persona(rst.getString(1), rst.getInt(2)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return info;
    }

    @Override
    public boolean insertar(Object o) throws SQLiteException {
        boolean respuesta = false;
        Persona p = (Persona)o;
        String sql = "INSERT INTO persona VALUES(?,?)";
        try {
            PreparedStatement pstm = BaseDeDatos.getInstance().getConexion().prepareStatement(sql);
            pstm.setString(1, p.getNombre());
            pstm.setInt(2, p.getEdad());
            int rowCount = pstm.executeUpdate();
            respuesta = rowCount == 1? true:false;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return respuesta;
    }

    @Override
    public boolean eliminar(String n) throws SQLiteException {
        return true;
    }
    
}
