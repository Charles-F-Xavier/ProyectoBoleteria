/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jr972
 */
public class Usuario {
    
    private int id;
    
    private String rut;
    
    private String nombre;
    
    private String apellido;
    
    private String correo;
    
    private String passwd;
    
    private int t_user_id_fk;

    public Usuario(int id, String rut, String nombre, String apellido, String correo, String passwd, int t_user_id_fk) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.passwd = passwd;
        this.t_user_id_fk = t_user_id_fk;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getT_user_id_fk() {
        return t_user_id_fk;
    }

    public void setT_user_id_fk(int t_user_id_fk) {
        this.t_user_id_fk = t_user_id_fk;
    }
    
    
    
}
