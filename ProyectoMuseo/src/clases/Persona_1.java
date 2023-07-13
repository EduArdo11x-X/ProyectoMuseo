/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ASUS TUF
 */
public class Persona_1 {

    private String cedula;
    private String nombre;
    private String apellido;
    private Date F_nacimiento;
    private int num_telefono;
    private String provincia;
    private String ciudad;
    private String calle;
    private String correo;
    private char genero;

    public Persona_1() {
    }

    public Persona_1(String cedula, String nombre, String apellido, Date F_nacimiento, int num_telefono, String provincia, String ciudad, String calle, String correo, char genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.F_nacimiento = F_nacimiento;
        this.num_telefono = num_telefono;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.correo = correo;
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getF_nacimiento() {
        return F_nacimiento;
    }

    public void setF_nacimiento(Date F_nacimiento) {
        this.F_nacimiento = F_nacimiento;
    }

    public int getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(int num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona_1{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", F_nacimiento=" + F_nacimiento + ", num_telefono=" + num_telefono + ", provincia=" + provincia + ", ciudad=" + ciudad + ", calle=" + calle + ", correo=" + correo + ", genero=" + genero + '}';
    }

}
