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
public class Reserva {
    
    private int id;
    
    private int usuario_id_fk;
    
    private Date fecha_reserva;
    
    private Time hora_reserva;

    public Reserva(int id, int usuario_id_fk, Date fecha_reserva, Time hora_reserva) {
        this.id = id;
        this.usuario_id_fk = usuario_id_fk;
        this.fecha_reserva = fecha_reserva;
        this.hora_reserva = hora_reserva;
    }

    public Reserva() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id_fk() {
        return usuario_id_fk;
    }

    public void setUsuario_id_fk(int usuario_id_fk) {
        this.usuario_id_fk = usuario_id_fk;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public Time getHora_reserva() {
        return hora_reserva;
    }

    public void setHora_reserva(Time hora_reserva) {
        this.hora_reserva = hora_reserva;
    }
    
    
}
