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
public class Artista extends Persona_1 {

    private String habilidadad;

    public Artista(String habilidadad, String cedula, String nombre, String apellido, Date F_nacimiento, int num_telefono, String provincia, String ciudad, String calle, String correo, String genero) {
        super(cedula, nombre, apellido, F_nacimiento, num_telefono, provincia, ciudad, calle, correo, genero);
        this.habilidadad = habilidadad;
    }

    public Artista() {
    }

    public String getHabilidadad() {
        return habilidadad;
    }

    public void setHabilidadad(String habilidadad) {
        this.habilidadad = habilidadad;
    }

    @Override
    public String toString() {
        return "Artista{" + "habilidadad=" + habilidadad + '}';
    }



}
