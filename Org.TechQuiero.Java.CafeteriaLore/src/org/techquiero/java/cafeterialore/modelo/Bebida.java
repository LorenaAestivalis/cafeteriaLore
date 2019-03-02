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
public class Bebida {
    private String nombre;
    private double precio;
    private boolean conLeche;
    private int tamano;

    public Bebida(String nombre, double precio, boolean conLeche, int tamano) {
        this.nombre = nombre;
        this.precio = precio;
        this.conLeche = conLeche;
        this.tamano = tamano;
    }

  
   

  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setPrecio(int tamanio) {
        if(tamanio==1)
            this.precio = 40.0;
        if(tamanio==2)
            this.precio = 60.0;
        else
            this.precio = 80.0;
    }
     

    public boolean isConLeche() {
        return conLeche;
    }

    public void setConLeche(boolean conLeche) {
        this.conLeche = conLeche;
    }

    public int getTamano() {
        
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
        setPrecio(tamano);
               
    }

    @Override
    public String toString() {
        return "Bebida{" + "nombre=" + nombre + ", precio=" + precio + ", conLeche=" + conLeche + ", tamano=" + tamano + '}';
    }

 
    
}
