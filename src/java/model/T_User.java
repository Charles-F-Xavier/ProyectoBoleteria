/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jr972
 */
public class T_User {
    
    private int id;
    
    private String nombre;

    public T_User(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public T_User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "T_User{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
}
