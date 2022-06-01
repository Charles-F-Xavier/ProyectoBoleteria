/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jr972
 */
public class Obra {
    
    private int id;
    
    private String nombre;
    
    private String reparto;
    
    private int tipo_funcion_id_fk;
    
    private int categoria_id_fk;

    public Obra(int id, String nombre, String reparto, int tipo_funcion_id_fk, int categoria_id_fk) {
        this.id = id;
        this.nombre = nombre;
        this.reparto = reparto;
        this.tipo_funcion_id_fk = tipo_funcion_id_fk;
        this.categoria_id_fk = categoria_id_fk;
    }

    public Obra() {
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

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public int getTipo_funcion_id_fk() {
        return tipo_funcion_id_fk;
    }

    public void setTipo_funcion_id_fk(int tipo_funcion_id_fk) {
        this.tipo_funcion_id_fk = tipo_funcion_id_fk;
    }

    public int getCategoria_id_fk() {
        return categoria_id_fk;
    }

    public void setCategoria_id_fk(int categoria_id_fk) {
        this.categoria_id_fk = categoria_id_fk;
    }
    
    
    
}
