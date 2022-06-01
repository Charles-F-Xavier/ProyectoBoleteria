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
import model.Categoria;
import model.Crud;
import model.T_User;

/**
 *
 * @author N1CKPL4Y
 */
public class DaoCategoria implements Crud<Categoria> {
    private ConexionSingleton con;
    public DaoCategoria(ConexionSingleton con){
        this.con = con;
    }

    @Override
    public void insert(Categoria cat) {
        String sql = "INSERT INTO categoria VALUES(NULL,'"+cat.getNombre()+"')";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Categoria cat) {
        String sql = "DELETE FROM categoria WHERE id =  '"+ cat.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Categoria get(int i) {
        String sql = "SELECT * FROM categoria WHERE id =  '"+ i +"'";
        try {
            ResultSet rs = con.getCon().createStatement().executeQuery(sql);
            if(rs.next()){
                return new Categoria(rs.getInt("id"),rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(Categoria cat) {
        String sql = "UPDATE categoria SET nombre='"+cat.getNombre()+"' WHERE id =  '"+ cat.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Categoria> getAll() {
        String sql = "SELECT * FROM categoria";
        List<Categoria> list = new ArrayList<>();

        try {
            ResultSet resultSet = this.con.getCon()
                    .createStatement()
                    .executeQuery(sql);
            while(resultSet.next()){
                list.add(new Categoria(resultSet.getInt("id"),resultSet.getString("nombre")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
    
}
