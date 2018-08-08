package Vista;

import Controlador.Coordinador;
import Modelo.SystemVo;
import Modelo.UsuarioVo;
import com.placeholder.PlaceHolder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Login1 extends javax.swing.JFrame {

    private Coordinador miCoordinador;

    PlaceHolder hol;

    public Login1() {
        initComponents();
        setLocationRelativeTo(null);
        //   hol = new PlaceHolder(txtUser,"Ingresa tu Usuario");
        //   hol = new PlaceHolder(txtPass,"Password");

    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        //this.getUsuario(1);
    }

    public void getUsuario(Integer id_user) {
        UsuarioVo usuario = miCoordinador.buscarUsuario(id_user);
        this.imprimirUsuario(usuario);
    }

    public void imprimirUsuario(UsuarioVo usuario) {
        System.out.println(usuario.getFirstname());
        System.out.println(usuario.getLastname());
        System.out.println(usuario.getDirection());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jpDelantero = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnGo = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        BtnMinimize = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Administrador Login");
        setBackground(new java.awt.Color(51, 51, 51));
        setName("login"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDelantero.setBackground(new java.awt.Color(255, 255, 255));
        jpDelantero.setForeground(new java.awt.Color(133, 144, 162));
        jpDelantero.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        jpDelantero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        txtUser.setToolTipText("");
        txtUser.setBorder(null);
        txtUser.setCaretColor(new java.awt.Color(51, 51, 51));
        txtUser.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jpDelantero.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, -1));

        txtPass.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        txtPass.setBorder(null);
        txtPass.setCaretColor(new java.awt.Color(51, 51, 51));
        txtPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPass.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jpDelantero.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 259, 200, 20));

        btnGo.setBackground(new java.awt.Color(255, 255, 255));
        btnGo.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnGo.setForeground(new java.awt.Color(77, 83, 100));
        btnGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enter_Ios_32.png"))); // NOI18N
        btnGo.setText("Aceptar");
        btnGo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 68, 96)));
        btnGo.setContentAreaFilled(false);
        btnGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGo.setFocusPainted(false);
        btnGo.setMaximumSize(new java.awt.Dimension(104, 32));
        btnGo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Simple_Color_32.png"))); // NOI18N
        btnGo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Simple_Color_32.png"))); // NOI18N
        btnGo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Simple_Color_32.png"))); // NOI18N
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        jpDelantero.add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 130, 42));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(77, 83, 100));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Ios_32.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 68, 96)));
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Ios_Color_32.png"))); // NOI18N
        btnCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Ios_Color_32.png"))); // NOI18N
        btnCancel.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Ios_Color_32.png"))); // NOI18N
        btnCancel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Ios_Color_32.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jpDelantero.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 130, 40));

        jLabel2.setBackground(new java.awt.Color(144, 156, 172));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(133, 144, 162));
        jLabel2.setText("Iniciar Sesión");
        jpDelantero.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(121, 121, 125));
        jSeparator1.setFont(new java.awt.Font("Broadway", 0, 48)); // NOI18N
        jpDelantero.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 240, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User_Color_All_32.png"))); // NOI18N
        jpDelantero.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 30));

        jSeparator2.setBackground(new java.awt.Color(121, 121, 125));
        jSeparator2.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        jpDelantero.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 240, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Password_Color_32.png"))); // NOI18N
        jpDelantero.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        BtnMinimize.setBackground(new java.awt.Color(33, 44, 62));
        BtnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_W_32.png"))); // NOI18N
        BtnMinimize.setBorder(null);
        BtnMinimize.setBorderPainted(false);
        BtnMinimize.setContentAreaFilled(false);
        BtnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMinimize.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_WColor_32.png"))); // NOI18N
        BtnMinimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_WColor_32.png"))); // NOI18N
        BtnMinimize.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_WColor_32.png"))); // NOI18N
        BtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinimizeActionPerformed(evt);
            }
        });
        jpDelantero.add(BtnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 40, -1));

        BtnSalir.setBackground(new java.awt.Color(33, 44, 62));
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_32.png"))); // NOI18N
        BtnSalir.setBorder(null);
        BtnSalir.setContentAreaFilled(false);
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.setFocusPainted(false);
        BtnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_Color_32.png"))); // NOI18N
        BtnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_Color_32.png"))); // NOI18N
        BtnSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_Color_32.png"))); // NOI18N
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        jpDelantero.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 40, -1));

        getContentPane().add(jpDelantero, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 550, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Poin-Of-Sale.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 630, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed

        String myPass = new String(txtPass.getPassword());
        String usuario = txtUser.getText();
        System.out.println(usuario + " " + myPass);
        Inicio ini ;
        SystemVo miPersona = miCoordinador.buscarUser(usuario, myPass);

        if (miPersona.getUser() == null && miPersona.getPassword() == null) {
            JOptionPane.showMessageDialog(null, "El usuario no Existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            //ini.txtUsuario.setText(miPersona.getNombre() + " " + miPersona.getApellidos());
            //miCoordinador.mostrarPrincipal();
 ini = new Inicio();
            ini.setCoordinador(miCoordinador);
            ini.txtUsuario.setText(miPersona.getNombre() + " " + miPersona.getApellidos());
            ini.lbId.setText(miPersona.getId_user().toString());
            ini.show();
            dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void BtnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinimizeActionPerformed
        this.setExtendedState(ICONIFIED);

        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMinimizeActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMinimize;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpDelantero;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
