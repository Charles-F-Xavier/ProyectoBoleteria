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
import java.util.Optional;
import model.Crud;
import model.T_User;

/**
 *
 * @author jr972
 */
public class DaoT_User implements Crud<T_User>{
    
    private ConexionSingleton con;
    public DaoT_User(ConexionSingleton con){
        this.con = con;
    }

    @Override
    public void insert(T_User obj) {
        String sql = "INSERT INTO t_user VALUES(NULL,'"+obj.getNombre()+"')";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(T_User obj) {
        String sql = "DELETE FROM t_user WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public T_User get(int i) {
        String sql = "SELECT * FROM t_user WHERE id =  '"+ i +"'";
        try {
            ResultSet rs = con.getCon().createStatement().executeQuery(sql);
            if(rs.next()){
                return new T_User(rs.getInt("id"),rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(T_User obj) {
        String sql = "UPDATE t_user SET nombre='"+obj.getNombre()+"' WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T_User> getAll() {
        String sql = "SELECT * FROM t_user";
        List<T_User> list = new ArrayList<>();

        try {
            ResultSet resultSet = this.con.getCon()
                    .createStatement()
                    .executeQuery(sql);
            while(resultSet.next()){
                list.add(new T_User(resultSet.getInt("id"),resultSet.getString("nombre")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    

    
    
    
    
}
