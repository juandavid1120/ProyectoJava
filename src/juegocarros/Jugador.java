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
public class Jugador {
    
     private static int Id;
     private String Nombre;
    private Conductor ObjConductor;

    public Conductor getObjConductor() {
        return ObjConductor;
    }

    public void setObjConductor(Conductor ObjConductor) {
        this.ObjConductor = ObjConductor;
    }

    public Jugador( String Nombre,int sw, Conductor ObjConductor) {
        
        if(sw==0){
           this.Id = 0;
       }else
       {
           this.Id=Id+1;
       }
        
        this.Nombre = Nombre;
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
    
    
}
