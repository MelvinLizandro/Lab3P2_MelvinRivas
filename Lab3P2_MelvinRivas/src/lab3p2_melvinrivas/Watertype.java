/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_melvinrivas;

/**
 *
 * @author l3306
 */
public class Watertype extends Pokemon{
    
    boolean respira; //representa si puede estar fuera del agua o no 
    int velonadar; //velocidad al nadar

    public Watertype() {
        
        
    }
    
    public Watertype(boolean respira, int velonadar, String nombre, int numpoke, String naturaleza, boolean capturado) {
        super(nombre, numpoke, naturaleza, capturado);
        this.respira = respira;
        this.velonadar = velonadar;
    }

@Override
    public String toString() {
        return super.toString() + ", Respira: " + respira + ", Velocidad al nadar: "+ velonadar;
    }
    
}
