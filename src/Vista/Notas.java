/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Coordinador;
import Modelo.BagDao;
import Modelo.BagVo;
import Modelo.ColorVo;
import Modelo.CreditoVo;
import Modelo.ProductoVo;
import Modelo.TallaVo;
import Modelo.VentaVo;
import static Vista.Usuarios.tbUsers;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.beans.PropertyVetoException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author bryan
 */
public class Notas extends javax.swing.JInternalFrame {

    DefaultComboBoxModel modeloTalla;
    DefaultComboBoxModel modeloColor;
    private ArrayList<ColorVo> colores;

    Date date = new Date();
    DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm ");

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };
    String[] columnas = {"Codigo", "Articulo", "Color", "Talla", "Precio Unitario", "Cantidad", "Importe"};

    private Coordinador miCoordinador;

    public static ArrayList<BagVo> bag = new ArrayList<BagVo>();

    public static int id_usuario = 1;

    public static boolean concretado;

    public int id_venta;

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        asignarTamano();
        txtCode.requestFocus();
    }

    public void asignarTamano() {
        tbVenta.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbVenta.getColumnModel().getColumn(1).setPreferredWidth(250);
        tbVenta.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbVenta.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbVenta.getColumnModel().getColumn(4).setPreferredWidth(50);
        tbVenta.getColumnModel().getColumn(5).setPreferredWidth(20);
        tbVenta.getColumnModel().getColumn(6).setPreferredWidth(50);

    }

    public Notas() {

        initComponents();
        txtFecha.setText(hourdateFormat.format(date));
        modelo.setColumnIdentifiers(columnas);
        tbVenta.setModel(modelo);
    }

    public void limpiarCamposProducto() {
        txtCode.setText("");
        lblArt.setText("");
        lblPrecio.setText("");
    }

    public void limpiarCamposVenta() {
       
    }

    public void agregarProducto() {

        //Ciclo para llenar tabla de productos
        for (int i = 0; i < bag.size(); i++) {
            modelo.addRow(new Object[]{bag.get(i).getArt(), bag.get(i).getArt_name(), bag.get(i).getColor_name(),
                bag.get(i).getSize_name(), bag.get(i).getPrice(), bag.get(i).getQuantity(), bag.get(i).getImporte()
            });
        }
        //Asignamos los datos del Modelo a la tabla
        tbVenta.setModel(modelo);
    }

    private void limpiarTable() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public double calcularImporte(int cantidad, double precio) {

        double importe = 0;
        double cant = (double) cantidad;
        importe = cant * precio;

        return importe;
    }

    public void calcularTotal() {
        double total = 0;
        for (int i = 0; i < tbVenta.getRowCount(); i++) {
            total += (double) tbVenta.getValueAt(i, 6);
        }
        lblTotal.setText(Double.toString(total));
    }

    public int codigoArt(String art) {
        String codigo = art.trim();
        int cadena = 0;
        if (codigo.length() > 5) {
            cadena = Integer.parseInt(codigo.substring(2, 7));
        } else if (codigo.length() == 5) {
            cadena = Integer.parseInt(codigo);
        }
        System.out.print(cadena);
        return cadena;
    }

    public String codigoArtCadena(String art) {
        String codigo = art.trim();
        String cadena = "";
        if (codigo.length() > 5) {
            cadena = codigo.substring(2, 7);
        } else if (codigo.length() == 5) {
            cadena = codigo;
        }
        System.out.print(cadena);
        return cadena;
    }

    public double dineroElectronicoVenta(String total1, String porcen1) {
        Double obtenido = 0.0;
        Double total = Double.parseDouble(total1);
        Double porcen = Double.parseDouble(porcen1);
       
            obtenido = (total * porcen) / 100;
     
        obtenido = Math.round(100d * obtenido) / 100d;
        System.out.print(obtenido);
        return obtenido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVenta = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblArt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnDescuento = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Nota de Crédito");
        setPreferredSize(new java.awt.Dimension(1308, 774));

        jPanel1.setBackground(new java.awt.Color(0, 65, 92));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBackground(new java.awt.Color(1, 129, 176));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbVenta.setFont(new java.awt.Font("GT Walsheim Regular", 0, 11)); // NOI18N
        tbVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Articulo", "Color", "Talla", "Precio Unitario", "Cantidad", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVenta.setRowHeight(30);
        tbVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVentaMouseClicked(evt);
            }
        });
        tbVenta.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tbVentaInputMethodTextChanged(evt);
            }
        });
        tbVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbVentaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tbVenta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(1, 129, 176));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Articulo:");

        lblArt.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total  $");

        lblPrecio.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N

        jButton3.setBackground(new java.awt.Color(192, 57, 43));
        jButton3.setFont(new java.awt.Font("GT Walsheim Bold", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Eliminar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnDescuento.setBackground(new java.awt.Color(211, 84, 0));
        btnDescuento.setFont(new java.awt.Font("GT Walsheim Bold", 0, 14)); // NOI18N
        btnDescuento.setForeground(new java.awt.Color(255, 255, 255));
        btnDescuento.setText("Descuento");
        btnDescuento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoActionPerformed(evt);
            }
        });

        btnPagar.setBackground(new java.awt.Color(39, 174, 96));
        btnPagar.setFont(new java.awt.Font("GT Walsheim Bold", 0, 18)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("Finalizar");
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cantidad:");

        jLabel21.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Talla:");

        jButton2.setBackground(new java.awt.Color(41, 128, 185));
        jButton2.setFont(new java.awt.Font("GT Walsheim Bold", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Agregar");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Color:");

        txtCliente.setBackground(new java.awt.Color(242, 242, 242));
        txtCliente.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        txtCliente.setText("Publico general");
        txtCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cliente:");

        btnBuscar.setBackground(new java.awt.Color(41, 128, 185));
        btnBuscar.setFont(new java.awt.Font("GT Walsheim Bold", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblArt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblArt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Vista.Usuarios us = new Usuarios();
        us.setCoordinador(miCoordinador);
        Inicio.escritorio.add(us).setLocation(25, 3);
        us.show();
        try {
            us.setMaximum(true);

            // TODO add your handling code here:
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbVentaKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_tbVentaKeyTyped

    private void tbVentaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbVentaInputMethodTextChanged

    }//GEN-LAST:event_tbVentaInputMethodTextChanged

    private void tbVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVentaMouseClicked

    }//GEN-LAST:event_tbVentaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (comboColor.getSelectedIndex() > -1 && comboTalla.getSelectedIndex() > -1) {
            String codigo = txtCode.getText();
            codigo = codigo.replaceAll(" ", "");
            if (codigo.length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese un articulo valido", "Venta", JOptionPane.WARNING_MESSAGE);
            } else {
                agregarBolsa();
                limpiarCamposProducto();
                limpiarTable();
                agregarProducto();
                calcularTotal();
                //calcularImporte();
            }
            System.out.println(id_usuario);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if (bag.size() > 0 && Double.parseDouble(lblTotal.getText()) > 0) {
            BagVo aux = new BagVo();
            for (int t = 0; t < bag.size(); t++) {
                aux.setId_user(bag.get(t).getId_user());
                aux.setArt(bag.get(t).getArt());
                aux.setArt_name(bag.get(t).getArt_name());
                aux.setColor_art(bag.get(t).getColor_art());
                aux.setColor_name(bag.get(t).getColor_name());
                aux.setId_size(bag.get(t).getId_size());
                aux.setSize_name(bag.get(t).getSize_name());
                aux.setPrice(bag.get(t).getPrice());
                aux.setQuantity(bag.get(t).getQuantity());
                aux.setId_sale(bag.get(t).getId_sale());
                //   miCoordinador.InsertBag(aux);
            }

            ArrayList<ProductoVo> registro = new ArrayList<>();

            for (int c = 0; c < bag.size(); c++) {
                ProductoVo aux1 = new ProductoVo();

                aux1.setAmount(bag.get(c).getQuantity());
                aux1.setArt(bag.get(c).getArt());
                aux1.setColor_art(bag.get(c).getColor_art());
                aux1.setId_size(bag.get(c).getId_size());

                registro.add(aux1);

            }

            Vista.Total total = new Total();
            total.setCoordinador(miCoordinador);

            
            total.dineroelectronico = dineroElectronicoVenta(lblTotal.getText(),txtPorcen.getText());

            
            total.bolsa = (ArrayList) bag.clone();
            total.product = (ArrayList) registro.clone();
            total.lblCliente.setText(txtCliente.getText());
            total.lblVendedor.setText(txtVendedor.getText());
            total.lblPagar.setText(lblTotal.getText());
            total.lblDinero.setText(txtMonedero.getText());
            total.comprador.setId_user(id_usuario);
            total.venta.setId_user(id_usuario);
            total.venta.setId_vendedor(Integer.parseInt(lbIdVendedor.getText()));
            total.venta.setVendedor(txtVendedor.getText());
            total.venta.setId_sale(id_venta);
            total.ticket.setNro_ticket(miCoordinador.obtenerSiguienteId());
            total.ticket.setTotal(Double.parseDouble(lblTotal.getText()));
            if (!txtCliente.getText().equals("")) {
                total.ticket.setCliente(txtCliente.getText());
            } else {
                total.ticket.setCliente("Publico general");
            }
            total.ticket.setVendedor(txtVendedor.getText());
            //miCoordinador.getTotal().setVisible(true);
            miCoordinador.getTotal().venta.setSubtotal(Double.parseDouble(lblTotal.getText()));

            Inicio.escritorio.add(total).setLocation(300, 30);
            total.show();

            limpiarTable();
            limpiarCamposVenta();
            lblTotal.setText("0.00");
            txtPorcen.setText("0");
            btnCredit.setEnabled(false);
            
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese articulos a la venta", "Venta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed

        int seleccion = tbVenta.getSelectedRow();

        if (seleccion >= 0) {
            double importe = (double) tbVenta.getValueAt(seleccion, 6);

            String descuento;
            descuento = JOptionPane.showInputDialog(null, "Registre el nuevo costo");
            if (descuento.isEmpty() || !descuento.matches("[0-9]*") || Double.parseDouble(descuento) > importe) {
                JOptionPane.showMessageDialog(null, "Ingresa una cantidad valida");

            } else {

                bag.get(seleccion).setImporte(Double.valueOf(descuento));

                limpiarTable();
                agregarProducto();
                calcularTotal();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto de la tabla");
        }
    }//GEN-LAST:event_btnDescuentoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int seleccion = tbVenta.getSelectedRow();
        bag.remove(seleccion);
        limpiarTable();
        agregarProducto();
        calcularTotal();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void llenarComboTalla(String art, String color) {

        ArrayList<TallaVo> talla = miCoordinador.getTallasColor(art, color);

        if (talla.size() > 0) {
            modeloTalla = new DefaultComboBoxModel();
            modeloTalla.addElement("Seleccionar...");

            for (int i = 0; i < talla.size(); i++) {
                modeloTalla.addElement(talla.get(i).getSize_name());
            }
            comboTalla.setModel(modeloTalla);
        }
    }
    public void agregarBolsa() {
        BagVo bagg = new BagVo();

        String codigo = txtCode.getText().trim();

        ProductoVo articulo = miCoordinador.getProductoCodigo(codigo);
        lblArt.setText(articulo.getArt_name());

        lblPrecio.setText(Double.toString(articulo.getPrice()));
        ColorVo color = miCoordinador.buscarColor(articulo.getColor_art());
        TallaVo talla = miCoordinador.getTalla(articulo.getId_size());

        int cantidad = Integer.parseInt((String) comboCant.getItemAt(comboCant.getSelectedIndex()));
        /*
        ArrayList<TallaVo> medida = miCoordinador.obtenerTallasProducto(codigoArtCadena(txtCode.getText()));
        ArrayList<ColorVo> color = miCoordinador.obtenerColorProducto(codigoArtCadena(txtCode.getText()), medida.get(comboTalla.getSelectedIndex()).getId_size());
        ProductoVo product = miCoordinador.getDetallesProductoColor(codigoArtCadena(txtCode.getText()), color.get(comboColor.getSelectedIndex()).getColor_art());
         */

        if (cantidad > 0 && articulo.getArt() != null) {

            bagg.setId_user(id_usuario);
            bagg.setArt(codigoArtCadena(txtCode.getText()));
            bagg.setArt_name(articulo.getArt_name());
            bagg.setColor_art(color.getColor_art());
            bagg.setColor_name(comboColor.getItemAt(comboColor.getSelectedIndex()));
            bagg.setId_size(talla.getId_size());
            bagg.setSize_name(comboTalla.getItemAt(comboTalla.getSelectedIndex()));
            bagg.setSrc(articulo.getSrc1());
            bagg.setPrice(articulo.getPrice());
            bagg.setQuantity(cantidad);
            bagg.setImporte(calcularImporte(cantidad, articulo.getPrice()));
            bagg.setId_sale(id_venta);

            bag.add(bagg);
        } else {
            JOptionPane.showMessageDialog(null, "No ha completado los campos necesarios", "Compra", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArt;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTable tbVenta;
    public static javax.swing.JTextField txtCliente;
    // End of variables declaration//GEN-END:variables
}
