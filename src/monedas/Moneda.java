/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monedas;


/**
 *
 * @author Luis Oviedo
 */
public class Moneda {

 
    public Moneda() {
    }

    private double cambio = 0;
 
    
    public double conversion(String peso){
        
        switch (peso) {
            case "Dolar(es)" -> cambio = 4116.76;
            case "Euro(s)" -> cambio = 4621.09;
            case "Libras Esterlinas" -> cambio = 5405.05;
            case "Yen(es) Japones" -> cambio = 29.82;
            case "Won(es) sur-coreano" -> cambio = 3.25;
            case "Peso(s) Colombiano(s)" -> cambio = 1;
        }

        return cambio;
    }
    
    
    
    
}
