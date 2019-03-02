/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.techquiero.java.cafeterialore.modelo;

import java.sql.*;
import java.io.IOException.*;

/**
 *
 * @author claudia11
 */
public class Conexion {
    private static String  url = "localhost";
    private static String  usuario = "lore";
    private static String baseDatos="Cafeteria";
    private static String  password = "java";
    private static int puerto = 1527;
    private static String servidor ="jdbc:derby://"+url+":"+
                        puerto+"/"+baseDatos;
    public static Connection connetion  = null;
    

 
        
        
    public static Connection get1(){
         
        //Registrar el driver
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR AL REGISTRAR EL DRIVER");
            System.exit(0); //parar la ejecuciÃ³n
        }
 
        //Establecer la conexiÃ³n con el servidor
        try {
            connetion = DriverManager.getConnection(servidor,
                        usuario, password);
        } catch (SQLException e) {
            System.err.println("ERROR AL CONECTAR CON EL SERVIDOR");
            System.exit(0); //parar la ejecuciÃ³n
        }
        System.out.println("Conectado a "+baseDatos);
    return connetion;
}
}