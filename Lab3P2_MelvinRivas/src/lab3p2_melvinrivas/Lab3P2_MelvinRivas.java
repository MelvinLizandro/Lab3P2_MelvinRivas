/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_melvinrivas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author l3306
 */
public class Lab3P2_MelvinRivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList <Pokemon> poke = new ArrayList();
        
        int op = 0; //op = opciones del menu la inicializamos 
        do {
            System.out.println("1. Crear Pokemon");
            System.out.println("2. Crear Pokebola");
            System.out.println("3. Listar Pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar Pokemon");
            System.out.println("6. Modificar Pokemon");
            System.out.println("7. Salir ");
            System.out.print("Que desea realizar: ");

            op = input.nextInt();

            switch (op) {
                case 1: {
                    System.out.println("Ingrese el nombre del pokemon: ");
                    String nombre = input.nextLine();
                    System.out.println("Ingrese el numero de entrada: ");
                    int  num = input.nextInt();
                    System.out.println("---Naturaleza---");
                    System.out.println("1. Timido");
                    System.out.println("2. Energetico");
                    System.out.println("3. Misterioso");
                    System.out.print("Ingrese su naturaleza: ");
                    int opnatu = input.nextInt();
                    String natu;
                    if (opnatu == 1) {
                        natu = "Timido";
                    }else if (opnatu == 2) {
                        natu = "Energetico";
                    }else if (opnatu == 3) {
                        natu = "Misterioso";
                    }
                    boolean capturado = false;
                    System.out.println("---Tipos de pokemon---");
                    System.out.println("1. Tipo Fuego");
                    System.out.println("2. Tipo Agua");
                    System.out.println("3. Tipo Planta");
                    System.out.print("Que tipo desea: ");
                    int optipo = input.nextInt();
                    if (optipo == 1) {
                        System.out.println("Ingrese la potencia de llama: ");
                        int potellamas = input.nextInt();
                        Firetype fire = new Firetype(potellamas);
                    }else if (optipo == 2) {
                        System.out.println("Puede respirar fuera del agua 1.Si 2.No: ");
                    }
                    break;
                }
                case 2: {

                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
                case 5: {

                    break;
                }
                case 6: {

                    break;
                }
                case 7: {

                    break;
                }
                default: {
                    System.out.println("---Caracter Invalido---");
                    break;
                }
            }

        } while (op != 7);
        System.out.println("");
    }

}
