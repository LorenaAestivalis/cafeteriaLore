/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.techquiero.java.controller;

/**
 *
 * @author claudia11
 */
import org.techquiero.java.cafeterialore.modelo.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.sql.*;

public class OrgTechQuieroJavaCafeteriaLore {

    public static ArrayList<Te> tes = new ArrayList<Te>();
    public static ArrayList<Cafe> cafes = new ArrayList<Cafe>();
    public static Scanner sc = new Scanner(System.in);
    public static Connection connection = null;
    public static Statement s = null;
    public static Conexion claseC;
    public static boolean bandera = false;

    public static void main(String[] args) {
        
        do {
            if (inicio() == 1) {
                
                tes.add(llenado(imprimerTiposDeTe()));
                System.out.println("Desea ordenar otra bebida? 1--->SI  ||   0--->NO  ");
            } else {
                cafes.add(llenado(imprimirTiposDeCafe()));
                System.out.println("Desea ordenar otra bebida? 1--->SI  ||   0--->NO  ");
            }//else
        } while (sc.nextInt() == 1);
        for(Te te:tes){
            te.toString();
        }
        for(Cafe cafe:cafes){
            cafe.toString();
        }
    }

    public static int inicio() {
        System.out.println("	==================================================================================\n"
                + "                            CafeteriaLore S.A DE C.V\n"
                + "			==================================================================================\n"
                + "			    ( (          __      __          __                                          \n"
                + "= 			      ) )	/  \\    /  \\  ____  |  |    ____    ____    _____    ____        \n"
                + "= 			    ........	\\   \\/\\/   /_/ __ \\ |  |  _/ ___\\  /  _ \\  /     \\ _/ __ \\       \n"
                + "= 			    |      |]	 \\        / \\  ___/ |  |__\\  \\___ (  <_> )|  Y Y  \\\\  ___/       \n"
                + "= 			    \\       /	  \\__/\\  /   \\___  >|____/ \\___  > \\____/ |__|_|  / \\___  >      \n"
                + "= 			      `----'	       \\/        \\/            \\/               \\/      \\/       \n"
                + "			==================================================================================\n"
                + "\n"
                + "			==================================================================================\n"
                + "						 .--------------------.	\n"
                + "				      		 |  ORDENAR BEBIDADS  |\n"
                + " 					 	 '--------------------'\n"
                + " 						 .--------.   .--------.\n"
                + "  				    	 	 |	  |   |	       |	 \n"
                + " 					 	 | 1. TE  |   | 2.CAFE |\n"
                + "						 |        |   |        |\n"
                + "					 	 '--------'   '--------'\n"
                + "			==================================================================================\n"
                + "					");
        int bebida = sc.nextInt();
        return (bebida);

    }//inicio

    public static Te imprimerTiposDeTe() {
        connection = claseC.get1();
        ResultSet results = null;
        int contador = 0;
        Te te = new Te("", "", 0.0, false, 0);

        try {
            System.out.println(
                    " 			==================================================================================\n"
                    + "						 .--------------------.	\n"
                    + "				      		 |  ORDENAR BEBIDAS  |\n"
                    + "");
            s = connection.createStatement();
            results = s.executeQuery("SELECT * FROM te ");
            contador = 1;
            while (results.next()) {
                System.out.println("						 .---------------.	\n"
                        + "				      		   " + contador + ". " + results.getString(3) + " \n"
                        + " 					 	 '---------------'\n" + "");
                contador++;
            }

        } catch (SQLException ex) {
            System.err.println("ERROR al obtener los datos");
        }

        int tipoDeTe = sc.nextInt();
        try {
            s = null;
            s = connection.createStatement();
            results = null;

            results = s.executeQuery("SELECT * FROM te WHERE id=" + tipoDeTe);

            while (results.next()) {
                te.setTipoDeHoja(results.getString(3));
                te.setNombre(results.getString(2));
            }
        } catch (SQLException ex) {
            System.err.println("ERROR al obtener los datos");
        }

        return te;
    }

    public static Cafe imprimirTiposDeCafe() {
        connection = claseC.get1();
        ResultSet results = null;
        Cafe cafe = new Cafe("", "", 0.0, false, 0);
        int contador = 1;
        try {
            System.out.println(
                    " 			==================================================================================\n"
                    + "						 .--------------------.	\n"
                    + "				      		 |  ORDENAR BEBIDAS   |\n"
                    + "");
            s = connection.createStatement();
            results = s.executeQuery("SELECT * FROM cafe ");

            while (results.next()) {

                System.out.println("						 .---------------.	\n"
                        + "				      		   " + contador + ". " + results.getString(2) + " \n"
                        + " 					 	 '---------------'\n" + "");
                contador++;
            }
        } catch (SQLException ex) {
            System.err.println("ERROR al obtener los datos");
        }
        
        int tipoDeCafe = sc.nextInt();
        try {
            s = null;
            s = connection.createStatement();
            results = null;

            results = s.executeQuery("SELECT * FROM cafe WHERE id=" + tipoDeCafe);

            while (results.next()) {

                System.err.println("12"
                        + "ERROR al obtener los datos");
                cafe.setGranoDeCafe(results.getString(2));
                cafe.setNombre(results.getString(1));
            }
        } catch (SQLException ex) {
            System.err.println("ERROR al obtener los datos");
        }
        return cafe;
    }

    public static Te llenado(Te te) {
        System.out.println("                                                            .-----------.\n"
                + "                                                            |   TAMAÑO  |					 	\n"
                + "	       			         	               '-----------' \n"
                + " 						 .----------.   .----------.   .----------.\n"
                + "  				    	 	 |	    |   |          |   |          | \n"
                + " 					 	 | 1.CHICO  |   | 2.MEDIANO|   | 3. GRANDE|  \n"
                + "						 |   $40    |   |   $60    |   |    $80   |   \n"
                + "					 	 '----------'   '----------'   '----------' \n"
                + "			==================================================================================\n"
                + "					");
        te.setTamano(sc.nextInt());
        System.out.println(" 						 .-------------.   .-------------.   \n"
                + "  				    	 	 |	       |   |             |    \n"
                + " 					 	 | false.CON LECHE |   | true.SIN LECHE |     \n"
                + "						 |             |   |             |     \n"
                + "					 	 '-------------'   '-------------'    \n"
                + "			==================================================================================\n"
                + "					");
        te.setConLeche(sc.nextBoolean());

        return te;
    }

    public static Cafe llenado(Cafe cafe) {
        System.out.println("                                                            .-----------.\n"
                + "                                                            |   TAMAÑO  |					 	\n"
                + "	       			         	               '-----------' \n"
                + " 						 .----------.   .----------.   .----------.\n"
                + "  				    	 	 |	    |   |          |   |          | \n"
                + " 					 	 | 1.CHICO  |   | 2.MEDIANO|   | 3. GRANDE|  \n"
                + "						 |   $40    |   |   $60    |   |    $80   |   \n"
                + "					 	 '----------'   '----------'   '----------' \n"
                + "			==================================================================================\n"
                + "					");
        cafe.setTamano(sc.nextInt());
        System.out.println(
                  " 						 .-----------------------.      \n"
                + "  				    	 	 |	                 |      \n"
                + " 					 	 | FALSE ---> CON LECHE  |       \n"
                + "						 |                       |      \n"
                + "					 	 '-----------------------'       \n"
                + " 						 .-----------------------.      \n"
                + "  				    	 	 |	                 |      \n"
                + " 					 	 | TRUE ---> SIN LECHE   |       \n"
                + "						 |                       |      \n"
                + "					 	 '-----------------------'       \n"
                + "			==================================================================================\n"
                + "					");
        cafe.setConLeche(sc.nextBoolean());

        return cafe;
    }
}
