/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Administrador;
import clases.Artista;
import clases.Guardia;
import clases.Restaurador;
import clases.Usuario;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;

public class ReporteGrafico extends javax.swing.JFrame {

      public ReporteGrafico() {
        initComponents();
        DefaultPieDataset datos = new DefaultPieDataset();
        obtenerDatosDesdeBD(datos);

        JFreeChart grafico_circular = ChartFactory.createPieChart("REPORTE DE PERSONAS", datos, true, true, false);
        ChartPanel panel = new ChartPanel(grafico_circular);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(543, 446));

        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(panel, BorderLayout.CENTER);

        pack();
        repaint();
        
        actualizarGrafica();
    }
//    int adm = 20;
//    int usu = 20;
//    int art = 20;
//    int guard = 20;
//    int rest = 20;
//    public ReporteGrafico() {
//        initComponents();
//         DefaultPieDataset datos = new DefaultPieDataset();
//        datos.setValue("ADMINISTRADOR", adm);
//        datos.setValue("USUARIOS",usu);
//        datos.setValue("ARTISTAS",art);
//        datos.setValue("GUARDIAS", guard);
//        datos.setValue("RESTAURADOR", rest);
//        
//        JFreeChart grafico_circular = ChartFactory.createPieChart("REPORTE DE PERSONAS", datos, true, true, false);
//        ChartPanel panel = new ChartPanel(grafico_circular);
//        panel.setMouseWheelEnabled(true);
//        panel.setPreferredSize(new Dimension(543, 446));
//        
//        jPanel1.setLayout(new BorderLayout());
//        jPanel1.add(panel, BorderLayout.CENTER);
//        
//        pack();
//        repaint();

    private void actualizarGrafica() {
        DefaultPieDataset datos = new DefaultPieDataset();
        obtenerDatosDesdeBD(datos);

        // Obtiene el ChartPanel agregado previamente a jPanel1
        ChartPanel chartPanel = (ChartPanel) jPanel1.getComponent(0);
        JFreeChart grafico_circular = chartPanel.getChart();

        // Obtiene el Plot (PiePlot) del gráfico circular
        PiePlot plot = (PiePlot) grafico_circular.getPlot();

        // Actualiza el dataset del gráfico reemplazando el dataset actual con el nuevo dataset
        plot.setDataset(datos);

        // Repintar la interfaz gráfica para reflejar los cambios
        jPanel1.revalidate();
        jPanel1.repaint();
    }

  

    private void obtenerDatosDesdeBD(DefaultPieDataset dataset) {
        ObjectContainer baseDatos = null;
        try {
            baseDatos = Db4o.openFile(PaginaPrincipal.direccionBD);
            Map<String, Integer> registroCounts = obtenerRegistroCounts(baseDatos);
            for (Map.Entry<String, Integer> entry : registroCounts.entrySet()) {
                String clase = entry.getKey();
                int count = entry.getValue();
                dataset.setValue(clase, count);
            }
        } finally {
            if (baseDatos != null) {
                baseDatos.close();
            }
        }
    }

    private Map<String, Integer> obtenerRegistroCounts(ObjectContainer baseDatos) {
        Map<String, Integer> registroCounts = new HashMap<>();

        // Consulta y cuenta los objetos de cada clase
        registroCounts.put("Administrador", contarRegistros(baseDatos, Administrador.class));
        registroCounts.put("Usuario", contarRegistros(baseDatos, Usuario.class));
        registroCounts.put("Artista", contarRegistros(baseDatos, Artista.class));
        registroCounts.put("Guardia", contarRegistros(baseDatos, Guardia.class));
        registroCounts.put("Restaurador", contarRegistros(baseDatos, Restaurador.class));

        return registroCounts;
    }

    private int contarRegistros(ObjectContainer baseDatos, Class<?> clase) {
        ObjectSet<?> result = baseDatos.queryByExample(clase);
        return result.size();
    }

                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReporteGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteGrafico().setVisible(true);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
