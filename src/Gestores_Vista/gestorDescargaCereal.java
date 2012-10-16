/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestores_Vista;

import Clases_Modulo_Carga.*;
import Clases_Modulo_Cliente.Establecimiento;
import Clases_Modulo_Cliente.Lote;
import Clases_Modulo_Transporte.Transportista;
import Clases_Modulo_Transporte.Vehiculo;
import Clases_Modulo_Viaje.*;
import Hibernate.GestorHibernate;
import java.util.Iterator;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandra
 */
public class gestorDescargaCereal extends GestorHibernate {

    public JTable rellenaTablaProductor(JTable tabla){
       DefaultTableModel modeloT = (DefaultTableModel) tabla.getModel();
       Iterator ite = this.listarClase(Viaje.class).iterator();
       while(ite.hasNext()){
           Viaje viaje = (Viaje) ite.next();
           if(viaje.getEstado()=="En Proceso" && viaje.getTipoViaje().getNombreTipoViaje()== "Retiro"){
               Iterator ite1 = this.listarClase(EstablecimientoPorSolicitud.class).iterator();
               while(ite1.hasNext()){
                   EstablecimientoPorSolicitud est = (EstablecimientoPorSolicitud) ite1.next();
                   if(est.getSolicitud()==viaje.getSolicitud()){
                       Object fila[]= {est.getEstablecimiento(), est.getEstablecimiento().getProductor(), viaje.getIdViaje()};
                       modeloT.addRow(fila);
                   }
               }
           }
           
       }
       tabla.setModel(modeloT);
       return tabla;
   }
    
        
       public DefaultComboBoxModel rellenaComboSilo(){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       Iterator ite = this.listarClase(Silo.class).iterator();
       while(ite.hasNext()){
           Silo tipo =(Silo) ite.next();
               modelo.addElement(tipo.getNumeroSilo());
           }
       return modelo;
   }
       
       
     public void guardarDescarga(JTable tablaCaracteristica, JTextField establecimiento, JTextField fecha, JTextField viaje, TipoCereal tipoCereal, JTextField toneladas, Transportista transportista, JComboBox silo){
     DefaultTableModel modeloTabla = (DefaultTableModel) tablaCaracteristica.getModel();  
   
        Iterator iterator = this.listarClase(Descarga.class).iterator();
        if(iterator.hasNext()==false){
            Descarga descarga = new Descarga();
            descarga.setCereal((TipoCereal)tipoCereal);
            descarga.setFecha(fecha.getText());
            descarga.setNumeroViaje(Integer.parseInt(viaje.getText()));
            descarga.setToneladas(Double.parseDouble(toneladas.getText()));
            descarga.setTransportista((Transportista)transportista);
            descarga.setSilo((Silo)silo.getSelectedItem());
            this.guardarObjeto(descarga);
            MuestraTomada muestra = new MuestraTomada();
            muestra.setDescarga(descarga);
            muestra.setEstado(0);
            this.guardarObjeto(muestra);
            for (int i=0; i< modeloTabla.getRowCount(); i++){
                CaracteristicasPorTipoDeCerealPorMuestra c = new CaracteristicasPorTipoDeCerealPorMuestra();
                c.setMuestra(muestra);
                c.setTipoCereal((TipoCereal)tipoCereal);
                c.setCaracteristicas((CaracteristicasCereal)modeloTabla.getValueAt(i, 0));
                c.setValor(Double.parseDouble(modeloTabla.getValueAt(i, 1).toString()));
                this.guardarObjeto(c);
            }
            
        }
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                int bandera=0;
                CaracteristicasPorTipoDeCerealPorMuestra caracteristicas = new CaracteristicasPorTipoDeCerealPorMuestra();
                Iterator ite = this.listarClase(CaracteristicasPorTipoDeCerealPorMuestra.class).iterator();
                while(ite.hasNext()){
                    CaracteristicasPorTipoDeCerealPorMuestra c = (CaracteristicasPorTipoDeCerealPorMuestra) ite.next();
                    if((c.getCaracteristicas()==(modeloTabla.getValueAt(i,0)))){
                         bandera=1;               
                    }
                }
                if(bandera==0){
                    Descarga descarga = new Descarga();
                    descarga.setCereal((TipoCereal)tipoCereal);
                    descarga.setFecha(fecha.getText());
                    descarga.setNumeroViaje(Integer.parseInt(viaje.getText()));
                    descarga.setToneladas(Double.parseDouble(toneladas.getText()));
                    descarga.setTransportista((Transportista)transportista);
                    descarga.setSilo((Silo)silo.getSelectedItem());
                    this.guardarObjeto(descarga);
                    MuestraTomada muestra = new MuestraTomada();
                    muestra.setDescarga(descarga);
                    muestra.setEstado(0);
                    this.guardarObjeto(muestra);
                    for (int j=0; j< modeloTabla.getRowCount(); j++){
                        CaracteristicasPorTipoDeCerealPorMuestra c = new CaracteristicasPorTipoDeCerealPorMuestra();
                        c.setMuestra(muestra);
                        c.setTipoCereal((TipoCereal)tipoCereal);
                        c.setCaracteristicas((CaracteristicasCereal)modeloTabla.getValueAt(j, 0));
                        c.setValor(Double.parseDouble(modeloTabla.getValueAt(j, 1).toString()));
                        this.guardarObjeto(c);
                    }
                 }
                }
     
     }
     
     public long obtenerNumeroMuestra(){
         Iterator ite = listarClase(MuestraTomada.class).iterator();
         long numero=0;
         while(ite.hasNext()){
            MuestraTomada muestra = (MuestraTomada) ite.next();
            numero= muestra.getNumeroMuestra();
         }
         return numero;
     }
}
