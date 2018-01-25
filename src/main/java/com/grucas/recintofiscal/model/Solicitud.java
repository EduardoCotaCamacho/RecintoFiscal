package com.grucas.recintofiscal.model;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EduardoC
 */
public class Solicitud {
    
    Integer id;
    Integer division;
    Integer tipo_operacion;
    String orden_cliente;
    Integer corresponsal;
    Integer linea_transporte;
    Integer consignatario;
    Integer cliente;
    Float cantidad_bultos;
    Integer tipo_empaque;
    String descripcion_mercancia;
    Float peso;
    Float volumen;
    String dgr;
    String numero_imo;
    String marcas;
    Integer puerto_origen;
    Integer puerto_descarga;
    Integer agente_aduanal;
    String viaje;
    String barco;
    Date eta;
    String bl;
    Integer estado;
    String ubicacion;
    String observaciones;
    

    public Solicitud() {
    }
    
       
}
