/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Exposicion;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author EDU
 */
public class GaleriaExposiciones extends javax.swing.JFrame {

    /**
     * Creates new form GaleriaExposiciones
     */
    public GaleriaExposiciones() {
        initComponents();
    }
    
      private JPanel panelImagenes;


    public GaleriaExposiciones(List<Exposicion> exposiciones) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Imágenes de Exposiciones");
        setSize(800, 600);

        panelImagenes = new JPanel();
        panelImagenes.setLayout(new BoxLayout(panelImagenes, BoxLayout.Y_AXIS));
        panelImagenes.setBackground(Color.WHITE); // Establecer el fondo del panel en blanco

        mostrarImagenes(exposiciones);

        JScrollPane scrollPane = new JScrollPane(panelImagenes);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);
    }

    private void mostrarImagenes(List<Exposicion> exposiciones) {
        for (Exposicion exposicion : exposiciones) {
            byte[] fotoBytes = exposicion.getFoto();
            if (fotoBytes != null) {
                ImageIcon iconoOriginal = new ImageIcon(fotoBytes);

                // Escalar la imagen a un tamaño fijo (200x200 píxeles, por ejemplo)
                Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);

                // Crear un nuevo ImageIcon con la imagen escalada y bordes resaltados
                ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

                // Crear un panel para agrupar la imagen, el nombre y la descripción verticalmente
                JPanel panelExposicion = new JPanel();
                panelExposicion.setLayout(new BoxLayout(panelExposicion, BoxLayout.Y_AXIS));
                panelExposicion.setBackground(Color.WHITE); // Color de fondo blanco para el panel de la exposición

                // Agregar el icono con un margen a un JLabel
                JLabel etiquetaImagen = new JLabel(iconoEscalado);
                etiquetaImagen.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2)); // Bordes resaltados
                etiquetaImagen.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Centrar horizontalmente

                // Crear JLabel para el nombre
                JLabel etiquetaNombre = new JLabel(exposicion.getNombre_exposicion());
                etiquetaNombre.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Centrar horizontalmente
                etiquetaNombre.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16)); // Fuente en negrita, tamaño 16

                // Crear JTextArea para la descripción
                JTextArea areaDescripcion = new JTextArea(exposicion.getDescripcion_exposicion());
                areaDescripcion.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Centrar horizontalmente
                areaDescripcion.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14)); // Tamaño 14 para la descripción
                areaDescripcion.setWrapStyleWord(true); // Ajustar palabras al final de la línea
                areaDescripcion.setLineWrap(true); // Ajustar texto en múltiples líneas
                areaDescripcion.setEditable(false); // Hacer el área de texto de solo lectura

                // Centrar el texto horizontalmente en el JTextArea
                areaDescripcion.setAlignmentX(CENTER_ALIGNMENT);

                // Agregar los componentes al panel de la exposición
                panelExposicion.add(etiquetaImagen);
                panelExposicion.add(etiquetaNombre);
                panelExposicion.add(areaDescripcion);

                // Agregar el panel de la exposición al panel general
                panelImagenes.add(panelExposicion);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
