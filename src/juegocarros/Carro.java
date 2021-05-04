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
public class Carro {
   private static int Codigo;
    private  String Nombre;
    private String Marca;
    private String Color;
    private String Placa;
    private Carril objCarril;

    public Carro(String Nombre, String Marca, String Color, String Placa,int sw,Carril objCarril) {
         if(sw==0){
           this.Codigo = 1;
       }else
       {
           this.Codigo=Codigo+1;
       }
        this.objCarril=objCarril;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Color = Color;
        this.Placa = Placa;
    }

    public Carril getObjCarril() {
        return objCarril;
    }

    public void setObjCarril(Carril objCarril) {
        this.objCarril = objCarril;
    }

    
    
    

    public static int getCodigo() {
        return Codigo;
    }

    public static void setCodigo(int Codigo) {
        Carro.Codigo = Codigo;
    }

    
    
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
    
}
