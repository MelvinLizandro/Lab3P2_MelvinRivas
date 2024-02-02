/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_melvinrivas;

/**
 *
 * @author l3306
 */
public class Grasstype extends Pokemon {
    String  habitad;
    int domplantas;

    public Grasstype(String habitad, int domplantas) {
        this.habitad = habitad;
        this.domplantas = domplantas;
    }

    public String getHabitad() {
        return habitad;
    }

    public int getDomplantas() {
        return domplantas;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public void setDomplantas(int domplantas) {
        this.domplantas = domplantas;
    }
    
    
}
