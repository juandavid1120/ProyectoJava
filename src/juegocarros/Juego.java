/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarros;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Juego {

    private static int Codigo;

    private List<Jugador> Lista = new ArrayList<Jugador>();

    private Carril ObjCarril;
    private Carro objCarro;
    private Pista objPista;
    private Conductor ObjConductor;

//    Conductor
    public List<Jugador> getLista() {
        return Lista;
    }

    public void setLista(List<Jugador> Lista) {
        this.Lista = Lista;
    }

    public Conductor getObjConductor() {
        return ObjConductor;
    }

    public void setObjConductor(Conductor ObjConductor) {
        this.ObjConductor = ObjConductor;
    }

    public Juego(int sw) {

        if (sw == 0) {
            this.Codigo = 1;
        } else {
            this.Codigo = Codigo + 1;
        }

    }

    public Juego() {

    }

    public void CrearJugador() {
        JOptionPane.showMessageDialog(null, "Vamos a crear un jugador");
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador");

        int Sw = (Codigo == 1) ? 0 : 1;

        Lista.add(new Jugador(nombre, Sw, ObjConductor));

    }

    public void CrearConductor() {

        Conductor ObjConductor1 = new Conductor(objCarro);
        this.ObjConductor = ObjConductor1;

    }

    public void CrearCarro() {
        String Nombre, Marca, Color, Placa;
        JOptionPane.showMessageDialog(null, "Vamos a crear un carro");
        Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre carro");
        Marca = JOptionPane.showInputDialog(null, "Ingrese la Marca ");
        Color = JOptionPane.showInputDialog(null, "Ingrese el Color ");
        Placa = JOptionPane.showInputDialog(null, "Ingrese la placa ");

        int Sw = (Codigo == 1) ? 0 : 1;

        Carro ObjCarro = new Carro(Nombre, Marca, Color, Placa, Sw, objPista.crearCarril());
        this.objCarro = ObjCarro;

    }

    public void CrearPista() {
        String Nombre;
        double Distancia;
        JOptionPane.showMessageDialog(null, "Vamos a crear una pista");
        Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la pista");
        Distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la distancia de la pista(en kilometros) "));
        int Sw = (Codigo == 1) ? 0 : 1;
        Pista ObjPista1 = new Pista(Nombre, Distancia, Sw);
        this.objPista = ObjPista1;

    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public Carro getObjCarro() {
        return objCarro;
    }

    public void setObjCarro(Carro objCarro) {
        this.objCarro = objCarro;
    }

    public Pista getObjPista() {
        return objPista;
    }

    public void setObjPista(Pista objPista) {
        this.objPista = objPista;
    }

    public void configurarJuego() {
        int aux = 0, option = 0;
        
        JOptionPane.showMessageDialog(null, "Vamos a crear todo los objetos, para inicar el juego minimo dos jugadores, ¡Mucha Suerte! ");
        CrearPista();
        while (option == 0) {

            this.ObjCarril = objPista.crearCarril();
            CrearCarro();
            CrearConductor();
            CrearJugador();
            aux += 1;
            if (aux >= 2) {
                option = JOptionPane.showConfirmDialog(null, "¿Quieres crear otro jugador?", "a", JOptionPane.YES_NO_OPTION);
                if (option == 1) {
                    option = 1;
                }

            }

        }

    }

}
