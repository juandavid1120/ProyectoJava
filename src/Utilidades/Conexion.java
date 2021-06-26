/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conexion {
    private Connection con;
    
    public Connection getCon() {
        ConexionDB();
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
   
    static {
        try{
             Class.forName("com.mysql.cj.jdbc.Driver").newInstance();   
               
            }
            catch(ClassNotFoundException e1)
            {
                System.out.println("ClassNotFoundException "+e1.getMessage());
            }
            catch (InstantiationException e2)
            {
               System.out.println("InstantiationException "+e2.getMessage());
            }
            catch (IllegalAccessException e3)
            {
                    System.out.println("IllegalAccessException "+e3.getMessage());
            }catch(Exception e){
                System.out.println("Exception "+e.getMessage());
            }
    }
    
    public void ConexionDB()
    {
    try{        
       //setCon(DriverManager.getConnection("jdbc:motor://ubicacionBD:puerto/nombreBD","usuario","clave"));
        setCon(DriverManager.getConnection("jdbc:mysql://localhost:3306/juegocarros","root",""));

        }
        catch (SQLException e4){
            System.out.println("SQLException "+e4.getMessage());
        }
        catch (Exception e5){
            System.out.println("otra "+e5.getMessage());
        }
     }
    
    
}
