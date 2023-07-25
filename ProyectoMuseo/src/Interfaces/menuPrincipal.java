/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import static java.awt.Color.black;
import com.db4o.*;

/**
 *
 * @author EDU
 */
public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logotipo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ingresarU = new javax.swing.JMenuItem();
        modificarU = new javax.swing.JMenuItem();
        eliminarU = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ingresarA = new javax.swing.JMenuItem();
        modificarA = new javax.swing.JMenuItem();
        eliminarA = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ingresarP = new javax.swing.JMenuItem();
        modificarP = new javax.swing.JMenuItem();
        eliminarP = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        ingresarES = new javax.swing.JMenuItem();
        modificarES = new javax.swing.JMenuItem();
        eliminarES = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ingresarSA = new javax.swing.JMenuItem();
        modificarSA = new javax.swing.JMenuItem();
        eliminarSA = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        ingresarEX = new javax.swing.JMenuItem();
        modificarEX = new javax.swing.JMenuItem();
        eliminarEX = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        ingresarEVE = new javax.swing.JMenuItem();
        modificarEVE = new javax.swing.JMenuItem();
        eliminarEVE = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        ingresarBO = new javax.swing.JMenuItem();
        modificarBO = new javax.swing.JMenuItem();
        eliminarBO = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        ingresarAD = new javax.swing.JMenuItem();
        modificarAD = new javax.swing.JMenuItem();
        eliminarAD = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicio.setBackground(new java.awt.Color(215, 205, 176));
        inicio.setPreferredSize(new java.awt.Dimension(500, 700));
        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("MUSEO MODERNO DE CUENCA");
        inicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 590, 70));

        logotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logotipo.png"))); // NOI18N
        logotipo.setText("jLabel2");
        inicio.add(logotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 250, 240));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Fondo.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        inicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 430));

        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 430));

        jMenu1.setText("USUARIOS");

        ingresarU.setText("INGRESAR ");
        ingresarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarUMouseClicked(evt);
            }
        });
        jMenu1.add(ingresarU);

        modificarU.setText("MODIFICAR");
        modificarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarUMouseClicked(evt);
            }
        });
        jMenu1.add(modificarU);

        eliminarU.setText("BUSCAR - ELIMINAR");
        eliminarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarUMouseClicked(evt);
            }
        });
        jMenu1.add(eliminarU);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("ARTICULOS");

        ingresarA.setText("INGRESAR ");
        ingresarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarAMouseClicked(evt);
            }
        });
        jMenu2.add(ingresarA);

        modificarA.setText("MODIFICAR");
        modificarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarAMouseClicked(evt);
            }
        });
        jMenu2.add(modificarA);

        eliminarA.setText("BUSCAR - ELIMINAR");
        eliminarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarAMouseClicked(evt);
            }
        });
        jMenu2.add(eliminarA);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("PINTURA");

        ingresarP.setText("INGRESAR ");
        ingresarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarPMouseClicked(evt);
            }
        });
        ingresarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarPActionPerformed(evt);
            }
        });
        jMenu3.add(ingresarP);

        modificarP.setText("MODIFICAR");
        modificarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarPMouseClicked(evt);
            }
        });
        jMenu3.add(modificarP);

        eliminarP.setText("BUSCAR - ELIMINAR");
        eliminarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarPMouseClicked(evt);
            }
        });
        jMenu3.add(eliminarP);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("ESCULTURAS");

        ingresarES.setText("INGRESAR ");
        ingresarES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarESMouseClicked(evt);
            }
        });
        jMenu4.add(ingresarES);

        modificarES.setText("MODIFICAR");
        modificarES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarESMouseClicked(evt);
            }
        });
        jMenu4.add(modificarES);

        eliminarES.setText("BUSCAR - ELIMINAR");
        eliminarES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarESMouseClicked(evt);
            }
        });
        jMenu4.add(eliminarES);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("SALAS");

        ingresarSA.setText("INGRESAR ");
        jMenu5.add(ingresarSA);

        modificarSA.setText("MODIFICAR");
        jMenu5.add(modificarSA);

        eliminarSA.setText("BUSCAR - ELIMINAR");
        jMenu5.add(eliminarSA);

        jMenuBar1.add(jMenu5);

        jMenu9.setText("EXPOSICIONES");

        ingresarEX.setText("INGRESAR ");
        ingresarEX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarEXMouseClicked(evt);
            }
        });
        jMenu9.add(ingresarEX);

        modificarEX.setText("MODIFICAR");
        modificarEX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarEXMouseClicked(evt);
            }
        });
        jMenu9.add(modificarEX);

        eliminarEX.setText("BUSCAR - ELIMINAR");
        eliminarEX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarEXMouseClicked(evt);
            }
        });
        jMenu9.add(eliminarEX);

        jMenuBar1.add(jMenu9);

        jMenu6.setText("EVENTOS");

        ingresarEVE.setText("INGRESAR ");
        ingresarEVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarEVEMouseClicked(evt);
            }
        });
        jMenu6.add(ingresarEVE);

        modificarEVE.setText("MODIFICAR");
        modificarEVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarEVEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarEVEMouseEntered(evt);
            }
        });
        jMenu6.add(modificarEVE);

        eliminarEVE.setText("BUSCAR - ELIMINAR");
        eliminarEVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarEVEMouseClicked(evt);
            }
        });
        jMenu6.add(eliminarEVE);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("BOLETO");

        ingresarBO.setText("INGRESAR ");
        jMenu7.add(ingresarBO);

        modificarBO.setText("MODIFICAR");
        jMenu7.add(modificarBO);

        eliminarBO.setText("BUSCAR - ELIMINAR");
        jMenu7.add(eliminarBO);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("ADMINISTRADORES");

        ingresarAD.setText("INGRESAR ");
        jMenu8.add(ingresarAD);

        modificarAD.setText("MODIFICAR");
        jMenu8.add(modificarAD);

        eliminarAD.setText("BUSCAR - ELIMINAR");
        jMenu8.add(eliminarAD);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarPMouseClicked

        this.dispose();
        Pintura_Interfaz ingresarPintura = new Pintura_Interfaz();
        ingresarPintura.setVisible(true);

    }//GEN-LAST:event_ingresarPMouseClicked

    private void modificarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarPMouseClicked
        this.dispose();
        Pintura_modificar modificarPintura = new Pintura_modificar();
        modificarPintura.setVisible(true);
    }//GEN-LAST:event_modificarPMouseClicked

    private void eliminarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarPMouseClicked
        this.dispose();
        Pintura_buscar_modificar eliminarPintura = new Pintura_buscar_modificar();
        eliminarPintura.setVisible(true);

    }//GEN-LAST:event_eliminarPMouseClicked

    private void ingresarEXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarEXMouseClicked
        this.dispose();
        Exposicion_registro ingresarExposicion = new Exposicion_registro();
        ingresarExposicion.setVisible(true);
    }//GEN-LAST:event_ingresarEXMouseClicked


    private void modificarEXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarEXMouseClicked

        this.dispose();
        Exposicion_modificar modificarExposicion = new Exposicion_modificar();
        modificarExposicion.setVisible(true);
    }//GEN-LAST:event_modificarEXMouseClicked

    private void eliminarEXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarEXMouseClicked
        this.dispose();
        Exposicion_buscar_eliminar eliminarExposicion = new Exposicion_buscar_eliminar();
        eliminarExposicion.setVisible(true);

    }//GEN-LAST:event_eliminarEXMouseClicked

    private void ingresarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarPActionPerformed

    private void ingresarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarUMouseClicked
        this.dispose();
        Usuario_registro registroUsuario = new Usuario_registro();
        registroUsuario.setVisible(true);
    }//GEN-LAST:event_ingresarUMouseClicked

    private void modificarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarUMouseClicked

        this.dispose();
        Usuario_modificar modificarUsuario = new Usuario_modificar();
        modificarUsuario.setVisible(true);
    }//GEN-LAST:event_modificarUMouseClicked

    private void eliminarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarUMouseClicked
        this.dispose();
        Usuario_buscar_eliminar eliminarUsuario = new Usuario_buscar_eliminar();
        eliminarUsuario.setVisible(true);

    }//GEN-LAST:event_eliminarUMouseClicked

    private void ingresarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarAMouseClicked
        this.dispose();
        Articulo_registro registroArticulo = new Articulo_registro();
        registroArticulo.setVisible(true);
    }//GEN-LAST:event_ingresarAMouseClicked

    private void modificarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarAMouseClicked
        this.dispose();
        Articulo_modificar modificarArticulo = new Articulo_modificar();
        modificarArticulo.setVisible(true);
    }//GEN-LAST:event_modificarAMouseClicked

    private void eliminarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarAMouseClicked

        this.dispose();
        Articulo_buscar_eliminar eliminarArticulo = new Articulo_buscar_eliminar();
        eliminarArticulo.setVisible(true);
    }//GEN-LAST:event_eliminarAMouseClicked

    private void ingresarESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarESMouseClicked
        this.dispose();
        Escultura_registro registroEscultura = new Escultura_registro();
        registroEscultura.setVisible(true);


    }//GEN-LAST:event_ingresarESMouseClicked

    private void modificarESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarESMouseClicked

        this.dispose();
        Escultura_modificar modificarEscultura = new Escultura_modificar();
        modificarEscultura.setVisible(true);

    }//GEN-LAST:event_modificarESMouseClicked

    private void eliminarESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarESMouseClicked
        this.dispose();
        Escultura_buscar_eliminar eliminarEscultura = new Escultura_buscar_eliminar();
        eliminarEscultura.setVisible(true);
    }//GEN-LAST:event_eliminarESMouseClicked

    private void ingresarEVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarEVEMouseClicked

        this.dispose();
        Evento_registro registroEvento = new Evento_registro();
        registroEvento.setVisible(true);
    }//GEN-LAST:event_ingresarEVEMouseClicked

    private void modificarEVEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarEVEMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarEVEMouseEntered

    private void modificarEVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarEVEMouseClicked
        this.dispose();
        Evento_modificar modificarEvento = new Evento_modificar();
        modificarEvento.setVisible(true);
    }//GEN-LAST:event_modificarEVEMouseClicked

    private void eliminarEVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarEVEMouseClicked
        this.dispose();
        Evento_buscar_eliminar eliminarEvento = new Evento_buscar_eliminar();
        eliminarEvento.setVisible(true);

    }//GEN-LAST:event_eliminarEVEMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem eliminarA;
    private javax.swing.JMenuItem eliminarAD;
    private javax.swing.JMenuItem eliminarBO;
    private javax.swing.JMenuItem eliminarES;
    private javax.swing.JMenuItem eliminarEVE;
    private javax.swing.JMenuItem eliminarEX;
    private javax.swing.JMenuItem eliminarP;
    private javax.swing.JMenuItem eliminarSA;
    private javax.swing.JMenuItem eliminarU;
    private javax.swing.JMenuItem ingresarA;
    private javax.swing.JMenuItem ingresarAD;
    private javax.swing.JMenuItem ingresarBO;
    private javax.swing.JMenuItem ingresarES;
    private javax.swing.JMenuItem ingresarEVE;
    private javax.swing.JMenuItem ingresarEX;
    private javax.swing.JMenuItem ingresarP;
    private javax.swing.JMenuItem ingresarSA;
    private javax.swing.JMenuItem ingresarU;
    private javax.swing.JPanel inicio;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logotipo;
    private javax.swing.JMenuItem modificarA;
    private javax.swing.JMenuItem modificarAD;
    private javax.swing.JMenuItem modificarBO;
    private javax.swing.JMenuItem modificarES;
    private javax.swing.JMenuItem modificarEVE;
    private javax.swing.JMenuItem modificarEX;
    private javax.swing.JMenuItem modificarP;
    private javax.swing.JMenuItem modificarSA;
    private javax.swing.JMenuItem modificarU;
    // End of variables declaration//GEN-END:variables
}
