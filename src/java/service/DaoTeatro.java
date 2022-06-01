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
import model.Teatro;

/**
 *
 * @author jr972
 */
public class DaoTeatro implements Crud<Teatro>{
    
    private ConexionSingleton con;
    public DaoTeatro(ConexionSingleton con){
        this.con = con;
    }

    @Override
    public void insert(Teatro obj) {
        String sql = "INSERT INTO teatro VALUES(NULL,'"+obj.getNombre()+"','"+obj.getDireccion()+"','"+obj.getCapacidad()+"')";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Teatro obj) {
        String sql = "DELETE FROM teatro WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Teatro get(int i) {
        String sql = "SELECT * FROM teatro WHERE id =  '"+ i +"'";
        try {
            ResultSet resultSet = con.getCon().createStatement().executeQuery(sql);
            if(resultSet.next()){
                return new Teatro(resultSet.getInt("id"),resultSet.getString("nombre"),resultSet.getString("direccion"),resultSet.getInt("capacidad"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public void update(Teatro obj) {
        String sql = "UPDATE teatro SET nombre='"+obj.getNombre()+"', direccion='"+obj.getDireccion()+"', capacidad='"+obj.getCapacidad()+"' WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Teatro> getAll() {
        String sql = "SELECT * FROM tipo_funcion";
        List<Teatro> list = new ArrayList<>();

        try {
            ResultSet resultSet = this.con.getCon()
                    .createStatement()
                    .executeQuery(sql);
            while(resultSet.next()){
                list.add(new Teatro(resultSet.getInt("id"),resultSet.getString("nombre"),resultSet.getString("direccion"),resultSet.getInt("capacidad")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
}
