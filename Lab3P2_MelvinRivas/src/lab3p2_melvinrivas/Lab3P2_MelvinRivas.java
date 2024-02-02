/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_melvinrivas;

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
