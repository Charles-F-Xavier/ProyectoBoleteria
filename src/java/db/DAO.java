/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Asiento;
import model.Usuario;

/**
 *
 * @author jr972
 */
public class DAO {
    
    private ConexionSingleton con;
    public DAO(ConexionSingleton con){
        this.con = con;
    }
    
    public Usuario isExist(Usuario oUsuario){
        String sql = "SELECT * FROM usuario WHERE correo =  '"+ oUsuario.getCorreo() +"' and passwd=sha2('"+oUsuario.getPasswd()+"',0)";
        try {
            ResultSet resultSet = con.getCon().createStatement().executeQuery(sql);
            if(resultSet.next()){
                return new Usuario(resultSet.getInt("id"),resultSet.getString("rut"),resultSet.getString("nombre"),resultSet.getString("apellido"),resultSet.getString("correo"),resultSet.getString("passwd"),resultSet.getInt("t_user_id_fk"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
