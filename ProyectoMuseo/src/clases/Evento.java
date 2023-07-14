/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author EDU
 */
public class Evento {
    private String id_evento;
    private String nombre_evento;
    private Date fecha_inicio;
    private Date fecha_final;

    public Evento() {
    }

    public Evento(String id_evento, String nombre_evento, Date fecha_inicio, Date fecha_final) {
        this.id_evento = id_evento;
        this.nombre_evento = nombre_evento;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
    }

    public String getId_evento() {
        return id_evento;
    }

    public void setId_evento(String id_evento) {
        this.id_evento = id_evento;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    @Override
    public String toString() {
        return "Evento{" + "id_evento=" + id_evento + ", nombre_evento=" + nombre_evento + ", fecha_inicio=" + fecha_inicio + ", fecha_final=" + fecha_final + '}';
    }
    
    
}
