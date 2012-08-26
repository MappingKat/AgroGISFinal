/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmDescargaCereal.java
 *
 * Created on 10/11/2011, 21:25:54
 */
package Ventanas_Carga;

import Clases_Modulo_Carga.*;

import Clases_Modulo_Transporte.Transportista;
import Gestores_Vista.gestorDescargaCereal;
import Hibernate.GestorHibernate;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Charito
 */
public class frmDescargaCereal extends javax.swing.JInternalFrame {
gestorDescargaCereal gestorD = new gestorDescargaCereal();
GestorHibernate gestorH = new GestorHibernate();
    /** Creates new form frmDescargaCereal */
    public frmDescargaCereal() {
        initComponents();
        
        gestorD.rellenaTablaProductor(tblEstablecimiento);
        cmbTipoCereal.setModel(gestorD.rellenaComboTipoCereal());
        cmbSilo.setModel(gestorD.rellenaComboSilo());
        cmbTransportista.setModel(gestorD.rellenaComboTransportista());
        
        txtFecha.setEnabled(false);
        txtFecha.setEditable(false);
        txtHora.setEditable(false);
        txtHora.setEnabled(false);
        //setear el campo de fecha con la del sistema
        GregorianCalendar gc=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        gc.get(Calendar.DAY_OF_WEEK);
        gc.get(Calendar.MONTH);
        gc.get(Calendar.YEAR);
        SimpleDateFormat formateador= new SimpleDateFormat("dd-MM-yyyy");
        txtFecha.setText(formateador.format(gc.getTime()));
        //setear el campo de hora con la del sistema
        GregorianCalendar calendario=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        calendario.get(Calendar.HOUR);
        calendario.get(Calendar.MINUTE);
        SimpleDateFormat formateadorHora=new SimpleDateFormat("hh:mm");
        txtHora.setText(formateadorHora.format(calendario.getTime()));
        
        
        
        //redimensionar columnas de la tabla
        tblEstablecimiento.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblEstablecimiento.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblCaracteristica.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblCaracteristica.getColumnModel().getColumn(1).setPreferredWidth(50);
        
        
         //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 600;
        int alto = 600;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 30);
     
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstablecimiento = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEstablecimiento = new javax.swing.JTextField();
        txtProductor = new javax.swing.JTextField();
        txtNumViaje = new javax.swing.JTextField();
        cmbTipoCereal = new javax.swing.JComboBox();
        cmbVehiculo = new javax.swing.JComboBox();
        cmbTransportista = new javax.swing.JComboBox();
        cmbDominio = new javax.swing.JComboBox();
        txtPesoNeto = new javax.swing.JTextField();
        txtTara = new javax.swing.JTextField();
        txtPesoTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbSilo = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cmbCaracteristica = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCaracteristica = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAgregarCaracteristica = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("Descarga de Cereal");

        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Fecha");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 13, 50, 15);
        jPanel3.add(txtFecha);
        txtFecha.setBounds(50, 10, 102, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Hora");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(180, 10, 40, 20);
        jPanel3.add(txtHora);
        txtHora.setBounds(210, 10, 100, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Usuario");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(770, 10, 50, 15);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel3.add(jLabel12);
        jLabel12.setBounds(820, 0, 30, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Descarga", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel1.setLayout(null);

        tblEstablecimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Establecimiento", "Productor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstablecimiento.getTableHeader().setResizingAllowed(false);
        tblEstablecimiento.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblEstablecimiento);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 30, 690, 160);

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(400, 200, 104, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Productor");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 240, 80, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Establecimiento");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(300, 240, 120, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nº Viaje");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 280, 70, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tipo Cereal");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 280, 100, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Transportista");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 310, 120, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Vehiculo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(360, 310, 80, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Dominio");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(660, 310, 80, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Tara");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 340, 50, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Peso Total");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(260, 340, 90, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Peso Neto");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(480, 340, 80, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Silo Nº");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(720, 340, 70, 20);
        jPanel1.add(txtEstablecimiento);
        txtEstablecimiento.setBounds(390, 240, 200, 20);
        jPanel1.add(txtProductor);
        txtProductor.setBounds(80, 240, 200, 20);
        jPanel1.add(txtNumViaje);
        txtNumViaje.setBounds(390, 280, 100, 20);

        jPanel1.add(cmbTipoCereal);
        cmbTipoCereal.setBounds(80, 280, 140, 20);

        jPanel1.add(cmbVehiculo);
        cmbVehiculo.setBounds(410, 310, 210, 20);

        jPanel1.add(cmbTransportista);
        cmbTransportista.setBounds(90, 310, 220, 20);

        jPanel1.add(cmbDominio);
        cmbDominio.setBounds(710, 310, 100, 20);
        jPanel1.add(txtPesoNeto);
        txtPesoNeto.setBounds(540, 340, 100, 20);
        jPanel1.add(txtTara);
        txtTara.setBounds(90, 340, 100, 20);
        jPanel1.add(txtPesoTotal);
        txtPesoTotal.setBounds(320, 340, 100, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("Kgs.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(640, 340, 34, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel17.setText("Kgs.");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(190, 340, 34, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel18.setText("Kgs.");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(420, 340, 34, 20);

        jPanel1.add(cmbSilo);
        cmbSilo.setBounds(760, 340, 100, 20);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Lote Nº");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(610, 240, 80, 20);

        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(650, 240, 70, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lote Nº"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(770, 230, 110, 70);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        jPanel1.add(jButton1);
        jButton1.setBounds(730, 240, 30, 30);

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Muestra Tomada", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel2.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Valor");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(80, 70, 50, 20);
        jPanel2.add(txtValor);
        txtValor.setBounds(110, 70, 91, 20);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("Caracteristica");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(30, 30, 110, 20);

        jPanel2.add(cmbCaracteristica);
        cmbCaracteristica.setBounds(110, 30, 190, 20);

        tblCaracteristica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Caracteristica", "Valor"
            }
        ));
        jScrollPane2.setViewportView(tblCaracteristica);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(310, 30, 390, 98);

        btnAgregarCaracteristica.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgregarCaracteristica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregarCaracteristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCaracteristicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btnAgregarCaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnAgregarCaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(180, 40, 90, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(342, 342, 342)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//evento salida
private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma que desea cancelar la operacion?");
    if (respuesta==0){
    dispose();
    }
}//GEN-LAST:event_btnCancelarActionPerformed

private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    GestorHibernate gestorH = new GestorHibernate();
    Descarga descarga = new Descarga();
    descarga.setCereal((TipoCereal) cmbTipoCereal.getSelectedItem());
    descarga.setFecha(txtFecha.getText());
    descarga.setHora(txtHora.getText());
    descarga.setSilo((Silo) cmbSilo.getSelectedItem());
    descarga.setTransportista((Transportista) cmbTransportista.getSelectedItem());
    Iterator ite = gestorH.listarClase(Productor.class).iterator();
    while(ite.hasNext()){
        Productor productor = (Productor) ite.next();
        if(productor.getNombre().equals(txtProductor.getText())){
            descarga.setProductor(productor);
        }
    }
    while(ite.hasNext()){
        Establecimiento establecimiento= (Establecimiento) ite.next();
        if(establecimiento.getNombreEstablecimiento().equals(txtEstablecimiento.getText())){
            descarga.setEstablecimiento(establecimiento);
        }
    }
    descarga.setNumeroViaje(Integer.parseInt(txtNumViaje.getText()));
    gestorH.guardarObjeto(descarga);
    

}//GEN-LAST:event_btnGuardarActionPerformed

private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    DefaultTableModel modeloT = (DefaultTableModel) tblEstablecimiento.getModel();
    int fila = tblEstablecimiento.getSelectedRow();
    txtProductor.setText((String) modeloT.getValueAt(fila, 1));
    txtEstablecimiento.setText((String) modeloT.getValueAt(fila, 0));

}//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarCaracteristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCaracteristicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCaracteristicaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCaracteristica;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbCaracteristica;
    private javax.swing.JComboBox cmbDominio;
    private javax.swing.JComboBox cmbSilo;
    private javax.swing.JComboBox cmbTipoCereal;
    private javax.swing.JComboBox cmbTransportista;
    private javax.swing.JComboBox cmbVehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCaracteristica;
    private javax.swing.JTable tblEstablecimiento;
    private javax.swing.JTextField txtEstablecimiento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNumViaje;
    private javax.swing.JTextField txtPesoNeto;
    private javax.swing.JTextField txtPesoTotal;
    private javax.swing.JTextField txtProductor;
    private javax.swing.JTextField txtTara;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
