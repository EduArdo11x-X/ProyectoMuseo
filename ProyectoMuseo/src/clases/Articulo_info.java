/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author ASUS TUF
 */
public class Articulo_info {
    private String cod_articulo;
    private String nombre;
    private String descripcion;
    private int existencia;
    private int exis_max;
    private int exis_min;        
    private double precio;
    Date fecha;

    public Articulo_info() {
    }

    public Articulo_info(String cod_articulo, String nombre, String descripcion, int existencia, int exis_max, int exis_min, double precio, Date fecha) {
        this.cod_articulo = cod_articulo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.exis_max = exis_max;
        this.exis_min = exis_min;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getCod_articulo() {
        return cod_articulo;
    }

    public void setCod_articulo(String cod_articulo) {
        this.cod_articulo = cod_articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getExis_max() {
        return exis_max;
    }

    public void setExis_max(int exis_max) {
        this.exis_max = exis_max;
    }

    public int getExis_min() {
        return exis_min;
    }

    public void setExis_min(int exis_min) {
        this.exis_min = exis_min;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
