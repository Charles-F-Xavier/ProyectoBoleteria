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
import model.Funcion;

/**
 *
 * @author N1CKPL4Y
 */
public class DaoFuncion implements Crud<Funcion>{
    private ConexionSingleton con;
    public DaoFuncion(ConexionSingleton con){
        this.con = con;
    }

    @Override
    public void insert(Funcion fun) {
        String sql = "INSERT INTO funcion VALUES(NULL,'"+fun.getCodigo()+"', '"+fun.getFecha()+"', '"+fun.getHora()+"', '"+fun.getTeatro_id_fk()+"', '"+fun.getSala_id_fk()+"', '"+fun.getObra_id_fk()+"')";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Funcion fun) {
        String sql = "DELETE FROM funcion WHERE id =  '"+fun.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Funcion get(int i) {
        String sql = "SELECT * FROM funcion WHERE id =  '"+i+"'";
        try {
            ResultSet rs = con.getCon().createStatement().executeQuery(sql);
            if(rs.next()){
                return new Funcion(rs.getInt("id"),rs.getString("codigo"), rs.getDate("fecha"), rs.getTime("hora"), rs.getInt("teatro_id_fk"), rs.getInt("sala_id_fk"), rs.getInt("obra_id_fk"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(Funcion obj) {
        String sql = "UPDATE funcion SET codigo='"+obj.getCodigo()+"', fecha='"+obj.getFecha()+"', hora='"+obj.getHora()+"', teatro_id_fk= '"+obj.getTeatro_id_fk()+"', sala_id_fk= '"+obj.getSala_id_fk()+"', obra_id_fk= '"+obj.getObra_id_fk()+"' WHERE id =  '"+obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Funcion> getAll() {
        String sql = "SELECT * FROM funcion";
        List<Funcion> list = new ArrayList<>();

        try {
            ResultSet rs = this.con.getCon()
                    .createStatement()
                    .executeQuery(sql);
            while(rs.next()){
                list.add(new Funcion(rs.getInt("id"),rs.getString("codigo"), rs.getDate("fecha"), rs.getTime("hora"), rs.getInt("teatro_id_fk"), rs.getInt("sala_id_fk"), rs.getInt("obra_id_fk")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    
    
    
}
