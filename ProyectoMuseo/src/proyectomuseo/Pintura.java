/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomuseo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Pintura {

    private String cod_arte_pintura;
    private String nombre_pintura;
    private Date  fecha_creacion_pintura;
    private String descripcion_pintura;
    private String tipo_pintura;
    private String estilo_pintura;

    public Pintura(String cod_arte_pintura, String nombre_pintura, Date fecha_creacion_pintura, String descripcion_pintura, String tipo_pintura, String estilo_pintura) {
        this.cod_arte_pintura = cod_arte_pintura;
        this.nombre_pintura = nombre_pintura;
        this.fecha_creacion_pintura = fecha_creacion_pintura;
        this.descripcion_pintura = descripcion_pintura;
        this.tipo_pintura = tipo_pintura;
        this.estilo_pintura = estilo_pintura;
    }
    

    public Pintura() {
    }

   

    public String getCod_arte_pintura() {
        return cod_arte_pintura;
    }

    public void setCod_arte_pintura(String cod_arte_pintura) {
        this.cod_arte_pintura = cod_arte_pintura;
    }

    public String getNombre_pintura() {
        return nombre_pintura;
    }

    public void setNombre_pintura(String nombre_pintura) {
        this.nombre_pintura = nombre_pintura;
    }

    public Date getFecha_creacion_pintura() {
        return fecha_creacion_pintura;
    }

    public void setFecha_creacion_pintura(Date fecha_creacion_pintura) {
        this.fecha_creacion_pintura = fecha_creacion_pintura;
    }

    public String getDescripcion_pintura() {
        return descripcion_pintura;
    }

    public void setDescripcion_pintura(String descripcion_pintura) {
        this.descripcion_pintura = descripcion_pintura;
    }

    public String getTipo_pintura() {
        return tipo_pintura;
    }

    public void setTipo_pintura(String tipo_pintura) {
        this.tipo_pintura = tipo_pintura;
    }

    public String getEstilo_pintura() {
        return estilo_pintura;
    }

    public void setEstilo_pintura(String estilo_pintura) {
        this.estilo_pintura = estilo_pintura;
    }

    @Override
    public String toString() {
        return "Pintura{" + "cod_arte_pintura=" + cod_arte_pintura + ", nombre_pintura=" + nombre_pintura + ", fecha_creacion_pintura=" + fecha_creacion_pintura + ", descripcion_pintura=" + descripcion_pintura + ", tipo_pintura=" + tipo_pintura + ", estilo_pintura=" + estilo_pintura + '}';
    }

}
