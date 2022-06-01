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
import model.Obra;

/**
 *
 * @author jr972
 */
public class DaoObra implements Crud<Obra>{
    
    private ConexionSingleton con;
    public DaoObra(ConexionSingleton con){
        this.con = con;
    }

    @Override
    public void insert(Obra obj) {
        String sql = "INSERT INTO obra VALUES(NULL,'"+obj.getNombre()+"','"+obj.getReparto()+"','"+obj.getTipo_funcion_id_fk()+"','"+obj.getCategoria_id_fk()+"')";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Obra obj) {
        String sql = "DELETE FROM obra WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Obra get(int i) {
        String sql = "SELECT * FROM obra WHERE id =  '"+ i +"'";
        try {
            ResultSet resultSet = con.getCon().createStatement().executeQuery(sql);
            if(resultSet.next()){
                return new Obra(resultSet.getInt("id"),resultSet.getString("nombre"),resultSet.getString("reparto"),resultSet.getInt("tipo_funcion_id_fk"),resultSet.getInt("categoria_id_fk"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public void update(Obra obj) {
        String sql = "UPDATE obra SET nombre='"+obj.getNombre()+"', reparto='"+obj.getReparto()+"', tipo_funcion_id_fk='"+obj.getTipo_funcion_id_fk()+"', categoria_id_fk='"+obj.getCategoria_id_fk()+"' WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Obra> getAll() {
        String sql = "SELECT * FROM obra";
        List<Obra> list = new ArrayList<>();

        try {
            ResultSet resultSet = this.con.getCon()
                    .createStatement()
                    .executeQuery(sql);
            while(resultSet.next()){
                list.add(new Obra(resultSet.getInt("id"),resultSet.getString("nombre"),resultSet.getString("reparto"),resultSet.getInt("tipo_funcion_id_fk"),resultSet.getInt("categoria_id_fk")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
}
