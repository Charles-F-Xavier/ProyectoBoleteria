/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jr972
 */
public class Asiento {
    
    private int id;
    
    private String codigo;
    
    private int funcion_id_fk;
    
    private int reserva_id_fk;
    
    private boolean estado;

    public Asiento(int id, String codigo, int funcion_id_fk, int reserva_id_fk, boolean estado) {
        this.id = id;
        this.codigo = codigo;
        this.funcion_id_fk = funcion_id_fk;
        this.reserva_id_fk = reserva_id_fk;
        this.estado = estado;
    }

    public Asiento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getFuncion_id_fk() {
        return funcion_id_fk;
    }

    public void setFuncion_id_fk(int funcion_id_fk) {
        this.funcion_id_fk = funcion_id_fk;
    }

    public int getReserva_id_fk() {
        return reserva_id_fk;
    }

    public void setReserva_id_fk(int reserva_id_fk) {
        this.reserva_id_fk = reserva_id_fk;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
