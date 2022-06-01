/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.ConexionSingleton;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Crud;
import model.Funcion;
import model.Usuario;

/**
 *
 * @author N1CKPL4Y
 */
public class DaoUsuario implements Crud<Usuario>{
    private ConexionSingleton con;
    public DaoUsuario(ConexionSingleton con){
        this.con = con;
    }

    @Override
    public void insert(Usuario obj) {
        String sql = "INSERT INTO usuario VALUES(NULL, '"+obj.getRut()+"', '"+obj.getNombre()+"', '"+obj.getApellido()+"', '"+obj.getCorreo()+"', '"+obj.getPasswd()+"', '"+obj.getT_user_id_fk()+"')";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Usuario obj) {
        String sql = "DELETE FROM usuario WHERE id =  '"+obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Usuario get(int id) {
        String sql = "SELECT * FROM usuario WHERE id =  '"+id+"'";
        try {
            ResultSet rs = con.getCon().createStatement().executeQuery(sql);
            if(rs.next()){
                return new Usuario(rs.getInt("id"), rs.getString("rut"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("correo"), rs.getString("passwd"), rs.getInt("t_user_id_fk"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(Usuario obj) {
        String sql = "UPDATE usuario SET rut = '"+obj.getRut()+"', nombre ='"+obj.getNombre()+"', apellido ='"+obj.getApellido()+"', correo='"+obj.getCorreo()+"', passwd='"+obj.getPasswd()+"', t_user_id_fk= '"+obj.getT_user_id_fk()+"' WHERE id =  '"+obj.getId()+"' ";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Usuario> getAll() {
        String sql = "SELECT * FROM usuario";
        List<Usuario> list = new ArrayList<>();

        try {
            ResultSet rs = this.con.getCon()
                    .createStatement()
                    .executeQuery(sql);
            while(rs.next()){
                list.add(new Usuario(rs.getInt("id"), rs.getString("rut"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("correo"), rs.getString("passwd"), rs.getInt("t_user_id_fk")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
