/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */

public class Conectar {
    public static final String url = "jdbc:mysql://localhost:3306/proyecto_tienda";
public static final String user = "root";
public static final String pass = "root";
      public static Connection getConexion(){
    
     // "databaseName=proyecto_tienda;"
     
              /*"user=root;"
              + "password=root;"            
              + "loginTimeout=30;";*/
        try{     
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            return con;

            /*con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            JOptionPane.showMessageDialog(null,"Conexion establecida");*/
        }catch(Exception e){            
            //JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        System.out.println("No fue posible realizar la conexion" + e);
        return null;
        }
    }
}
