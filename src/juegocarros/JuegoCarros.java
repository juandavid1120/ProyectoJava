/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarros;

/**
 *
 * @author Usuario
 */
public class JuegoCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ingreso objIngreso= new Ingreso();
        //objIngreso.show();
        Juego ObjJuego=new Juego(0);        
        ObjJuego.configurarJuego();
        ObjJuego.iniciarJuego();
    }
    
}
