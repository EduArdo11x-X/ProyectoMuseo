package Interfaces;

import static Interfaces.LoginUsuario.Cerrar_BD;
import clases.Administrador;
import com.db4o.*;

import java.awt.Color;
import javax.swing.JOptionPane;

public class loggin extends javax.swing.JFrame {

    int xMouse, yMouse;

    public loggin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        nombreempresa = new javax.swing.JLabel();
        iniciarsesion = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        usuariotxt = new javax.swing.JTextField();
        txtcontrasena = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        passtxt = new javax.swing.JPasswordField();
        entrarbtn = new javax.swing.JPanel();
        entrartxt = new javax.swing.JLabel();
        cabecera = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        city = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 153));
        bg.setForeground(new java.awt.Color(102, 0, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreempresa.setBackground(new java.awt.Color(0, 0, 0));
        nombreempresa.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        nombreempresa.setForeground(new java.awt.Color(255, 255, 255));
        nombreempresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreempresa.setText("MUSEO MODERNO DE CUENCA");
        bg.add(nombreempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 280, -1));

        iniciarsesion.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N
        iniciarsesion.setForeground(new java.awt.Color(0, 0, 0));
        iniciarsesion.setText("INICIAR SESION");
        bg.add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        usuario.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("USUARIO");
        bg.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        separador.setForeground(new java.awt.Color(187, 187, 187));
        bg.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 360, 10));

        usuariotxt.setBackground(new java.awt.Color(255, 255, 255));
        usuariotxt.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        usuariotxt.setForeground(new java.awt.Color(0, 0, 0));
        usuariotxt.setText("Ingrese su nombre de usuario");
        usuariotxt.setBorder(null);
        usuariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariotxtMousePressed(evt);
            }
        });
        usuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariotxtActionPerformed(evt);
            }
        });
        bg.add(usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 360, 30));

        txtcontrasena.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        txtcontrasena.setForeground(new java.awt.Color(0, 0, 0));
        txtcontrasena.setText("CONTRASEÑA");
        bg.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        separador2.setForeground(new java.awt.Color(187, 187, 187));
        bg.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 360, 10));

        passtxt.setBackground(new java.awt.Color(255, 255, 255));
        passtxt.setForeground(new java.awt.Color(0, 0, 0));
        passtxt.setText("********");
        passtxt.setBorder(null);
        passtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passtxtMousePressed(evt);
            }
        });
        bg.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 360, 30));

        entrarbtn.setBackground(new java.awt.Color(0, 0, 255));
        entrarbtn.setForeground(new java.awt.Color(255, 255, 255));
        entrarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarbtnMouseExited(evt);
            }
        });

        entrartxt.setBackground(new java.awt.Color(0, 0, 0));
        entrartxt.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        entrartxt.setForeground(new java.awt.Color(255, 255, 255));
        entrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrartxt.setText("Iniciar Sesion");
        entrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout entrarbtnLayout = new javax.swing.GroupLayout(entrarbtn);
        entrarbtn.setLayout(entrarbtnLayout);
        entrarbtnLayout.setHorizontalGroup(
            entrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarbtnLayout.createSequentialGroup()
                .addComponent(entrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        entrarbtnLayout.setVerticalGroup(
            entrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(entrarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 406, -1, -1));

        cabecera.setBackground(new java.awt.Color(0, 153, 204));
        cabecera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabeceraMouseDragged(evt);
            }
        });
        cabecera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabeceraMousePressed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(0, 0, 204));

        exitTxt.setBackground(new java.awt.Color(255, 255, 255));
        exitTxt.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(255, 255, 255));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitbtnLayout.createSequentialGroup()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt)
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("¡Bienvenido Administrador!");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese con sus credenciales ");

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setForeground(new java.awt.Color(153, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/flecha-izquierda.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addGroup(cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabeceraLayout.createSequentialGroup()
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabeceraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)))
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addGroup(cabeceraLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bg.add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logotipo.png"))); // NOI18N
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ImagenMuseo.jpeg"))); // NOI18N
        bg.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 330, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariotxtActionPerformed

    private void cabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_cabeceraMousePressed

    private void cabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_cabeceraMouseDragged

    private void entrartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_entrartxtMouseExited

    private void entrartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_entrartxtMouseEntered

    private void entrarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarbtnMouseClicked

    }//GEN-LAST:event_entrarbtnMouseClicked

    private void entrarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarbtnMouseEntered

        entrarbtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_entrarbtnMouseEntered

    private void entrarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarbtnMouseExited
        entrarbtn.setBackground(new Color(0, 134, 190));          // TODO add your handling code here:
    }//GEN-LAST:event_entrarbtnMouseExited

    private void usuariotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariotxtMousePressed
        if (usuariotxt.getText().equals("Ingrese su nombre de usuario")) {

            usuariotxt.setText("");
            usuariotxt.setForeground(Color.black);
        }
        if (String.valueOf(passtxt.getPassword()).isEmpty()) {
            passtxt.setText("********");
            passtxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuariotxtMousePressed

    private void passtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMousePressed
        if (String.valueOf(passtxt.getPassword()).equals("********")) {
            passtxt.setText("");
            passtxt.setForeground(Color.black);
        }
        if (usuariotxt.getText().isEmpty()) {
            usuariotxt.setText("Ingrese su nombre de usuario");

            usuariotxt.setForeground(Color.gray);

        }


    }//GEN-LAST:event_passtxtMousePressed

    public void buscar_usuario(ObjectContainer BaseD) {
        String cedula = usuariotxt.getText();
        if (!cedula.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(null, "Ingrese su cédula por favor (10 dígitos)");
            return;
        }

        String contraseña = passtxt.getText();
        if (contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una contraseña");
            return;
        }

        clases.Administrador Exbuscar = new clases.Administrador(0.0, 0, null, cedula, null, null, null, null, '\u0000', null, null, null, null, contraseña);

        ObjectSet<Administrador> result = BaseD.queryByExample(Exbuscar);

        if (result.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El usuario no ha sido encontrado");
        } else {
            Administrador usuarioEncontrado = result.next();
            if (usuarioEncontrado.getContraseña().equals(contraseña)) {
                JOptionPane.showMessageDialog(this, "Ingreso exitoso");
                this.dispose();
                MENU_ADM ventaina = new MENU_ADM();
                ventaina.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
            }
        }

        Cerrar_BD(BaseD);
    }

    public static void Cerrar_BD(ObjectContainer BaseD) {

        BaseD.close();
    }


    private void entrartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtMouseClicked
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        buscar_usuario(BaseD);
        Cerrar_BD(BaseD);


    }//GEN-LAST:event_entrartxtMouseClicked

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitbtn.setBackground(Color.white);
        exitTxt.setBackground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitbtn.setBackground(Color.red);
        exitTxt.setBackground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxtMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        PaginaPrincipal ventaina = new PaginaPrincipal();
        ventaina.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//   public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        
//        
//        
//        
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
// 
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new loggin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cabecera;
    private javax.swing.JLabel city;
    private javax.swing.JPanel entrarbtn;
    private javax.swing.JLabel entrartxt;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JLabel iniciarsesion;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nombreempresa;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel txtcontrasena;
    private javax.swing.JLabel usuario;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
