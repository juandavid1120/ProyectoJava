/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarros.Persistencia;

/**
 *
 * @author Usuario
 */
public class JuegoCarrosHelper {
    public static String guardarPodio(){
        return "INSERT INTO `podio`( `NOMBRE`, `POSICION`, `VECESGANADAS`) VALUES (?,?,?)";
    }
}
