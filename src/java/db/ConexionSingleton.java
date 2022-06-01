/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jr972
 */
public class ConexionSingleton {
    
    /*private static Connection connection;
    
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/boleteria","root","");
            if (connection!=null) {
                System.out.println("Hola");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error");
            
        } 
    }
    
    public static Connection getCon(){
        return connection;
    }*/
    
    private static ConexionSingleton instance;
    private Connection oConnection;

    private ConexionSingleton() throws InstantiationException, IllegalAccessException{
        
        String url = String.format("jdbc:mysql://localhost/boleteria");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            oConnection = DriverManager.getConnection(url,"root","");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public static ConexionSingleton getIntance() throws InstantiationException, IllegalAccessException{
        if(instance == null)
            instance = new ConexionSingleton();
        return instance;
    }

    public Connection getCon(){
        return oConnection;
    }
    
}
