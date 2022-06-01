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
import model.Reserva;

/**
 *
 * @author jr972
 */
public class DaoReserva implements Crud<Reserva>{
    
    private ConexionSingleton con;
    public DaoReserva(ConexionSingleton con){
        this.con = con;
    }

    @Override
    public void insert(Reserva obj) {
        String sql = "INSERT INTO reserva VALUES(NULL,'"+obj.getUsuario_id_fk()+"','"+obj.getFecha_reserva()+"','"+obj.getHora_reserva()+"')";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Reserva obj) {
        String sql = "DELETE FROM reserva WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Reserva get(int i) {
        String sql = "SELECT * FROM reserva WHERE id =  '"+ i +"'";
        try {
            ResultSet resultSet = con.getCon().createStatement().executeQuery(sql);
            if(resultSet.next()){
                return new Reserva(resultSet.getInt("id"),resultSet.getInt("usuario_id_fk"),resultSet.getDate("fecha"),resultSet.getTime("hora"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public void update(Reserva obj) {
        String sql = "UPDATE reserva SET usuario_id_fk='"+obj.getUsuario_id_fk()+"', fecha='"+obj.getFecha_reserva()+"', hora='"+obj.getHora_reserva()+"' WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Reserva> getAll() {
        String sql = "SELECT * FROM reserva";
        List<Reserva> list = new ArrayList<>();

        try {
            ResultSet resultSet = this.con.getCon()
                    .createStatement()
                    .executeQuery(sql);
            while(resultSet.next()){
                list.add(new Reserva(resultSet.getInt("id"),resultSet.getInt("usuario_id_fk"),resultSet.getDate("fecha"),resultSet.getTime("hora")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
}
