/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomuseo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ASUS TUF
 */
public class Artista extends Persona_1{
    private String id_artista;
    private String habilidadad;

    public Artista(String id_artista, String habilidadad, String cedula, String nombre, String apellido, Date F_nacimiento, int num_telefono, String provincia, String ciudad, String calle, String correo, String genero) {
        super(cedula, nombre, apellido, F_nacimiento, num_telefono, provincia, ciudad, calle, correo, genero);
        this.id_artista = id_artista;
        this.habilidadad = habilidadad;
    }

    public Artista() {
    }

    public String getId_artista() {
        return id_artista;
    }

    public void setId_artista(String id_artista) {
        this.id_artista = id_artista;
    }

    public String getHabilidadad() {
        return habilidadad;
    }

    public void setHabilidadad(String habilidadad) {
        this.habilidadad = habilidadad;
    }

    @Override
    public String toString() {
        return "Artista{" + "id_artista=" + id_artista + ", habilidadad=" + habilidadad + '}';
    }

    
    

    
}
