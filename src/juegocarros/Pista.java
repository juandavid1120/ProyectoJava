/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarros;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class Pista {

    private  static int Id;
    private String Nombre;
    private double Distancia;
    
    private java.util.List<Carril> ListaCarril = new ArrayList<Carril>();
    private static int nroCarriles=0;        

    public Pista( String Nombre, double Distancia,int sw) {
           if(sw==0){
           this.Id = 1;
       }else
       {
           this.Id=Id+1;
       }
        this.Nombre = Nombre;
        this.Distancia = Distancia;
    
    }
    
    public Carril crearCarril(){
       int nroCarril=0;
        if(nroCarriles==0){
            nroCarril=1;
        }else
        {
            nroCarril=nroCarriles+1;
        }
        Carril ObjCarrilNro1=new Carril(nroCarril);
        ListaCarril.add(ObjCarrilNro1);
        return ObjCarrilNro1;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getDistancia() {
        return Distancia;
    }

    public void setDistancia(double Distancia) {
        this.Distancia = Distancia;
    }

}
