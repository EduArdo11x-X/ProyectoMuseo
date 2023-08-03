/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Artista extends Persona {
    
    private String Id_artista;
    private String Habilidades;
    private String Nombre_artistico;

    public Artista(String Id_artista, String Habilidades, String Nombre_artistico) {
        this.Id_artista = Id_artista;
        this.Habilidades = Habilidades;
        this.Nombre_artistico = Nombre_artistico;
    }

    public Artista(String Id_artista, String Habilidades, String Nombre_artistico, String cedula, String nombre, String apellido, Date F_nacimiento, String num_telefono, char genero, String provincia, String ciudad, String calle, String correo, String contraseña) {
        super(cedula, nombre, apellido, F_nacimiento, num_telefono, genero, provincia, ciudad, calle, correo, contraseña);
        this.Id_artista = Id_artista;
        this.Habilidades = Habilidades;
        this.Nombre_artistico = Nombre_artistico;
    }

    public Artista() {
    }

    public String getId_artista() {
        return Id_artista;
    }

    public void setId_artista(String Id_artista) {
        this.Id_artista = Id_artista;
    }

    public String getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String Habilidades) {
        this.Habilidades = Habilidades;
    }

    public String getNombre_artistico() {
        return Nombre_artistico;
    }

    public void setNombre_artistico(String Nombre_artistico) {
        this.Nombre_artistico = Nombre_artistico;
    }

    @Override
    public String toString() {
        return "Artista{" + "Id_artista=" + Id_artista + ", Habilidades=" + Habilidades + ", Nombre_artistico=" + Nombre_artistico + '}';
    }
    
    
    
    
}
