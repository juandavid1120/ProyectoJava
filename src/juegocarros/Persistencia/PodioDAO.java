/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarros.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import juegocarros.Jugador;

/**
 *
 * @author Usuario
 */
public class PodioDAO {

    public boolean guardarPodio(Connection con, List<Jugador> ListJugador, int idJuego) {

        boolean resultado = true;

        Jugador objJugador = null;
        try {
            //Se deben asignar los valores a los  ? que son los parametros de la consulta.... ojo el orden importa
            PreparedStatement p = con.prepareStatement(JuegoCarrosHelper.guardarPodio());
           
           
            p.setString(1, ListJugador.get(0).getNombre());
            p.setInt(2, 1);
            p.setInt(3, 1);
            p.execute();

            PreparedStatement p2 = con.prepareStatement(JuegoCarrosHelper.guardarPodio());
      
            
            p2.setString(1, ListJugador.get(1).getNombre());
            p2.setInt(2, 2);
            p2.setInt(3, 1);
            p2.execute();
//           
            PreparedStatement p3 = con.prepareStatement(JuegoCarrosHelper.guardarPodio());
            
            
            p3.setString(1, ListJugador.get(2).getNombre());
            p3.setInt(2, 3);
            p3.setInt(3, 1);

            //Resulset permite recibir el resultado que arroja la consulta select en la base de datos
            p3.execute();
            JOptionPane.showMessageDialog(null, "se guardaron los datos");

        } catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        } finally {
            try {
                con.close();
            } catch (Exception clo) {
            }
        }
        return resultado;

    }
}
