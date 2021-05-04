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
public class Carril {

    private int nroCarril;
    private Carro ObjCarro;

    public Carril(int nroCarril) {
        this.nroCarril = nroCarril;
       
    }

   

    public Carro getObjCarro() {
        return ObjCarro;
    }

    public void setObjCarro(Carro ObjCarro) {
        this.ObjCarro = ObjCarro;
    }

}
