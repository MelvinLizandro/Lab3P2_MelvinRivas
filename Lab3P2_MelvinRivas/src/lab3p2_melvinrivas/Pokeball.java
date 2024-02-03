/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_melvinrivas;

/**
 *
 * @author l3306
 */
public class Pokeball {
    String color;
    int numserie;
    int eficiencia;

    public Pokeball(String color, int numserie, int eficiencia) {
        this.color = color;
        this.numserie = numserie;
        this.eficiencia = eficiencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "Pokeball{" + "Color: " + color + ", Numero serie: " + numserie + ", Eficiencia: " + eficiencia + '}';
    }
    
    
}
