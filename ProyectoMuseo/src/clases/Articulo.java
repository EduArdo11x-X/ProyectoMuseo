/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author EDU
 */
public class Articulo {
    
    private String cod_articulo;
    private String nombre;
    private String descripcion;
    private int existencia;
    private int exis_max;
    private int exis_min;        
    private double precio;

    public Articulo() {
    }

    public Articulo(String cod_articulo, String nombre, String descripcion, int existencia, int exis_max, int exis_min, double precio) {
        this.cod_articulo = cod_articulo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.exis_max = exis_max;
        this.exis_min = exis_min;
        this.precio = precio;
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

    @Override
    public String toString() {
        return "Articulo{" + "cod_articulo=" + cod_articulo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", existencia=" + existencia + ", exis_max=" + exis_max + ", exis_min=" + exis_min + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
