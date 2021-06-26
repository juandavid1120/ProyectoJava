/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarros;

import Utilidades.Conexion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


import juegocarros.Persistencia.PodioDAO;

/**
 *
 * @author Usuario
 */
public class Juego {
    
    Conexion con= new Conexion();

    private static int Codigo;

    private List<Jugador> Lista = new ArrayList<Jugador>();
    private List<Jugador> ListaGandores = new ArrayList<Jugador>();

    private Carril ObjCarril;
    private Carro objCarro;
    private Pista objPista;
    private Conductor ObjConductor;
    private int ListaSize;

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

    public double getMeta() {
        return objPista.getDistancia();
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
        //  Lista.add(new Jugador("JuanDa", Sw, ObjConductor));

    }

    public void CrearConductor() {

        Conductor ObjConductor1 = new Conductor(objCarro);
        this.ObjConductor = ObjConductor1;

    }

    public void CrearCarro() {
        String Nombre, Marca, Color, Placa;
        JOptionPane.showMessageDialog(null, "Vamos a crear un carro");
//        Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre carro");
//        Marca = JOptionPane.showInputDialog(null, "Ingrese la Marca ");
//        Color = JOptionPane.showInputDialog(null, "Ingrese el Color ");
//        Placa = JOptionPane.showInputDialog(null, "Ingrese la placa ");

        int Sw = (Codigo == 1) ? 0 : 1;

        //  Carro ObjCarro = new Carro(Nombre, Marca, Color, Placa, Sw, objPista.crearCarril());
        Carro ObjCarro = new Carro("ElRojo", "Porche", "NEGRO", "YFA4F", Sw, objPista.crearCarril());
        this.objCarro = ObjCarro;

    }

    public void CrearPista() {
        String Nombre;
        double Distancia;
        JOptionPane.showMessageDialog(null, "Vamos a crear una pista");
        // Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la pista");
        Distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la distancia de la pista(en kilometros) "));
        int Sw = (Codigo == 1) ? 0 : 1;
        //Pista ObjPista1 = new Pista(Nombre, Distancia, Sw);
        Pista ObjPista1 = new Pista("Estadio", Distancia * 1000, Sw);
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

        JOptionPane.showMessageDialog(null, "Vamos a crear todo los objetos, para inicar el juego minimo debe haber tres jugadores, ¡Mucha Suerte! ");
        CrearPista();
        while (option == 0) {

            this.ObjCarril = objPista.crearCarril();
            CrearCarro();
            CrearConductor();
            CrearJugador();
            aux += 1;
            if (aux >= 3) {//
                option = JOptionPane.showConfirmDialog(null, "¿Quieres crear otro jugador?", "a", JOptionPane.YES_NO_OPTION);
                if (option == 1) {
                    option = 1;
                }

            }

        }
        
        

    }

    public double Calculardistancia(int nro) {//calcula la distancia que va avanzar en jugador 
        double Distancia = nro * 100;
        return Distancia;
    }
    
    public void guardarPodio() {
        PodioDAO objpodPodio=new PodioDAO();
      if(  objpodPodio.guardarPodio(con.getCon(),ListaGandores, Codigo))
      {
          JOptionPane.showMessageDialog(null,"Podio guardado correctamente");
         JOptionPane.showMessageDialog(null, "El 1° puesto para el jugar: "+ListaGandores.get(0).getNombre()+" \n El 2° para el jugador: "+
                 ListaGandores.get(0).getNombre()+"\n El 3° puesto para el jugador: "+ListaGandores.get(0).getNombre());
      }
    }

    public int TirarDado() {//permite encontrar un numero aletorio entre 1 y 6
        int num1;
        generarnumeros objDado = new generarnumeros();
        return objDado.calcularnumero();

    }

    public boolean validarNroGanadores() {//valida si ya hay tres ganadores. 
        if (ListaGandores.size() == 3) {
            JOptionPane.showMessageDialog(null, "Ya tres jugadores ganaron.");
            return true;
        } else {
            return false;
        }

    }

    public boolean ValidarGanador(int Pos, int value) {
        int acuJugador = Lista.get(Pos).getDistaciaRecorida();
        if ((acuJugador + value) >= getMeta())//get meta trae la distancia ingresada a la hora de haber sido creada la pista
        {
            ListaGandores.add(Lista.get(Pos));
            Lista.remove(Pos);
            ListaSize = ListaSize - 1;// al remover a un jugador debo quitarle uno al tamaño, para que el siclo recorra un pos menos.

            return false;
        } else {
            return true;
        }

    }

    public void iniciarJuego() {
        boolean jugar = true;//hacer un bucle infinito hasta que se termine el juego
        int sw = 0;//suiche para saber la primera vez que entra
        int num1, contadorJugador = 0;
        ListaSize = Lista.size() - 1;
        int option = JOptionPane.showConfirmDialog(null, "¿Deseas iniciar el juego ?", "a", JOptionPane.YES_NO_OPTION);//Confirmo si quiere iniciar el juego 
        if (option == 0) {

            while (jugar) {

                if (sw == 0) {
                    JOptionPane.showMessageDialog(null, "el jugador: " + Lista.get(contadorJugador).getNombre() + " lanza el dado");
                    num1 = TirarDado();
                    num1 = (int) Calculardistancia(num1);

                    JOptionPane.showMessageDialog(null, "el jugador: " + Lista.get(contadorJugador).getNombre() + " tira el número: " + num1);
                    Lista.get(contadorJugador).setDistaciaRecorida(num1);
                    if (contadorJugador == ListaSize) {
                        sw = 1;
                        contadorJugador = 0;
                    } else {
                        contadorJugador += 1;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "el jugador: " + Lista.get(contadorJugador).getNombre() + " lanza el dado");

                    num1 = TirarDado();
                    num1 = (int) Calculardistancia(num1);
                    JOptionPane.showMessageDialog(null, "el jugador: " + Lista.get(contadorJugador).getNombre() + " tira el número: " + num1);
                    if (ValidarGanador(contadorJugador, num1)) {
                        Lista.get(contadorJugador).setDistaciaRecorida(Lista.get(contadorJugador).getDistaciaRecorida() + num1);

                        JOptionPane.showMessageDialog(null, "el jugador: " + "acumula :" + Lista.get(contadorJugador).getDistaciaRecorida());
                        if (contadorJugador == ListaSize) {//tengo control de la pos, para saber cual es el jugador actual.
                            contadorJugador = 0;
                        } else {
                            contadorJugador += 1;
                        }
                    } else {// pregunto si hay 3 tres ganadores, sino continua la ejecucion
                        if (validarNroGanadores()) {
                            jugar = false;
                        } else {
                            contadorJugador = 0;
                        }

                    }

                }

            }
//            JOptionPane.showMessageDialog(null, "id"+ListaGandores.get(0).getId()+ "Nombre: "+ListaGandores.get(0).getNombre()+"\n"
//                     +"id: "+ListaGandores.get(1).getId()+ "Nombre: "+ListaGandores.get(1).getNombre()+"\n"+
//                    "id"+ListaGandores.get(2).getId()+ "Nombre: "+ListaGandores.get(2).getNombre());
           guardarPodio();

        } else {
            JOptionPane.showMessageDialog(null, "¡Mucha Suerte hasta la proxima! ");
        }
    }
}
