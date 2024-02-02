/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_melvinrivas;

/**
 *
 * @author l3306
 */
public class Firetype extends Pokemon {
    int potellamas;

    public Firetype(int potellamas, String nombre, int numpoke, String naturaleza, boolean capturado) {
        super(nombre, numpoke, naturaleza, capturado);
        this.potellamas = potellamas;
    }


    public int getPotellamas() {
        return potellamas;
    }

    public void setPotellamas(int potellamas) {
        this.potellamas = potellamas;
    }
    
    
    
    
}
