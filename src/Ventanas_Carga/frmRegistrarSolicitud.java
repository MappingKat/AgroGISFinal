/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmRegistrarSolicitud.java
 *
 * Created on 05/11/2011, 22:28:10
 */
package Ventanas_Carga;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import Clases_Modulo_Carga.Destino;
import Clases_Modulo_Cliente.Establecimiento;
import Clases_Modulo_Cliente.Productor;
import Clases_Modulo_Carga.Silo;
import Clases_Modulo_Carga.SolicitudRetiro;
import Clases_Modulo_Carga.TipoOperacion;
import Gestores_Vista.gestorRegistrarSolicitud;
import Hibernate.GestorHibernate;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Charito
 */
public class frmRegistrarSolicitud extends javax.swing.JInternalFrame {
gestorRegistrarSolicitud gRegistro = new gestorRegistrarSolicitud();
    /** Creates new form frmRegistrarSolicitud */
    public frmRegistrarSolicitud() {
        initComponents();
       
        
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
        
        panelEstablecimiento.setVisible(false);
        panelPlanta.setVisible(true);
        
        
        //redimensionar columnas de la tabla
        tblProductor1.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblProductor1.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProductor2.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblProductor2.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 680;
        int alto = 555;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 0);
        
        gRegistro.rellenaTablaProductor(tblProductor1);
        gRegistro.rellenaTablaProductor(tblProductor2);
        
         cmbTipoSolicitud.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
           gRegistro.ActualizarDatos(cmbTipoSolicitud.getSelectedItem().toString(), panelEstablecimiento, panelPlanta);
           }
        }
        );
            gRegistro.ActualizarDatos(cmbTipoSolicitud.getSelectedItem().toString(), panelEstablecimiento, panelPlanta);

        
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
        jLabel16 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbTipoSolicitud = new javax.swing.JComboBox();
        txtNumSolicitud = new javax.swing.JTextField();
        calendarioViaje = new datechooser.beans.DateChooserCombo();
        jLabel5 = new javax.swing.JLabel();
        panelEstablecimiento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductor1 = new javax.swing.JTable();
        btnAgregarProductor1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbEstablecimiento1 = new javax.swing.JComboBox();
        txtProductor1 = new javax.swing.JTextField();
        cmbTipoCereal1 = new javax.swing.JComboBox();
        txtHas1 = new javax.swing.JTextField();
        panelPlanta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductor2 = new javax.swing.JTable();
        btnAgregarProductor2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmbEstablecimiento2 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtProductor2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbTipoCereal2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbTipoOperacion2 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtToneladas2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cmbDestino2 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        cmbNombre2 = new javax.swing.JComboBox();
        cmbSilo2 = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Solicitud");

        jPanel3.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Fecha");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 8, 70, 20);
        jPanel3.add(txtFecha);
        txtFecha.setBounds(50, 10, 80, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Hora");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(200, 10, 50, 20);
        jPanel3.add(txtHora);
        txtHora.setBounds(230, 10, 80, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("Usuario");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(560, 10, 50, 15);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel3.add(jLabel19);
        jLabel19.setBounds(610, 0, 30, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Solicitud", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Tipo Solicitud");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 110, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nº Solicitud");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 30, 90, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Fecha Estimada Viaje");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 60, 150, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Estado Solicitud");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(390, 60, 130, 15);

        cmbTipoSolicitud.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Retiro en Establecimiento", "Retiro en Planta" }));
        jPanel1.add(cmbTipoSolicitud);
        cmbTipoSolicitud.setBounds(100, 30, 190, 20);
        jPanel1.add(txtNumSolicitud);
        txtNumSolicitud.setBounds(460, 30, 100, 20);
        jPanel1.add(calendarioViaje);
        calendarioViaje.setBounds(150, 60, 110, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("PENDIENTE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(490, 60, 90, 17);

        panelEstablecimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Retiro en Establecimiento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        panelEstablecimiento.setLayout(null);

        tblProductor1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productor", "Número de Documento"
            }
        ));
        jScrollPane1.setViewportView(tblProductor1);

        panelEstablecimiento.add(jScrollPane1);
        jScrollPane1.setBounds(60, 30, 500, 150);

        btnAgregarProductor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        panelEstablecimiento.add(btnAgregarProductor1);
        btnAgregarProductor1.setBounds(570, 90, 40, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Establecimiento");
        panelEstablecimiento.add(jLabel6);
        jLabel6.setBounds(20, 200, 110, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Productor");
        panelEstablecimiento.add(jLabel7);
        jLabel7.setBounds(370, 200, 80, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Tipo Cereal");
        panelEstablecimiento.add(jLabel8);
        jLabel8.setBounds(40, 230, 100, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Hectáreas a Trillar");
        panelEstablecimiento.add(jLabel9);
        jLabel9.setBounds(330, 230, 140, 20);

        panelEstablecimiento.add(cmbEstablecimiento1);
        cmbEstablecimiento1.setBounds(120, 200, 200, 20);
        panelEstablecimiento.add(txtProductor1);
        txtProductor1.setBounds(440, 200, 160, 20);

        panelEstablecimiento.add(cmbTipoCereal1);
        cmbTipoCereal1.setBounds(120, 230, 120, 20);
        panelEstablecimiento.add(txtHas1);
        txtHas1.setBounds(440, 230, 110, 20);

        panelPlanta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Retiro en Planta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        panelPlanta.setLayout(null);

        tblProductor2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productor", "Número de Documento"
            }
        ));
        jScrollPane2.setViewportView(tblProductor2);

        panelPlanta.add(jScrollPane2);
        jScrollPane2.setBounds(60, 30, 500, 140);

        btnAgregarProductor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAgregarProductor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductor2ActionPerformed(evt);
            }
        });
        panelPlanta.add(btnAgregarProductor2);
        btnAgregarProductor2.setBounds(570, 90, 40, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Establecimiento");
        panelPlanta.add(jLabel10);
        jLabel10.setBounds(20, 190, 120, 20);

        panelPlanta.add(cmbEstablecimiento2);
        cmbEstablecimiento2.setBounds(120, 190, 200, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Productor");
        panelPlanta.add(jLabel11);
        jLabel11.setBounds(390, 190, 80, 20);
        panelPlanta.add(txtProductor2);
        txtProductor2.setBounds(450, 190, 160, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Tipo Cereal");
        panelPlanta.add(jLabel12);
        jLabel12.setBounds(40, 220, 100, 20);

        panelPlanta.add(cmbTipoCereal2);
        cmbTipoCereal2.setBounds(120, 220, 120, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Silo Nº");
        panelPlanta.add(jLabel13);
        jLabel13.setBounds(400, 220, 80, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Tipo Operacion");
        panelPlanta.add(jLabel14);
        jLabel14.setBounds(20, 250, 120, 20);

        panelPlanta.add(cmbTipoOperacion2);
        cmbTipoOperacion2.setBounds(120, 250, 120, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Toneladas a Extraer");
        panelPlanta.add(jLabel15);
        jLabel15.setBounds(330, 250, 150, 20);
        panelPlanta.add(txtToneladas2);
        txtToneladas2.setBounds(450, 250, 90, 20);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Destino");
        panelPlanta.add(jLabel20);
        jLabel20.setBounds(60, 280, 80, 20);

        panelPlanta.add(cmbDestino2);
        cmbDestino2.setBounds(120, 280, 120, 20);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("Nombre");
        panelPlanta.add(jLabel21);
        jLabel21.setBounds(390, 280, 90, 20);

        panelPlanta.add(cmbNombre2);
        cmbNombre2.setBounds(450, 280, 170, 20);

        panelPlanta.add(cmbSilo2);
        cmbSilo2.setBounds(450, 220, 90, 20);

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");

        btnSalir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");

        btnGuardar1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icononuevo.PNG"))); // NOI18N
        btnGuardar1.setText("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelEstablecimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(panelPlanta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstablecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductor2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProductor1;
    private javax.swing.JButton btnAgregarProductor2;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnSalir;
    private datechooser.beans.DateChooserCombo calendarioViaje;
    private javax.swing.JComboBox cmbDestino2;
    private javax.swing.JComboBox cmbEstablecimiento1;
    private javax.swing.JComboBox cmbEstablecimiento2;
    private javax.swing.JComboBox cmbNombre2;
    private javax.swing.JComboBox cmbSilo2;
    private javax.swing.JComboBox cmbTipoCereal1;
    private javax.swing.JComboBox cmbTipoCereal2;
    private javax.swing.JComboBox cmbTipoOperacion2;
    private javax.swing.JComboBox cmbTipoSolicitud;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelEstablecimiento;
    private javax.swing.JPanel panelPlanta;
    private javax.swing.JTable tblProductor1;
    private javax.swing.JTable tblProductor2;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHas1;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNumSolicitud;
    private javax.swing.JTextField txtProductor1;
    private javax.swing.JTextField txtProductor2;
    private javax.swing.JTextField txtToneladas2;
    // End of variables declaration//GEN-END:variables
}
