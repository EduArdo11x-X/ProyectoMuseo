package Interfaces;

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

    
    private static void cerrarB(ObjectContainer Baseprincipal){
        Baseprincipal.close();
    }
}
