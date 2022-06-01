/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author jr972
 */
public class Funcion {
    
    private int id;
    
    private String codigo;
    
    private Date fecha;
    
    private Time hora;
    
    private int teatro_id_fk;
    
    private int sala_id_fk;
    
    private int obra_id_fk;

    public Funcion(int id, String codigo, Date fecha, Time hora, int teatro_id_fk, int sala_id_fk, int obra_id_fk) {
        this.id = id;
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.teatro_id_fk = teatro_id_fk;
        this.sala_id_fk = sala_id_fk;
        this.obra_id_fk = obra_id_fk;
    }

    public Funcion() {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getTeatro_id_fk() {
        return teatro_id_fk;
    }

    public void setTeatro_id_fk(int teatro_id_fk) {
        this.teatro_id_fk = teatro_id_fk;
    }

    public int getSala_id_fk() {
        return sala_id_fk;
    }

    public void setSala_id_fk(int sala_id_fk) {
        this.sala_id_fk = sala_id_fk;
    }

    public int getObra_id_fk() {
        return obra_id_fk;
    }

    public void setObra_id_fk(int obra_id_fk) {
        this.obra_id_fk = obra_id_fk;
    }
    
    
    
}
