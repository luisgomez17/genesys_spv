
package Vista;

import Controlador.Coordinador;
import Modelo.BagVo;
import Modelo.ColorVo;
import Modelo.LocalVo;
import Modelo.ProductoVo;
import Modelo.SubcategoryDao;
import Modelo.SubcategoryVo;
import Modelo.TallaVo;
import Modelo.UsuarioVo;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.DetalleVenta;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author luism
 */
public class Inventario extends javax.swing.JInternalFrame {
  private Coordinador miCoordinador;
  private ArrayList<LocalVo> locales;
  private ArrayList<SubcategoryVo> subcategories;
  int estado = 0;
  DefaultTableModel modelo = new DefaultTableModel(){
  public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
  };
      String[] columnas = {"Cod. Artículo","Artículo","Color","Talla","Cantidad"};
     
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        setLocales();
//asignarTamaño();
        

        
    }
    /**
     * Create new form Usuarios
     */
    public Inventario() {
        initComponents();
       // setLocationRelativeTo(null);        // Centering on screen...
       // setSize(1300, 800); 
          modelo.setColumnIdentifiers(columnas);
        tbInvent.setModel(modelo);
        
    }

    public void mostrarArt(int local, String art){
    modelo.setColumnIdentifiers(columnas);
    ArrayList<ProductoVo> producto = new ArrayList<>();
    
    producto = miCoordinador.getProductoTienda(local, art);
    
    if(!producto.isEmpty()){
     for (int i =0; i<producto.size();i++){
modelo.addRow(new Object[] {producto.get(i).getArt(),producto.get(i).getArt_name(),producto.get(i).getColor_name(),
producto.get(i).getSize_name(),producto.get(i).getAmount()});
      }
      //Asignamos los datos del Modelo a la tabla
      tbInvent.setModel(modelo);
    }
    else{
    JOptionPane.showMessageDialog(null,"No existen productos registrados");
    }
    estado = 1;
    }
    
    
     public void mostrarArtCategory(int local, int cat, int sub){
    modelo.setColumnIdentifiers(columnas);
    ArrayList<ProductoVo> productocat = new ArrayList<>();
    
    productocat = miCoordinador.getProductoTiendaCategory(local, cat, sub);
    
    if(productocat.size()>0){
     for (int i =0; i<productocat.size();i++){
modelo.addRow(new Object[] {productocat.get(i).getArt(),productocat.get(i).getArt_name(),productocat.get(i).getColor_name(),
productocat.get(i).getSize_name(),productocat.get(i).getAmount()});
      }
      //Asignamos los datos del Modelo a la tabla
      tbInvent.setModel(modelo);
    }
    else{
    JOptionPane.showMessageDialog(null,"No existen productos registrados");
    }
    
    estado=2;
     }
    
     public void setLocales() {
        
        DefaultComboBoxModel modeloLocal = new DefaultComboBoxModel();
        modeloLocal.addElement("Seleccionar...");

        locales = miCoordinador.obtenerLocales();
    

            for (int i = 0; i < locales.size(); i++) {
                modeloLocal.addElement(locales.get(i).getId_local()+"-"+locales.get(i).getNombre());
            }
            comboLocal.setModel(modeloLocal);
            comboLocal1.setModel(modeloLocal);
        }
    
         private void limpiarTable(){
while(modelo.getRowCount()>0){
modelo.removeRow(0);
}
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInvent = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboLocal = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox<>();
        btnBusqueda = new javax.swing.JButton();
        comboSub = new javax.swing.JComboBox<>();
        comboLocal1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnTraspaso = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(0, 65, 92));

        jPanel2.setBackground(new java.awt.Color(0, 65, 92));

        tbInvent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(1, 129, 176), 3, true));
        tbInvent.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        tbInvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod. Artículo", "Artículo", "Color", "Talla", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbInvent.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbInvent.setGridColor(new java.awt.Color(1, 129, 176));
        tbInvent.setRowHeight(20);
        tbInvent.setSelectionBackground(new java.awt.Color(253, 175, 200));
        tbInvent.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbInvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInventMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInvent);

        jPanel3.setBackground(new java.awt.Color(1, 129, 176));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar por Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código");

        txtSearch.setBackground(new java.awt.Color(242, 242, 242));
        txtSearch.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearch.setCaretColor(new java.awt.Color(51, 51, 51));
        txtSearch.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Local:");

        comboLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        btnSearch.setBackground(new java.awt.Color(0, 37, 145));
        btnSearch.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(1, 129, 176));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar por Categoría", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoría");

        jLabel5.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Subcategoría");

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Recién nacido/Ellas", "Recién nacido/Ellos", "Baby/Ellas", "Baby/Ellos", "Mini/Ellas", "Mini/Ellos", "Junior/Ellas", "Junior/Ellos", "Accesorios y regalos" }));
        comboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoryActionPerformed(evt);
            }
        });

        btnBusqueda.setBackground(new java.awt.Color(0, 37, 145));
        btnBusqueda.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setText("Buscar");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        comboSub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        comboSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSubActionPerformed(evt);
            }
        });

        comboLocal1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel6.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Local:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41)
                        .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(comboSub, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboSub, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(comboLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 65, 92));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        btnTraspaso.setBackground(new java.awt.Color(0, 37, 145));
        btnTraspaso.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnTraspaso.setForeground(new java.awt.Color(255, 255, 255));
        btnTraspaso.setText("Traspaso");
        btnTraspaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraspasoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraspaso, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnTraspaso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Baghdad", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inventario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        limpiarTable();
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        String aux = txtSearch.getText();
        int index = comboLocal.getSelectedIndex();

        modelo.setColumnIdentifiers(columnas);

        if(aux != null && index > 0){
            mostrarArt(index,aux);
        }
        else{
            JOptionPane.showMessageDialog(null,"Llene los campos correspondientes");
        }
btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void tbInventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInventMouseClicked
       
    }//GEN-LAST:event_tbInventMouseClicked

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed

        limpiarTable();
        btnBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        int index_cat = comboCategory.getSelectedIndex();
        subcategories = miCoordinador.getSubcategories(index_cat);
        int index_sub = subcategories.get(comboSub.getSelectedIndex()-1).getId_subcategory();
        int index = comboLocal.getSelectedIndex();
        System.out.println("Cat:"+index_cat+" "+"Sub."+index_sub);
        
        modelo.setColumnIdentifiers(columnas);

        if(index_cat > 0 && index_sub > 0 && index > 0){
            mostrarArtCategory(index,index_cat,index_sub);
        }
        else{
            JOptionPane.showMessageDialog(null,"Llene los campos correspondientes");
        }      
        btnBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));// TODO add your handling code here:
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void comboSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSubActionPerformed

    }//GEN-LAST:event_comboSubActionPerformed

    private void comboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoryActionPerformed
Integer cat_index = comboCategory.getSelectedIndex();

      DefaultComboBoxModel  modeloSubcategory = new DefaultComboBoxModel();
        modeloSubcategory.addElement("Seleccionar...");

        Integer sub_index = -1;

        if (cat_index > 0) {
            
            

             subcategories = miCoordinador.getSubcategories(cat_index);

            for (int i = 0; i < subcategories.size(); i++) {
                
             
                modeloSubcategory.addElement(subcategories.get(i).getSucategory_name());
                
                
            } 
            comboSub.setModel(modeloSubcategory);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoryActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
  char c=evt.getKeyChar();
   int ascii = (int)c;
        if(ascii<48 || ascii>57) {
            getToolkit().beep();

            evt.consume();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnTraspasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraspasoActionPerformed
int fila = tbInvent.getSelectedRow();
ArrayList<ProductoVo> producto1 = null;
ProductoVo transferir = null;
//Producto buscado por código
if((fila>-1) && (estado == 1)){
     String aux = txtSearch.getText();
        int index = comboLocal.getSelectedIndex();
producto1 = miCoordinador.getProductoTienda(index, aux);


}
//Producto buscado por subcategorias
else if(fila>-1 && estado==2){
int index_cat = comboCategory.getSelectedIndex();
int index_sub = subcategories.get(comboSub.getSelectedIndex()-1).getId_subcategory();
int index = comboLocal.getSelectedIndex();
producto1 = miCoordinador.getProductoTiendaCategory(index, index_cat, index_sub);    

}
else{
JOptionPane.showMessageDialog(null,"Seleccione un producto a traspasar");
}
//Locales disponibles
locales = miCoordinador.obtenerLocales();
Integer[] options = new Integer[locales.size()];


for(int i=0;i<locales.size();i++){
options[i] = locales.get(i).getId_local();
}
//Local de destino
int n = (Integer)JOptionPane.showInputDialog(null, "Selecciona el local al que se traspasará", 
"Traspaso", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

//Producto seleccionado

producto1.get(tbInvent.getSelectedRow()).setAmount(producto1.get(tbInvent.getSelectedRow()).getAmount()-1);
producto1.get(tbInvent.getSelectedRow()).setId_local_destino(n);

//Transferir y reducir inventario
miCoordinador.InsertTraspaso(producto1.get(tbInvent.getSelectedRow()));
miCoordinador.UpdateProductSizes(producto1.get(tbInvent.getSelectedRow()));


    }//GEN-LAST:event_btnTraspasoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTraspaso;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboLocal;
    private javax.swing.JComboBox<String> comboLocal1;
    private javax.swing.JComboBox<String> comboSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbInvent;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
