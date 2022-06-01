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
import model.Asiento;
import model.Crud;

/**
 *
 * @author jr972
 */
public class DaoAsiento implements Crud<Asiento>{
    
    private ConexionSingleton con;
    public DaoAsiento(ConexionSingleton con){
        this.con = con;
    }

    @Override
    public void insert(Asiento obj) {
        String sql = "INSERT INTO t_user VALUES(NULL,'"+obj.getCodigo()+"','"+obj.getFuncion_id_fk()+"','"+obj.getReserva_id_fk()+"','"+obj.isEstado()+"')";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Asiento obj) {
        String sql = "DELETE FROM asiento WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Asiento get(int i) {
        String sql = "SELECT * FROM t_user WHERE id =  '"+ i +"'";
        try {
            ResultSet resultSet = con.getCon().createStatement().executeQuery(sql);
            if(resultSet.next()){
                return new Asiento(resultSet.getInt("id"),resultSet.getString("codigo"),resultSet.getInt("funcion_id_fk"),resultSet.getInt("reserva_id_fk"),resultSet.getBoolean("estado"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public void update(Asiento obj) {
        String sql = "UPDATE asiento SET codigo='"+obj.getCodigo()+"' WHERE id =  '"+ obj.getId()+"'";
        try {
            con.getCon().createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Asiento> getAll() {
        String sql = "SELECT * FROM asiento";
        List<Asiento> list = new ArrayList<>();

        try {
            ResultSet resultSet = this.con.getCon()
                    .createStatement()
                    .executeQuery(sql);
            while(resultSet.next()){
                list.add(new Asiento(resultSet.getInt("id"),resultSet.getString("codigo"),resultSet.getInt("funcion_id_fk"),resultSet.getInt("reserva_id_fk"),resultSet.getBoolean("estado")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
    
    
}
