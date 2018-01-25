/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.recintofiscal.model;

/**
 *
 * @author EduardoC
 */
public class SolicitudDetalle {
    
    
    Integer id;
    Integer solicitud_id;
    Integer division;
    Integer consecutivo;
    Integer numero_bultos;
    Integer tipo_empaque;
    Double dimension_largo;
    Double dimension_ancho;
    Double dimension_alto;
    Double volumen;
    Double peso;
    String contenedor;
    String ubicacion;
    Double numero_piezas;
    Integer estado;
    

    public SolicitudDetalle() {
        
    }
    
}
