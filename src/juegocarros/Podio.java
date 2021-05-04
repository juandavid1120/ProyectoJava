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
public class Podio {

    private String Nombre;
    private String Puesto;

    public Podio(String Nombre, String Puesto, String Id) {
        this.Nombre = Nombre;
        this.Puesto = Puesto;
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    private String Id;
   
}
