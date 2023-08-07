/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;


public class Mantenimiento {
    
    private String codigo_mantenimiento;
    private String descripcion_mantenimiento;
    private Date Fecha_mantenimiento;
    private String id_restaurador;
    private String id_pintura;

    public Mantenimiento(String codigo_mantenimiento, String descripcion_mantenimiento, Date Fecha_mantenimiento, String id_restaurador, String id_pintura) {
        this.codigo_mantenimiento = codigo_mantenimiento;
        this.descripcion_mantenimiento = descripcion_mantenimiento;
        this.Fecha_mantenimiento = Fecha_mantenimiento;
        this.id_restaurador = id_restaurador;
        this.id_pintura = id_pintura;
    }

    public Mantenimiento() {
    }

    public String getCodigo_mantenimiento() {
        return codigo_mantenimiento;
    }

    public void setCodigo_mantenimiento(String codigo_mantenimiento) {
        this.codigo_mantenimiento = codigo_mantenimiento;
    }

    public String getDescripcion_mantenimiento() {
        return descripcion_mantenimiento;
    }

    public void setDescripcion_mantenimiento(String descripcion_mantenimiento) {
        this.descripcion_mantenimiento = descripcion_mantenimiento;
    }

    public Date getFecha_mantenimiento() {
        return Fecha_mantenimiento;
    }

    public void setFecha_mantenimiento(Date Fecha_mantenimiento) {
        this.Fecha_mantenimiento = Fecha_mantenimiento;
    }

    public String getId_restaurador() {
        return id_restaurador;
    }

    public void setId_restaurador(String id_restaurador) {
        this.id_restaurador = id_restaurador;
    }

    public String getId_pintura() {
        return id_pintura;
    }

    public void setId_pintura(String id_pintura) {
        this.id_pintura = id_pintura;
    }

    @Override
    public String toString() {
        return "Mantenimiento{" + "codigo_mantenimiento=" + codigo_mantenimiento + ", descripcion_mantenimiento=" + descripcion_mantenimiento + ", Fecha_mantenimiento=" + Fecha_mantenimiento + ", id_restaurador=" + id_restaurador + ", id_pintura=" + id_pintura + '}';
    }

    
    
    
}
