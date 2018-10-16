package Vista;

import Controlador.Coordinador;
import Modelo.ConecRemoto;
import Modelo.HiloSync;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.UIManager;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Inicio extends javax.swing.JFrame {

    ConecRemoto remoto = new ConecRemoto();
    public int venta;
    public int local;
private Coordinador miCoordinador;
    private Dimension dim;
File documento = new File("src/Modelo/Consulta.txt");
    
public void setCoordinador(Coordinador miCoordinador) {
       this.miCoordinador = miCoordinador;
       venta = miCoordinador.getLastCompra();
       
    }

    public Inicio() {
        this.setResizable(false);
        initComponents();   
       this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        
    }

    public boolean estacerrado(Object obj) {
        JInternalFrame[] activos = escritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
                JOptionPane.showMessageDialog(this, "Otra ventana se encuentra \nya  abierta !!!", "Aviso", 0,
                        new ImageIcon(getClass().getResource("/Imagenes/adver1.png")));
            }
            i++;
        }
        return cerrado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/nuevaimagen.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProduct = new javax.swing.JMenu();
        addProduct = new javax.swing.JMenuItem();
        updateProduct = new javax.swing.JMenuItem();
        menuColors = new javax.swing.JMenu();
        itemViewColor = new javax.swing.JMenuItem();
        itemAddColor = new javax.swing.JMenuItem();
        menuUsers = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menuSale = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        itemSale = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        inventario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        escritorio.setBackground(new java.awt.Color(0, 65, 92));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        txtUsuario.setEditable(false);
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbId.setEnabled(false);
        lbId.setVisible(false);

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lbId, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(494, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jMenuBar1.setName(""); // NOI18N
        jMenuBar1.setOpaque(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(263, 50));
        jMenuBar1.setRequestFocusEnabled(false);

        menuProduct.setBorder(null);
        menuProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_producto.png"))); // NOI18N
        menuProduct.setText("Productos");
        menuProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_add.png"))); // NOI18N
        addProduct.setText("Agregar nuevo");
        addProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProductMouseClicked(evt);
            }
        });
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });
        menuProduct.add(addProduct);

        updateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_actualizar.png"))); // NOI18N
        updateProduct.setText("Actualizar producto");
        updateProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateProductMouseClicked(evt);
            }
        });
        updateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductActionPerformed(evt);
            }
        });
        menuProduct.add(updateProduct);

        jMenuBar1.add(menuProduct);
        menuProduct.getAccessibleContext().setAccessibleDescription("");

        menuColors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_color.png"))); // NOI18N
        menuColors.setText("Colores");
        menuColors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuColors.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemViewColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_colores.png"))); // NOI18N
        itemViewColor.setText("Ver Lista");
        itemViewColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemViewColorActionPerformed(evt);
            }
        });
        menuColors.add(itemViewColor);

        itemAddColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_addcolor.png"))); // NOI18N
        itemAddColor.setText("Agregar Color");
        itemAddColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddColorActionPerformed(evt);
            }
        });
        menuColors.add(itemAddColor);

        jMenuBar1.add(menuColors);

        menuUsers.setBorder(null);
        menuUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_usuario.png"))); // NOI18N
        menuUsers.setText("Usuarios");
        menuUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuUsers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_usuarios.png"))); // NOI18N
        jMenuItem1.setText("Lista Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuUsers.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_agregar.png"))); // NOI18N
        jMenuItem3.setText("Agregar Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuUsers.add(jMenuItem3);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_vendedor.png"))); // NOI18N
        jMenuItem7.setText("Agregar Vendedor");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuUsers.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_list_vendedor.png"))); // NOI18N
        jMenuItem8.setText("Vendedores");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuUsers.add(jMenuItem8);

        jMenuBar1.add(menuUsers);

        menuSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_venta.png"))); // NOI18N
        menuSale.setText("Ventas");
        menuSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_pago.png"))); // NOI18N
        jMenuItem2.setText("Realizar Venta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuSale.add(jMenuItem2);

        itemSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_ventas.png"))); // NOI18N
        itemSale.setText("Lista de Ventas");
        itemSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaleActionPerformed(evt);
            }
        });
        menuSale.add(itemSale);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_credito.png"))); // NOI18N
        jMenuItem5.setText("Creditos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuSale.add(jMenuItem5);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nota.png"))); // NOI18N
        jMenuItem9.setText("Notas Crédito");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuSale.add(jMenuItem9);

        jMenuBar1.add(menuSale);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_reporte.png"))); // NOI18N
        jMenu1.setText("Reportes");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_reportes.png"))); // NOI18N
        inventario.setText("Generar Reportes");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });
        jMenu1.add(inventario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_invent.png"))); // NOI18N
        jMenu2.setText("Inventario");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_tienda.png"))); // NOI18N
        jMenuItem6.setText("Inventario por tienda");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_transfer.png"))); // NOI18N
        jMenuItem4.setText("Traspasos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Productos pt;
    private void updateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductActionPerformed

        if (estacerrado(pt)) {

            pt = new Productos();
            pt.setCoordinador(miCoordinador);

            escritorio.add(pt).setLocation(100, 0);
            pt.show();

           
        }
    }//GEN-LAST:event_updateProductActionPerformed
    DetalleVenta dv;
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (estacerrado(dv)) {
            dv = new DetalleVenta();
            dv.setCoordinador(miCoordinador);
            dv.txtVendedor.setText(txtUsuario.getText());
            dv.lbIdVendedor.setText(lbId.getText());   
            dv.id_venta = venta;
            escritorio.add(dv).setLocation(25, 3);
            dv.show();

            try {
                dv.setMaximum(true);

                // TODO add your handling code here:
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
// miCoordinador.getDetalle().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    Reportes rp;
    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        if (estacerrado(dv)) {
            rp = new Reportes();
            rp.setCoordinador(miCoordinador);
            escritorio.add(rp).setLocation(300, 30);
            rp.show();

        }
    }//GEN-LAST:event_inventarioActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        if (estacerrado(pt)) {

            pt = new Productos();
            pt.setCoordinador(miCoordinador);
            escritorio.add(pt).setLocation(100, 0);
            pt.show();

          
        }
//miCoordinador.getProductos().setVisible(true); 
    }//GEN-LAST:event_addProductActionPerformed

    private void addProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addProductMouseClicked

    private void updateProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateProductMouseClicked

    }//GEN-LAST:event_updateProductMouseClicked
Inventario in;
    Colores cl;
    private void itemViewColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemViewColorActionPerformed
        if (estacerrado(cl)) {
            cl = new Colores();
            cl.setCoordinador(miCoordinador);
            cl.setSize(600, 575);
            escritorio.add(cl).setLocation(350, 0);
            /*
            dim = super.getToolkit().getScreenSize();
            
            */
            cl.show();
            //cl.show(true);
            
        }
    }//GEN-LAST:event_itemViewColorActionPerformed
    Usuarios us;
    Ventas vt;
    VentaCredito vc;
    private void itemAddColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddColorActionPerformed
        if (estacerrado(cl)) {
            cl = new Colores();
            cl.setCoordinador(miCoordinador);
            cl.setSize(600, 575);
            escritorio.add(cl).setLocation(350, 0);
            cl.show();
           
        }
    }//GEN-LAST:event_itemAddColorActionPerformed
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (estacerrado(us)) {
            us = new Usuarios();
            us.setCoordinador(miCoordinador);
         //   escritorio.add(us).setSize(856, 514);
            escritorio.add(us).setLocation(25, 3);
            us.show();
            try {
                us.setMaximum(true);

                // TODO add your handling code here:
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void itemSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaleActionPerformed
        if (estacerrado(vt)) {
            vt = new Ventas();
            vt.setCoordinador(miCoordinador);
            escritorio.add(vt).setLocation(25, 3);
            vt.show();

            try {
                vt.setMaximum(true);

                // TODO add your handling code here:
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_itemSaleActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this, "Esta a punto de salir\nde la aplicación.\n¿Desea continuar?", "Cerrar", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/adver1.png"))) == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            this.setDefaultCloseOperation(0);
        }
    }//GEN-LAST:event_formWindowClosing
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        HiloSync.ejecutaTareaCadaXTiempo();
    }//GEN-LAST:event_formWindowOpened
Usuario usua;
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
   if (estacerrado(usua)) {
            usua = new Usuario();
            usua.setCoordinador(miCoordinador);
            usua.setSize(670, 400);
            escritorio.add(usua).setLocation(300, 0);
            usua.show();
           
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed
Traspasos tr;
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
          if (estacerrado(tr)) {
            tr = new Traspasos();
            tr.setCoordinador(miCoordinador);
            escritorio.add(tr).setLocation(50, 0);
            tr.show();

        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed
UsuariosCredito usu;
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
   if (estacerrado(usu)) {
            usu = new UsuariosCredito();
            usu.setCoordinador(miCoordinador);
            escritorio.add(usu).setLocation(25, 3);
            usu.show();
   }// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
 if (estacerrado(in)) {

             in = new Inventario();
            in.setCoordinador(miCoordinador);
            escritorio.add(in).setLocation(25, 3);
            in.show();

            try {
                in.setMaximum(true);

                // TODO add your handling code here:
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed
AgregarVendedor add;
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
 
   if (estacerrado(add)) {
            add = new AgregarVendedor();
            add.setCoordinador(miCoordinador);
            add.setSize(450, 390);
            escritorio.add(add).setLocation(300, 0);
            add.show();
           
        }
 // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed
Vendedores v;
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        if (estacerrado(v)) {
            v = new Vendedores();
            v.setCoordinador(miCoordinador);
            v.setSize(880, 550);
            escritorio.add(v).setLocation(250, 0);
            v.show();
           
        }       
    }//GEN-LAST:event_jMenuItem8ActionPerformed
NuevaNota nn;
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
   
        if (estacerrado(nn)) {
            nn = new NuevaNota();
            nn.local = local;
            nn.setCoordinador(miCoordinador);
            nn.setSize(1350, 550);
            
            escritorio.add(nn).setLocation(10, 3);
            nn.show();
   }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
/*
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Tu resoluciÃ³n es de " + screenSize.width + "x" + screenSize.height);
        Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addProduct;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem inventario;
    private javax.swing.JMenuItem itemAddColor;
    private javax.swing.JMenuItem itemSale;
    private javax.swing.JMenuItem itemViewColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbId;
    private javax.swing.JMenu menuColors;
    private javax.swing.JMenu menuProduct;
    private javax.swing.JMenu menuSale;
    private javax.swing.JMenu menuUsers;
    public javax.swing.JTextField txtUsuario;
    private javax.swing.JMenuItem updateProduct;
    // End of variables declaration//GEN-END:variables

}
