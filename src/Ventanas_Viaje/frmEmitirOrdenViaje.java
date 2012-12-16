/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Viaje;

import Clases_Modulo_Carga.EstablecimientoPorSolicitud;
import Clases_Modulo_Carga.PuertoPorSolicitud;
import Clases_Modulo_Cliente.Productor;
import Clases_Modulo_Transporte.CargaCombustible;
import Clases_Modulo_Transporte.OrdenServicio;
import Clases_Modulo_Viaje.EstablecimientoPorViaje;
import Clases_Modulo_Viaje.OrdenViaje;
import Clases_Modulo_Viaje.PuertoPorViaje;
import Clases_Modulo_Viaje.Viaje;
import Gestores_Vista.gestorEmitirOrden;
import Hibernate.GestorHibernate;
import java.awt.*;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carolina
 */
public class frmEmitirOrdenViaje extends javax.swing.JInternalFrame {
gestorEmitirOrden gestorE = new gestorEmitirOrden();
GestorHibernate gestorH = new GestorHibernate();
    /**
     * Creates new form frmEmitirOrdenViaje
     */
    public frmEmitirOrdenViaje() {
        initComponents();
        gestorH.actualizarUsuario(labelusuario);
        txtFecha.setEnabled(false);
        txtFecha.setEditable(false);
        txtHora.setEditable(false);
        txtHora.setEnabled(false);
        txtNumOrden.setEnabled(false);
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
        SimpleDateFormat formateadorHora=new SimpleDateFormat("HH:mm");
        txtHora.setText(formateadorHora.format(calendario.getTime()));
        
       
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 780;
        int alto = 600;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 20);
        
         //redimensionar columnas de la tabla
        tblViaje.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblViaje.getColumnModel().getColumn(1).setPreferredWidth(70);  
        tblViaje.getColumnModel().getColumn(2).setPreferredWidth(100); 
        tblViaje.getColumnModel().getColumn(3).setPreferredWidth(70);    
        
        lblHas.setVisible(true);
        lblToneladas.setVisible(false);
        calendarioDViaje.setEnabled(false);
        calendarioHViaje.setEnabled(false);
        txtNumViaje.setEnabled(false);
        cmbProductor.setEnabled(false);
        cmbProductor.setModel(gestorE.rellenaComboProductor());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelusuario = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        calendarioHViaje = new datechooser.beans.DateChooserCombo();
        calendarioDViaje = new datechooser.beans.DateChooserCombo();
        jPanel7 = new javax.swing.JPanel();
        txtNumViaje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        cmbProductor = new javax.swing.JComboBox();
        btnBuscarViaje = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViaje = new javax.swing.JTable();
        btnAceptarViaje = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTransportista = new javax.swing.JTextField();
        txtResponsable = new javax.swing.JTextField();
        txtVehiculo = new javax.swing.JTextField();
        txtTara = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTipoVehiculo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumOrden = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        lblHas = new javax.swing.JLabel();
        txtHas = new javax.swing.JTextField();
        lblToneladas = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ckFecha = new javax.swing.JCheckBox();
        ckNumViaje = new javax.swing.JCheckBox();
        ckProductor = new javax.swing.JCheckBox();
        btnAceptarTodos = new javax.swing.JButton();
        btnQuitarTodos = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Orden Viaje");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Fecha");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 60, 20);
        jPanel1.add(txtHora);
        txtHora.setBounds(190, 10, 70, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hora");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(155, 10, 51, 20);

        labelusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelusuario.setText("Carolina");
        jPanel1.add(labelusuario);
        labelusuario.setBounds(551, 0, 50, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(600, 0, 30, 30);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(50, 10, 70, 20);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel6.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Desde");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(10, 30, 60, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Hasta");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(160, 30, 60, 20);

        calendarioHViaje.setLocale(new java.util.Locale("es", "AR", ""));
        jPanel6.add(calendarioHViaje);
        calendarioHViaje.setBounds(200, 30, 90, 20);

        calendarioDViaje.setLocale(new java.util.Locale("es", "AR", ""));
        jPanel6.add(calendarioDViaje);
        calendarioDViaje.setBounds(50, 30, 90, 20);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero Viaje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel7.setLayout(null);
        jPanel7.add(txtNumViaje);
        txtNumViaje.setBounds(50, 30, 100, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nº");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(20, 30, 50, 20);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(cmbProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbProductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscarViaje.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnBuscarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarViaje.setText("Buscar");
        btnBuscarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarViajeActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Viajes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel2.setLayout(null);

        tblViaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Viaje", "Fecha", "Productor", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblViaje);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(101, 20, 550, 127);

        btnAceptarViaje.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAceptarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAceptarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarViajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptarViaje);
        btnAceptarViaje.setBounds(660, 70, 50, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Vehículo");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(70, 160, 100, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Transportista");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(410, 160, 100, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Tipo Vehiculo");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 190, 120, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Tara");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(450, 190, 50, 20);
        jPanel2.add(txtTransportista);
        txtTransportista.setBounds(490, 160, 210, 20);
        jPanel2.add(txtResponsable);
        txtResponsable.setBounds(130, 220, 190, 20);
        jPanel2.add(txtVehiculo);
        txtVehiculo.setBounds(130, 160, 220, 20);
        jPanel2.add(txtTara);
        txtTara.setBounds(490, 190, 110, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Responsable");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 220, 120, 20);
        jPanel2.add(txtTipoVehiculo);
        txtTipoVehiculo.setBounds(130, 190, 190, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Número Orden");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(400, 250, 120, 20);
        jPanel2.add(txtNumOrden);
        txtNumOrden.setBounds(490, 250, 110, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Destino");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(440, 220, 80, 20);
        jPanel2.add(txtDestino);
        txtDestino.setBounds(490, 220, 180, 20);

        lblHas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblHas.setText("Hectareas a Trillar");
        jPanel2.add(lblHas);
        lblHas.setBounds(10, 250, 130, 20);
        jPanel2.add(txtHas);
        txtHas.setBounds(130, 250, 150, 20);

        lblToneladas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblToneladas.setText("Toneladas a Extraer");
        jPanel2.add(lblToneladas);
        lblToneladas.setBounds(10, 250, 140, 20);

        btnImprimir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icononuevo.PNG"))); // NOI18N
        btnNuevo.setText("Nuevo");

        btnSalir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Buscar Viajes por");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(12, 15, 170, 40);

        ckFecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ckFecha.setText("Fecha");
        jPanel3.add(ckFecha);
        ckFecha.setBounds(210, 20, 80, 30);

        ckNumViaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ckNumViaje.setText("Número Viaje");
        jPanel3.add(ckNumViaje);
        ckNumViaje.setBounds(330, 20, 120, 30);

        ckProductor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ckProductor.setText("Productor");
        jPanel3.add(ckProductor);
        ckProductor.setBounds(490, 20, 100, 30);

        btnAceptarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_mas.png"))); // NOI18N
        btnAceptarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarTodosActionPerformed(evt);
            }
        });
        jPanel3.add(btnAceptarTodos);
        btnAceptarTodos.setBounds(640, 10, 35, 25);

        btnQuitarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnQuitarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarTodosActionPerformed(evt);
            }
        });
        jPanel3.add(btnQuitarTodos);
        btnQuitarTodos.setBounds(640, 40, 35, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)
                        .addGap(268, 268, 268))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarViajeActionPerformed
       DefaultTableModel modeloTabla = (DefaultTableModel) tblViaje.getModel();
        GestorHibernate gestorH = new GestorHibernate();
        int fila = tblViaje.getSelectedRow();
        Iterator ite = gestorH.listarClase(PuertoPorViaje.class).iterator();
        while(ite.hasNext()){
            PuertoPorViaje puerto = (PuertoPorViaje)ite.next();
            if(puerto.getViaje().getIdViaje()==(modeloTabla.getValueAt(fila, 0))){
                lblToneladas.setVisible(true);
                lblHas.setVisible(false);
                txtVehiculo.setText(puerto.getViaje().getVehiculo().toString());
                txtTransportista.setText(puerto.getViaje().getVehiculo().getTransportista().toString());
                txtTipoVehiculo.setText(puerto.getViaje().getVehiculo().getTipoVehiculo().toString());
                txtTara.setText(String.valueOf(puerto.getViaje().getVehiculo().getTara()));
                txtDestino.setText(puerto.getPuerto().getNombrePuerto());
                Iterator ite1 = gestorH.listarClase(PuertoPorSolicitud.class).iterator();
                while(ite1.hasNext()){
                    PuertoPorSolicitud p = (PuertoPorSolicitud) ite1.next();
                    if(p.getSolicitud()== puerto.getViaje().getSolicitud()){
                        txtHas.setText(String.valueOf(p.getToneladasAExtraer()));
                    }
                }
                //Falta numero de orden
            
            }
        
        }
        Iterator ite2 = gestorH.listarClase(EstablecimientoPorViaje.class).iterator();
        while(ite2.hasNext()){
            EstablecimientoPorViaje est = (EstablecimientoPorViaje)ite2.next();
            if(est.getViaje().getIdViaje()==(modeloTabla.getValueAt(fila, 0))){
                if(est.getViaje().getTipoViaje().getNombreTipoViaje().equalsIgnoreCase("Traslado a Establecimiento")){                
                lblToneladas.setVisible(true);
                lblHas.setVisible(false);              
                }else{
                lblToneladas.setVisible(false);
                lblHas.setVisible(true);
                }
                txtVehiculo.setText(est.getViaje().getVehiculo().toString());
                txtTransportista.setText(est.getViaje().getVehiculo().getTransportista().toString());
                txtTipoVehiculo.setText(est.getViaje().getVehiculo().getTipoVehiculo().toString());
                txtTara.setText(String.valueOf(est.getViaje().getVehiculo().getTara()));
                txtDestino.setText(est.getEstablecimiento().getNombreEstablecimiento());
                Iterator ite1 = gestorH.listarClase(EstablecimientoPorSolicitud.class).iterator();
                while(ite1.hasNext()){
                    EstablecimientoPorSolicitud e = (EstablecimientoPorSolicitud) ite1.next();
                    if(e.getSolicitud()== est.getViaje().getSolicitud() && est.getViaje().getTipoViaje().getNombreTipoViaje().equalsIgnoreCase("Retiro de Establecimiento")){
                        txtHas.setText(String.valueOf(e.getHectareasATrillar()));
                    }
                    if(e.getSolicitud()== est.getViaje().getSolicitud() && est.getViaje().getTipoViaje().getNombreTipoViaje()=="Traslado a Establecimiento"){
                        txtHas.setText(String.valueOf(e.getToneladasAExtraer()));
                    }
                }
                //Falta numero de orden
            
            }
        
        }
    }//GEN-LAST:event_btnAceptarViajeActionPerformed

    private void btnQuitarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarTodosActionPerformed
        calendarioDViaje.setEnabled(false);
        calendarioHViaje.setEnabled(false);
        txtNumViaje.setEnabled(false);
        cmbProductor.setEnabled(false);
    }//GEN-LAST:event_btnQuitarTodosActionPerformed

    private void btnAceptarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarTodosActionPerformed
        if (ckFecha.isSelected()) {
            calendarioHViaje.setEnabled(true);
            calendarioDViaje.setEnabled(true);
        }
        if (ckNumViaje.isSelected()) {
            txtNumViaje.setEnabled(true);
        }
        if (ckProductor.isSelected()) {
            cmbProductor.setEnabled(true);
        }
       
    }//GEN-LAST:event_btnAceptarTodosActionPerformed

    private void btnBuscarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarViajeActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yy");
        Date fecha1 = sdf.parse(calendarioDViaje.getText(), new ParsePosition(0));
        System.out.println("Fecha1" + fecha1);
        Date fecha3 = sdf.parse(calendarioHViaje.getText(), new ParsePosition(0));
        DefaultTableModel modeloT = (DefaultTableModel) tblViaje.getModel();
       
        if(fecha1.before(fecha3)|| calendarioDViaje.isEnabled()==false || fecha1.equals(fecha3)){
        
        //Buscar FECHA
        if(calendarioDViaje.isEnabled() && calendarioHViaje.isEnabled() && txtNumViaje.isEnabled()==false && cmbProductor.isEnabled()==false){
         System.out.println("Prueba Fecha");
         Iterator ite = gestorH.listarClaseFitradaPorString(Viaje.class, "estado", "Con vehiculo asignado").iterator();
         while(ite.hasNext()){
             Viaje viaje = (Viaje) ite.next();
             int bandera = gestorE.buscarObjeto(tblViaje, viaje);
             Date fecha2=null;
                try {
                    fecha2 = sdf2.parse(viaje.getFecha());
                    System.out.println(fecha2);
                } catch (ParseException ex) {
                    Logger.getLogger(frmEmitirOrdenViaje.class.getName()).log(Level.SEVERE, null, ex);
                }
              //comparo el rango de fechas
                  if ((bandera==0) && (((fecha2.after(fecha1)) && (fecha2.before(fecha3))) || fecha2.equals(fecha3) || fecha2.equals(fecha1))) {
                  //Guardo el objeto orden en la tabla
                  gestorE.cargarTabla(tblViaje, viaje);
                  }
             }
         }        
        
         //Buscar NRO VIAJE
        if(calendarioDViaje.isEnabled()==false && calendarioHViaje.isEnabled()==false && txtNumViaje.isEnabled() && cmbProductor.isEnabled()==false){
         Iterator ite = gestorH.listarClase(Viaje.class).iterator();
         while(ite.hasNext()){
             Viaje viaje = (Viaje) ite.next();
             int bandera = gestorE.buscarObjeto(tblViaje, viaje);
             Date fecha2=null;
                try {
                    fecha2 = sdf2.parse(viaje.getFecha());
                    System.out.println(fecha2);
                } catch (ParseException ex) {
                    Logger.getLogger(frmEmitirOrdenViaje.class.getName()).log(Level.SEVERE, null, ex);
                }
              //comparo el rango de fechas
                  if ((bandera==0) && (viaje.getIdViaje()== Long.parseLong(txtNumViaje.getText()))) {
                  //Guardo el objeto orden en la tabla
                  gestorE.cargarTabla(tblViaje, viaje);
                  }
             }
         }        
        
         //Buscar PRODUCTOR
        if(calendarioDViaje.isEnabled()==false && calendarioHViaje.isEnabled()==false && txtNumViaje.isEnabled()==false && cmbProductor.isEnabled()){
         Iterator ite = gestorH.listarClase(Viaje.class).iterator();
         while(ite.hasNext()){
             Viaje viaje = (Viaje) ite.next();
             int bandera = gestorE.buscarObjeto(tblViaje, viaje);
             Date fecha2=null;
                try {
                    fecha2 = sdf2.parse(viaje.getFecha());
                    System.out.println(fecha2);
                } catch (ParseException ex) {
                    Logger.getLogger(frmEmitirOrdenViaje.class.getName()).log(Level.SEVERE, null, ex);
                }
              //comparo el rango de fechas
                  if ((bandera==0) && ((fecha2.after(fecha1)) && (viaje.getProductor().equals(cmbProductor.getSelectedItem())))) {
                  //Guardo el objeto orden en la tabla
                  gestorE.cargarTabla(tblViaje, viaje);
                  }
             }
         }        
        
        // buscar FECHA NRO VIAJE
         if(calendarioDViaje.isEnabled() && calendarioHViaje.isEnabled() && txtNumViaje.isEnabled() && cmbProductor.isEnabled()==false){
         Iterator ite = gestorH.listarClase(Viaje.class).iterator();
         while(ite.hasNext()){
             Viaje viaje = (Viaje) ite.next();
             int bandera = gestorE.buscarObjeto(tblViaje, viaje);
             Date fecha2=null;
                try {
                    fecha2 = sdf2.parse(viaje.getFecha());
                    System.out.println(fecha2);
                } catch (ParseException ex) {
                    Logger.getLogger(frmEmitirOrdenViaje.class.getName()).log(Level.SEVERE, null, ex);
                }
              //comparo el rango de fechas
                  if ((bandera==0) && (viaje.getIdViaje()== Long.parseLong(txtNumViaje.getText())) &&((fecha2.after(fecha1)) && (fecha2.before(fecha3)) || fecha2.equals(fecha3) || fecha2.equals(fecha1))) {
                  //Guardo el objeto orden en la tabla
                  gestorE.cargarTabla(tblViaje, viaje);
                  }
             }
         }        
         
          if(calendarioDViaje.isEnabled() && calendarioHViaje.isEnabled() && txtNumViaje.isEnabled()==false && cmbProductor.isEnabled()){
         Iterator ite = gestorH.listarClase(Viaje.class).iterator();
         while(ite.hasNext()){
             Viaje viaje = (Viaje) ite.next();
             int bandera = gestorE.buscarObjeto(tblViaje, viaje);
             Date fecha2=null;
                try {
                    fecha2 = sdf2.parse(viaje.getFecha());
                    System.out.println(fecha2);
                } catch (ParseException ex) {
                    Logger.getLogger(frmEmitirOrdenViaje.class.getName()).log(Level.SEVERE, null, ex);
                }
              //comparo el rango de fechas
                  if ((bandera==0) && (viaje.getProductor().equals(cmbProductor.getSelectedItem())) &&((fecha2.after(fecha1)) && (fecha2.before(fecha3)) || fecha2.equals(fecha3) || fecha2.equals(fecha1))) {
                  //Guardo el objeto orden en la tabla
                  gestorE.cargarTabla(tblViaje, viaje);
                  }
             }
         }        
          
         //buscar PRODUCTOR NRO ORDEN
         if(calendarioDViaje.isEnabled()==false && calendarioHViaje.isEnabled()==false && txtNumViaje.isEnabled() && cmbProductor.isEnabled()){
         Iterator ite = gestorH.listarClase(Viaje.class).iterator();
         while(ite.hasNext()){
             Viaje viaje = (Viaje) ite.next();
             int bandera = gestorE.buscarObjeto(tblViaje, viaje);
             Date fecha2=null;
                try {
                    fecha2 = sdf2.parse(viaje.getFecha());
                    System.out.println(fecha2);
                } catch (ParseException ex) {
                    Logger.getLogger(frmEmitirOrdenViaje.class.getName()).log(Level.SEVERE, null, ex);
                }
              //comparo el rango de fechas
                  if ((bandera==0) && (viaje.getIdViaje()== Long.parseLong(txtNumViaje.getText())) && (viaje.getProductor().equals(cmbProductor.getSelectedItem()))) {
                  //Guardo el objeto orden en la tabla
                  gestorE.cargarTabla(tblViaje, viaje);
                  }
             }
         }    
         
         //buscar FECHA NRO ORDEN PRODUCTOR
         if(calendarioDViaje.isEnabled() && calendarioHViaje.isEnabled() && txtNumViaje.isEnabled() && cmbProductor.isEnabled()){
         Iterator ite = gestorH.listarClase(Viaje.class).iterator();
         while(ite.hasNext()){
             Viaje viaje = (Viaje) ite.next();
             int bandera = gestorE.buscarObjeto(tblViaje, viaje);
             Date fecha2=null;
                try {
                    fecha2 = sdf2.parse(viaje.getFecha());
                    System.out.println(fecha2);
                } catch (ParseException ex) {
                    Logger.getLogger(frmEmitirOrdenViaje.class.getName()).log(Level.SEVERE, null, ex);
                }
              //comparo el rango de fechas
                  if ((bandera==0) && (viaje.getIdViaje()==Long.parseLong(txtNumViaje.getText()))&& (viaje.getProductor().equals(cmbProductor.getSelectedItem())) &&((fecha2.after(fecha1)) && (fecha2.before(fecha3)) || fecha2.equals(fecha3) || fecha2.equals(fecha1))) {
                  //Guardo el objeto orden en la tabla
                  gestorE.cargarTabla(tblViaje, viaje);
                  }
             }
         }        
        }else {
         JOptionPane.showMessageDialog(null, "Ingrese correctamente el rango de Fechas");
         }
        
        
    }//GEN-LAST:event_btnBuscarViajeActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
       DefaultTableModel modeloTabla = (DefaultTableModel) tblViaje.getModel();
       Iterator ite = gestorH.listarClase(Viaje.class).iterator();
       int fila = tblViaje.getSelectedRow();
       while(ite.hasNext()){
           Viaje viaje = (Viaje) ite.next();
           if(viaje.getIdViaje()== modeloTabla.getValueAt(fila, 0)){
               viaje.setEstado("En Proceso");
               OrdenViaje orden = new OrdenViaje();
               orden.setViaje(viaje);
               orden.setResponsable(txtResponsable.getText());
               gestorH.actualizarObjeto(viaje);
               gestorH.guardarObjeto(orden);
               txtNumOrden.setText(String.valueOf(orden.getNumeroOrden()));
               JOptionPane.showMessageDialog(null, "Se genero correctamente la orden Nº:"+ " " + orden.getNumeroOrden());
               
           }
       }
       
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma que desea salir?");
         if (respuesta==0){
                dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarTodos;
    private javax.swing.JButton btnAceptarViaje;
    private javax.swing.JButton btnBuscarViaje;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnQuitarTodos;
    private javax.swing.JButton btnSalir;
    private datechooser.beans.DateChooserCombo calendarioDViaje;
    private datechooser.beans.DateChooserCombo calendarioHViaje;
    private javax.swing.JCheckBox ckFecha;
    private javax.swing.JCheckBox ckNumViaje;
    private javax.swing.JCheckBox ckProductor;
    private javax.swing.JComboBox cmbProductor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JLabel lblHas;
    private javax.swing.JLabel lblToneladas;
    private javax.swing.JTable tblViaje;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHas;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNumOrden;
    private javax.swing.JTextField txtNumViaje;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtTara;
    private javax.swing.JTextField txtTipoVehiculo;
    private javax.swing.JTextField txtTransportista;
    private javax.swing.JTextField txtVehiculo;
    // End of variables declaration//GEN-END:variables
}
