
package Vista;

import Controlador.Coordinador;
import Modelo.BagVo;
import Modelo.ProductoVo;
import Modelo.VentaVo;
import static Vista.Inicio.escritorio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author luism
 */
public class NotasCredito extends javax.swing.JInternalFrame {
    public int id_venta;
    public int id_user;
private Coordinador miCoordinador;

DefaultTableModel modelo = new DefaultTableModel(){
 public boolean isCellEditable(int rowIndex,int columnIndex){return false;}};
String[] columnas = {"Codigo","Artículo","Color","Talla","Precio","Cantidad"};

     public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;     
        llenarDatosTabla(id_venta);
        asignarTamano();
    }
    public NotasCredito() {
        
        initComponents();
    }
 public void limpiarTabla(JTable tabla){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas=tabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    public void llenarDatosTabla(int id){
    modelo.setColumnIdentifiers(columnas);

ArrayList<BagVo> listado = miCoordinador.getProductsCreditOnline(id);

for(int i =0; i<listado.size();i++){
modelo.addRow(new Object[] {listado.get(i).getArt(),listado.get(i).getArt_name(),listado.get(i).getColor_name(),
listado.get(i).getSize_name(),listado.get(i).getPrice(),listado.get(i).getQuantity()});
}
tbProducts.setModel(modelo);
    }
    
     public void asignarTamano(){
    tbProducts.getColumnModel().getColumn(0).setPreferredWidth(60);
    tbProducts.getColumnModel().getColumn(1).setPreferredWidth(150);
    tbProducts.getColumnModel().getColumn(2).setPreferredWidth(100);
    tbProducts.getColumnModel().getColumn(3).setPreferredWidth(80);
    tbProducts.getColumnModel().getColumn(4).setPreferredWidth(80);
    tbProducts.getColumnModel().getColumn(5).setPreferredWidth(40);
    
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCliente = new javax.swing.JLabel();
        lbCompra = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCambio = new javax.swing.JButton();
        btnDevolucion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProducts = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 65, 92));
        setTitle("Notas Credito");

        jPanel3.setBackground(new java.awt.Color(0, 65, 92));

        jPanel1.setBackground(new java.awt.Color(1, 129, 176));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. Compra:");

        lbCliente.setForeground(new java.awt.Color(240, 240, 240));
        lbCliente.setText(" ");

        lbCompra.setForeground(new java.awt.Color(240, 240, 240));
        lbCompra.setText(" ");

        lbTotal.setForeground(new java.awt.Color(255, 255, 255));
        lbTotal.setText(" ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total:");

        lbFecha.setForeground(new java.awt.Color(240, 240, 240));
        lbFecha.setText(" ");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Baghdad", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Notas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(344, 344, 344))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbTotal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lbFecha)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbCompra))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(1, 129, 176));

        btnCambio.setBackground(new java.awt.Color(0, 37, 145));
        btnCambio.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnCambio.setForeground(new java.awt.Color(255, 255, 255));
        btnCambio.setText("Cambiar");
        btnCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCambio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });

        btnDevolucion.setBackground(new java.awt.Color(0, 37, 145));
        btnDevolucion.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDevolucion.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolucion.setText("Devolver");
        btnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 37, 145));
        btnSalir.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tbProducts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(1, 129, 176), 1, true));
        tbProducts.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        tbProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tbProducts.setGridColor(new java.awt.Color(204, 204, 204));
        tbProducts.setSelectionBackground(new java.awt.Color(253, 175, 200));
        tbProducts.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbProducts);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductsMouseClicked

    }//GEN-LAST:event_tbProductsMouseClicked
cambiarProducto cambio;
    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
int fila = tbProducts.getSelectedRow();
ArrayList<BagVo> listado = miCoordinador.getProductsCreditOnline(id_venta);


if(fila>-1){
        cambio = new cambiarProducto();
        cambio.id_bag =listado.get(tbProducts.getSelectedRow()).getId_bag();
        System.out.println(listado.get(tbProducts.getSelectedRow()).getId_bag());
        cambio.id_venta = Integer.parseInt(lbCompra.getText());
        System.out.println(Integer.parseInt(lbCompra.getText()));
        cambio.id_user = id_user;
        cambio.total = Double.parseDouble(lbTotal.getText());
        cambio.setCoordinador(miCoordinador);
            escritorio.add(cambio).setLocation(300,200);
            cambio.show();     
}
else{
JOptionPane.showMessageDialog(null, "Seleccione un producto de la lista");
}
    }//GEN-LAST:event_btnCambioActionPerformed

    private void btnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionActionPerformed
int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de realizar esta devolución?", "Confirmación", JOptionPane.YES_NO_OPTION);
int fila = tbProducts.getSelectedRow();
ArrayList<BagVo> listado = miCoordinador.getProductsCreditOnline(id_venta);
ProductoVo tallas1 = new ProductoVo();
ProductoVo amount1 = new ProductoVo();
Double totalventa = Double.parseDouble(lbTotal.getText());    
VentaVo venta = new VentaVo();

if(fila>-1 && resp == JOptionPane.YES_OPTION){

int id_bag = listado.get(tbProducts.getSelectedRow()).getId_bag();
System.out.println(id_bag);

//Actualizar talla del producto +1
BagVo producto1 = miCoordinador.getBag(id_bag);

amount1 = miCoordinador.getAmountProducto(producto1.getArt(), producto1.getColor_art(), producto1.getId_size());
tallas1.setArt(producto1.getArt());
tallas1.setColor_art(producto1.getColor_art());
tallas1.setId_size(producto1.getId_size());
tallas1.setAmount(amount1.getAmount() + 1);
tallas1.setId_local(amount1.getId_local());

//Actualizar total de la venta
totalventa = totalventa - producto1.getPrice();
venta.setId_sale(id_venta);
venta.setId_user(id_user);
venta.setTotal(totalventa);

//Ejecutar consultas
miCoordinador.UpdateProductSizes(tallas1);
miCoordinador.pagarDeuda(venta);
miCoordinador.borrarBag(id_bag);
limpiarTabla(tbProducts);
llenarDatosTabla(id_venta);

//Cerrar
JOptionPane.showMessageDialog(null, "Transacción exitosa");
dispose();

}
else{
JOptionPane.showMessageDialog(null, "Elija un producto nuevamente o cancele");
}

    }//GEN-LAST:event_btnDevolucionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(NotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotasCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotasCredito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambio;
    private javax.swing.JButton btnDevolucion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lbCliente;
    public static javax.swing.JLabel lbCompra;
    public static javax.swing.JLabel lbFecha;
    public static javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbProducts;
    // End of variables declaration//GEN-END:variables
}
