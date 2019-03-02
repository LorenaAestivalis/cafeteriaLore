/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.techquiero.java.cafeterialore.modelo;

/**
 *
 * @author claudia11
 */
public class Te extends Bebida {
    public String tipoDeHoja;

  
    public Te(String tipoDeHoja, String nombre, double precio, boolean conLeche, int tamano) {
        super(nombre, precio, conLeche, tamano);
        this.tipoDeHoja = tipoDeHoja;
    }

  
    public String getTipoDeHoja() {
        return tipoDeHoja;
    }

   

    public void setTipoDeHoja(String tipoDeHoja) {
        this.tipoDeHoja = tipoDeHoja;
    }

    @Override
    public String toString() {
        return "Te{" + "tipoDeHoja=" + tipoDeHoja + '}';
    }
    
            
}
