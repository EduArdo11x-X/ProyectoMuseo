package proyectomuseo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS TUF
 */
import com.db4o.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS TUF
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

      ObjectContainer Baseprincipal = Db4o.openFile("C:\\Users\\ASUS TUF\\OneDrive\\Imágenes\\Base_ProyectoMuseo\\base_MUSEO.yap");

    }
}
