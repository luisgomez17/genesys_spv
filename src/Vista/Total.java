/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Coordinador;
import Modelo.ProductoVo;
import Modelo.UsuarioVo;
import Modelo.VentaVo;
import Modelo.BagVo;
import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author luism
 */
public class Total extends javax.swing.JInternalFrame {

    private Coordinador miCoordinador;
    public ArrayList<ProductoVo> product = new ArrayList();
    public ArrayList<BagVo> bolsa = new ArrayList();
    public UsuarioVo comprador = new UsuarioVo();
    public double dineroelectronico;
    ProductoVo registro = new ProductoVo();

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;

    }

    public Total() {
        initComponents();

        venta.setShip(0.00);
    }

    public VentaVo venta = new VentaVo();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblPagar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDinero = new javax.swing.JLabel();
        btnCanjear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 65, 92));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(1, 129, 176));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vendedor:");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente:");

        lblCliente.setBackground(new java.awt.Color(255, 255, 255));
        lblCliente.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblVendedor.setBackground(new java.awt.Color(255, 255, 255));
        lblVendedor.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        lblVendedor.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanel2.setBackground(new java.awt.Color(1, 129, 176));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total a pagar:");

        lblPagar.setBackground(new java.awt.Color(255, 255, 255));
        lblPagar.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 14)); // NOI18N
        lblPagar.setForeground(new java.awt.Color(255, 255, 255));
        lblPagar.setText("0.00");
        lblPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dinero electrónico:");

        lblDinero.setBackground(new java.awt.Color(255, 255, 255));
        lblDinero.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        lblDinero.setForeground(new java.awt.Color(255, 255, 255));
        lblDinero.setText("0.00");
        lblDinero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCanjear.setText("Utilizar");
        btnCanjear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanjearActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pago:");

        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPago, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(lblPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(btnCanjear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lblPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnCanjear, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPago, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoActionPerformed

    private void btnCanjearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanjearActionPerformed

        double monedero = Double.parseDouble(lblDinero.getText());
        double total = Double.parseDouble(lblPagar.getText());

        if (monedero > 0 && monedero >= total) {
            String monto = JOptionPane.showInputDialog("Monto a utilizar", monedero);

            if (Double.parseDouble(monto) <= monedero) {
                total = Math.abs(Double.parseDouble(monto) - total);
                monedero = monedero - Double.parseDouble(monto);
                comprador.setMoney(monedero);
            } else {
                JOptionPane.showMessageDialog(null, "Fondos insuficientes", "Dinero Electrónico", JOptionPane.WARNING_MESSAGE);
            }

        } else if (monedero > 0 && total > monedero) {
            String monto = JOptionPane.showInputDialog("Monto a utilizar", monedero);

            if (Double.parseDouble(monto) <= monedero) {
                total = total - Double.parseDouble(monto);
                monedero = monedero - Double.parseDouble(monto);
                comprador.setMoney(monedero);
                System.out.println("Total:" + total);
            } else {
                JOptionPane.showMessageDialog(null, "Fondos insuficientes", "Dinero Electrónico", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "No cuentas con fondos", "Dinero Electrónico", JOptionPane.WARNING_MESSAGE);

        }
        lblPagar.setText(Double.toString(total));
        lblDinero.setText(Double.toString(monedero));

        venta.setTotal(total);


    }//GEN-LAST:event_btnCanjearActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        venta.setTotal(Double.parseDouble(lblPagar.getText()));
        String captura = txtPago.getText();
        captura = captura.replaceAll(" ", "");

        if (captura.length() == 0 || Double.parseDouble(captura) < Double.parseDouble(lblPagar.getText())) {
            JOptionPane.showMessageDialog(null, "Ingresa un pago válido", "Pago total", JOptionPane.WARNING_MESSAGE);
        } else {
            double cambio = Double.parseDouble(txtPago.getText()) - Double.parseDouble(lblPagar.getText());
            JOptionPane.showMessageDialog(null, "Gracias por su compra, su cambio es de" + " " + Double.toString(cambio) + "");
            miCoordinador.InsertVenta(venta);

            for (int v = 0; v < product.size(); v++) {
                miCoordinador.UpdateProductSizesSales(product.get(v));
            }
            comprador.setMoney(comprador.getMoney() + dineroelectronico);
            miCoordinador.ActualizarMonedero(comprador);

            for (int b = 0; b < bolsa.size(); b++) {
                miCoordinador.InsertBag(bolsa.get(b));
            }
            imprimirFactura();
            miCoordinador.getDetalle().bag.clear();
            dispose();
            txtPago.setText("");

        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    void imprimirFactura() {

        PrinterMatrix printer = new PrinterMatrix();

        Extenso e = new Extenso();

        e.setNumber(101.85);

        //Definir el tamanho del papel para la impresion  aca 25 lineas y 80 columnas
        printer.setOutSize(60, 40);
        //Imprimir * de la 2da linea a 25 en la columna 1;
        // printer.printCharAtLin(2, 25, 1, "*");
        //Imprimir * 1ra linea de la columa de 1 a 80
        //printer.printCharAtCol(0, 1, 40, "=");
        //Imprimir Encabezado nombre del La EMpresa

        printer.printTextWrap(1, 2, 10, 40, "GENESYS MODA INFANTIL");
        //printer.printTextWrap(linI, linE, colI, colE, null);
        printer.printTextWrap(3, 4, 15, 40, "molm6505111i1 ");
        printer.printTextWrap(5, 6, 4, 40, "Plaza de las Americas local A 13");
        printer.printTextWrap(7, 8, 7, 40, "Lazaro Cardenas, Michoacan");
        printer.printTextWrap(9, 10, 15, 40, "60950");
        printer.printTextWrap(11, 12, 9, 40, "genesys.mi@hotmail.com");
        printer.printCharAtCol(13, 1, 40, "-");
        printer.printTextWrap(13, 14, 1, 40, "No. TICKET: 3247");
        printer.printTextWrap(15, 16, 1, 40, "FECHA: 27/07/2018");
        printer.printTextWrap(17, 18, 1, 40, "Hora: 12:25:40 PM");
        printer.printCharAtCol(19, 1, 40, "-");
        printer.printTextWrap(20, 21, 1, 40, "CANT  PCIO U. %DESC  IMPORTE");
        printer.printCharAtCol(23, 1, 40, "-");
        int cont = 0, cont2=23;
        for (int i = 0; i < bolsa.size(); i++) {
            printer.printTextWrap(cont2 + i, cont2 + i+1, 0, 40, bolsa.get(i).getArt_name() + " " + bolsa.get(i).getSize_name() + " " + bolsa.get(i).getQuantity() + " " + bolsa.get(i).getPrice() + " " + bolsa.get(i).getImporte());
        cont2=cont2+i+1;
            cont=i+2;
        }
        printer.printCharAtCol(25+ cont, 1, 40, "-");
        printer.printTextWrap(28+cont, 29, 15, 40, "TOTAL: 3247");
        printer.printTextWrap(31+cont, 32, 0, 40, "<<<<<<<<<<<<<FORMAS DE PAGO>>>>>>>>>>>>>");
        printer.printTextWrap(34+cont, 33, 15, 40, "EFECTIVO: ");
        printer.printTextWrap(36+cont, 37, 15, 40, "TARJETA: ");
        printer.printTextWrap(38+cont, 39, 15, 40, "CREDITO: ");
        printer.printTextWrap(40+cont, 41, 15, 40, "CAMBIO: ");
        printer.printTextWrap(43+cont, 44, 18, 40, "CAJA");
        printer.printTextWrap(45+cont, 46, 5, 40, "Nombre de la Caja");
        printer.printTextWrap(47+cont, 48, 16, 40, "CLIENTE:");
        printer.printTextWrap(49+cont, 50, 5, 40, "Nombre del Cliente");
        printer.printTextWrap(51+cont, 52, 17, 40, "CAJERO");
        printer.printTextWrap(53+cont, 54, 5, 40, "Nombre del Cajero");


        /*
        if(filas > 15){
        printer.printCharAtCol(filas + 1, 1, 80, "=");
        printer.printTextWrap(filas + 1, filas + 2, 1, 80, "TOTAL A PAGAR " + txtVentaTotal.getText());
        printer.printCharAtCol(filas + 2, 1, 80, "=");
        printer.printTextWrap(filas + 2, filas + 3, 1, 80, "Esta boleta no tiene valor fiscal, solo para uso interno.: + Descripciones........");
        }else{
        printer.printCharAtCol(25, 1, 80, "=");
        printer.printTextWrap(26, 26, 1, 80, "TOTAL A PAGAR " + txtVentaTotal.getText());
        printer.printCharAtCol(27, 1, 80, "=");
        printer.printTextWrap(27, 28, 1, 80, "Esta boleta no tiene valor fiscal, solo para uso interno.: + Descripciones........");

        }*/
        printer.toFile("impresion.txt");

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("impresion.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        if (inputStream == null) {
            return;
        }

        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat, null);

        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();

        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

        if (defaultPrintService != null) {
            DocPrintJob printJob = defaultPrintService.createPrintJob();
            try {
                printJob.print(document, attributeSet);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.err.println("No existen impresoras instaladas");
        }

        //inputStream.close();
    }


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCanjear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblCliente;
    public javax.swing.JLabel lblDinero;
    public javax.swing.JLabel lblPagar;
    public javax.swing.JLabel lblVendedor;
    private javax.swing.JTextField txtPago;
    // End of variables declaration//GEN-END:variables
}
