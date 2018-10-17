/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Coordinador;
import Modelo.ApartadoVo;
import Modelo.VentaVo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author luism
 */
public class Apartado extends javax.swing.JInternalFrame {
  
   private Coordinador miCoordinador;
    
   DefaultTableModel modelo = new DefaultTableModel(){ 
 public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
 };
   String[] columnas = {"Cliente","Articulo","Color","Talla","Cantidad","Registro","Vencimiento"," Estado"};
       TableRowSorter trs;

    public Apartado() {
        initComponents();
    }

     public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        getApartado();
 }
     
     public void getApartado(){
    
     ArrayList<ApartadoVo> lista = miCoordinador.getProductsApartado();
      if(lista.size()>0){
          modelo.setColumnIdentifiers(columnas); 
     for(int i = 0; i<lista.size();i++){
modelo.addRow(new Object[] {lista.get(i).getNombre() +" "+ lista.get(i).getApellidos(),lista.get(i).getArticulo(), lista.get(i).getColor(),
lista.get(i).getTalla(), lista.get(i).getAmount(), lista.get(i).getRegistro(), lista.get(i).getPlazo(), lista.get(i).getEstado()});
}
      //Asignamos los datos del Modelo a la tabla
      tbApart.setModel(modelo);
}else{
            JOptionPane.showMessageDialog(null, "No se encontraron articulos apartados");
      }}
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbApart = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btnSale = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Sistema de Apartado");

        jPanel1.setBackground(new java.awt.Color(0, 65, 92));

        tbApart.setBackground(new java.awt.Color(237, 237, 237));
        tbApart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(1, 129, 176), 1, true));
        tbApart.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        tbApart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Articulo", "Color", "Talla", "Cantidad", "Registro", "Vencimiento", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbApart.setGridColor(new java.awt.Color(204, 204, 204));
        tbApart.setSelectionBackground(new java.awt.Color(253, 175, 200));
        tbApart.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbApart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbApartMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbApartMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbApart);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 129, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(1, 129, 176));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Baghdad", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Inicio:");

        jLabel7.setFont(new java.awt.Font("Baghdad", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Fin:");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        btnSale.setBackground(new java.awt.Color(0, 37, 145));
        btnSale.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSale.setForeground(new java.awt.Color(255, 255, 255));
        btnSale.setText("Buscar");
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Baghdad", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Estado");

        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Baghdad", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Nombre del cliente:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E", "V", "P" }));
        cbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEstadoItemStateChanged(evt);
            }
        });
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSale)
                .addGap(60, 60, 60)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbApartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbApartMouseClicked

    }//GEN-LAST:event_tbApartMouseClicked

    private void tbApartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbApartMouseReleased
        int fila = tbApart.getSelectedRow();
/*
        if ((fila > -1) && state==1){
            int aux = (int) modelo.getValueAt(fila, 0);
            llenarTablaProducto(aux);
        }

        else if ((fila > -1) && state==2){
            int aux = (int) modelo.getValueAt(fila, 0);
            llenarTablaProductoOnline(aux);
        }*/
    }//GEN-LAST:event_tbApartMouseReleased

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
        /*
        String formato = "yyyy-MM-dd";
        Date date = dcFecha.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);

        String fecha = sdf.format(date);

        llenarTablaVenta(fecha);
        state=1;
*/
    }//GEN-LAST:event_btnSaleActionPerformed

    private void txtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyTyped
 txtCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtCliente.getText(), 0));
            }
        });
        trs = new TableRowSorter(modelo);
        tbApart.setRowSorter(trs);
    }//GEN-LAST:event_txtClienteKeyTyped

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed

        


        
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void cbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEstadoItemStateChanged
String estado = cbEstado.getSelectedItem().toString();
                        
        trs = new TableRowSorter(modelo);
        tbApart.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(estado, 7));    
    }//GEN-LAST:event_cbEstadoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSale;
    private javax.swing.JComboBox<String> cbEstado;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbApart;
    private javax.swing.JTextField txtCliente;
    // End of variables declaration//GEN-END:variables
}
