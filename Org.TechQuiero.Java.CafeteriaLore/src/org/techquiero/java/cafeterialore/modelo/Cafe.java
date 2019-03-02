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
public class Cafe extends Bebida {
    public String granoDeCafe;

    public Cafe(String granoDeCafe, String nombre, double precio, boolean conLeche, int tamano) {
        super(nombre, precio, conLeche, tamano);
        this.granoDeCafe = granoDeCafe;
    }

    
    public String getGranoDeCafe() {
        return granoDeCafe;
    }

    public void setGranoDeCafe(String granoDeCafe) {
        this.granoDeCafe = granoDeCafe;
    }

    
 
   

   

    
    
}
