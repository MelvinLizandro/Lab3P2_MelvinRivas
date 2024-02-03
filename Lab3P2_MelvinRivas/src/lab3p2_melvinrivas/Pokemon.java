/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_melvinrivas;

/**
 *
 * @author l3306
 */
public class Pokemon {
    
    String nombre;
    int numpoke;
    String naturaleza;
    boolean capturado;

    public Pokemon() {
    }

    
    public Pokemon(String nombre, int numpoke, String naturaleza, boolean capturado) {
        this.nombre = nombre;
        this.numpoke = numpoke;
        this.naturaleza = naturaleza;
        this.capturado = capturado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getNumpoke() {
        return numpoke;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumpoke(int numpoke) {
        this.numpoke = numpoke;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }
    
    @Override
    public String toString() {
        return "Pokemon: " + "Nombre: " + nombre + ", Numero de entrada: " + numpoke + ", Naturaleza: " + naturaleza + ", Capturado: " + capturado +  ',';
    }



    
    
}
