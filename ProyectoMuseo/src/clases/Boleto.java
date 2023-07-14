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
public class Boleto {
    private String codigo;
    private double precio;
    private Date fecha_compra;
    private String existencia;

    public Boleto() {
    }

    public Boleto(String codigo, double precio, Date fecha_compra, String existencia) {
        this.codigo = codigo;
        this.precio = precio;
        this.fecha_compra = fecha_compra;
        this.existencia = existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Boleto{" + "codigo=" + codigo + ", precio=" + precio + ", fecha_compra=" + fecha_compra + ", existencia=" + existencia + '}';
    }
    
    
}
