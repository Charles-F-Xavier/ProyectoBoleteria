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
import model.Sala;

/**
 *
 * @author N1CKPL4Y
 */
public class DaoSala implements Crud<Sala>{
    private ConexionSingleton con;
    public DaoSala(ConexionSingleton con){
        this.con = con;
    }

    @Override
    public void insert(Sala obj) {
        String sql = "INSERT INTO sala VALUES(NULL,'"+obj.getNum()+"', '"+obj.getCapacidad()+"')";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Sala obj) {
        String sql = "DELETE FROM sala WHERE id =  '"+obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Sala get(int id) {
        String sql = "SELECT * FROM sala WHERE id =  '"+id+"'";
        try {
            ResultSet rs = con.getCon().createStatement().executeQuery(sql);
            if(rs.next()){
                return new Sala(rs.getInt("id"), rs.getInt("num"), rs.getInt("capacidad"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(Sala obj) {
        String sql = "UPDATE sala SET num='"+obj.getNum()+"','"+obj.getCapacidad()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Sala> getAll() {
        String sql = "SELECT * FROM sala";
        List<Sala> list = new ArrayList<>();

        try {
            ResultSet rs = this.con.getCon()
                    .createStatement()
                    .executeQuery(sql);
            while(rs.next()){
                list.add(new Sala(rs.getInt("id"), rs.getInt("num"), rs.getInt("capacidad")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
}
