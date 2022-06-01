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
import model.Tipo_Funcion;

/**
 *
 * @author jr972
 */
public class DaoTipo_Funcion implements Crud<Tipo_Funcion>{
    
    private ConexionSingleton con;
    public DaoTipo_Funcion(ConexionSingleton con){
        this.con = con;
    }

    @Override
    public void insert(Tipo_Funcion obj) {
        String sql = "INSERT INTO tipo_funcion VALUES(NULL,'"+obj.getNombre()+"')";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Tipo_Funcion obj) {
        String sql = "DELETE FROM tipo_funcion WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Tipo_Funcion get(int i) {
        String sql = "SELECT * FROM tipo_funcion WHERE id =  '"+ i +"'";
        try {
            ResultSet resultSet = con.getCon().createStatement().executeQuery(sql);
            if(resultSet.next()){
                return new Tipo_Funcion(resultSet.getInt("id"),resultSet.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public void update(Tipo_Funcion obj) {
        String sql = "UPDATE tipo_funcion SET nombre='"+obj.getNombre()+"' WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Tipo_Funcion> getAll() {
        String sql = "SELECT * FROM tipo_funcion";
        List<Tipo_Funcion> list = new ArrayList<>();

        try {
            ResultSet resultSet = this.con.getCon()
                    .createStatement()
                    .executeQuery(sql);
            while(resultSet.next()){
                list.add(new Tipo_Funcion(resultSet.getInt("id"),resultSet.getString("nombre")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
}
