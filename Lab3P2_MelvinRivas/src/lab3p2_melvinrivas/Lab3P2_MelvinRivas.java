/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_melvinrivas;

import java.util.ArrayList;
import java.util.Random;
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

        ArrayList <Pokemon> poke = new ArrayList<>();
        ArrayList <Pokeball> poball = new ArrayList();
        
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
                    nombre = input.nextLine();
                    System.out.println("Ingrese el numero de entrada: ");
                    int  num = input.nextInt();
                    System.out.println("---Naturaleza---");
                    System.out.println("1. Timido");
                    System.out.println("2. Energetico");
                    System.out.println("3. Misterioso");
                    System.out.print("Ingrese su naturaleza: ");
                    int opnatu = input.nextInt();
                    String natu= "";
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
                        Firetype fire = new Firetype(potellamas,nombre,num,natu,capturado);
                        poke.add(fire);
                    }else if (optipo == 2) {
                        System.out.println("Puede respirar fuera del agua 1.Si 2.No: ");
                        int opresp = input.nextInt();
                        boolean respira = false;
                        if (opresp == 1) {
                           respira = true; 
                        }else if (opresp == 2) {
                            respira = false;
                        }else{
                            System.out.println("Caracter Invalida");
                        }
                        System.out.println("Ingrese la velocidad de nadar: ");
                        int velocidad = input.nextInt();
                        Watertype water = new Watertype(respira,velocidad,nombre,num,natu,capturado);
                        poke.add(water);
                    }else if (optipo == 3) {
                        System.out.println("Ingrese el habitad del pokemon: ");
                        String habitad = input.nextLine();
                        habitad = input.nextLine();
                        int dominio = 1;
                        do{
                        System.out.println("Ingrese el dominio de plantas (0-100): ");
                         dominio = input.nextInt();
                        }while(dominio <= 0 && dominio >= 100);
                        Grasstype grass = new Grasstype(habitad,dominio,nombre,num,natu,capturado);
                        poke.add(grass);
                        
                    }
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el color de la pokebola: ");
                    String color = input.nextLine();
                    color = input.nextLine();
                    System.out.println("Ingrese el numero de serie: ");
                    int numserie = input.nextInt();
                    Random random = new Random();
                    int eficiencia = random.nextInt(1,3);
                    Pokeball ball = new Pokeball(color,numserie,eficiencia);
                    poball.add(ball);
                    
                    break;
                }
                case 3: {
                    Firetype fire = new Firetype();

                    System.out.println("-----Tipos Fuego-----");
                    for (int i = 0; i < poke.size(); i++) {

                        if (poke.get(i) instanceof Firetype) {
                            System.out.println(poke.get(i));
                        }
                    }
                    System.out.println("");

                    Watertype water = new Watertype();

                    System.out.println("-----Tipos Agua-----");
                    for (int j = 0; j < poke.size(); j++) {
                        if (poke.get(j) instanceof Watertype) {
                            System.out.println(poke.get(j));
                        }

                    }
                    System.out.println("");

                    Grasstype grass = new Grasstype();

                    System.out.println("-----Tipos Planta-----");

                    for (int j = 0; j < poke.size(); j++) {
                        if (poke.get(j) instanceof Grasstype) {
                            System.out.println(poke.get(j));
                        }

                    }
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("-----Eliminador de pokemons-----");
                    System.out.println("1. Tipo fuego");
                    System.out.println("2. Tipo agua");
                    System.out.println("3. Tipo tierra");
                    System.out.println("Cual revisar: ");
                    int optipo2 = input.nextInt();
                    
                    if (optipo2 == 1) {
                        Firetype fire = new Firetype();

                        System.out.println("-----Tipos Fuego-----");
                        for (int i = 0; i < poke.size(); i++) {

                            if (poke.get(i) instanceof Firetype) {
                                System.out.println(i+". "+poke);
                            }
                        }
                        System.out.println("Cual deseas eliminar: ");
                        int eliminar = input.nextInt();
                        poke.remove(eliminar);
                    } else if (optipo2 == 2) {
                        Watertype water = new Watertype();

                        System.out.println("-----Tipos Agua-----");
                        for (int j = 0; j < poke.size(); j++) {
                            if (poke.get(j) instanceof Watertype) {
                                System.out.println(j+". "+poke);
                            }

                        }
                          System.out.println("Cual deseas eliminar: ");
                          int eliminar = input.nextInt();
                          poke.remove(eliminar);

                    } else if (optipo2 == 3) {
                        Grasstype grass = new Grasstype();

                        System.out.println("-----Tipos Planta-----");

                        for (int j = 0; j < poke.size(); j++) {
                            if (poke.get(j) instanceof Grasstype) {
                                System.out.println(j+". "+poke);
                            }

                        }
                          System.out.println("Cual deseas eliminar: ");
                          int eliminar = input.nextInt();
                          poke.remove(eliminar);

                    }
                    
                    break;
                }
                case 5: {
                    if(poball.isEmpty()){
                        System.out.println("No puedes capturar sin pokeballs");   
                    }else{
                    Random random = new Random();
                    for (int i = 0; i < poball.size(); i++) {
                        System.out.println(i+". "+poball.get(i).toString());
                    }
                    System.out.println("Selecion la pokebola a usar: ");
                    int pokeausar = input.nextInt();
                    boolean verificador = true;
                    int selecionador=0;
                    while(verificador == true){
                   int cont = poke.size(); //cont va servir para copiar contidad de pokemon en la lista
                   selecionador = random.nextInt(0,cont);
                     verificador = poke.get(selecionador).isCapturado();
                    }
                   
                    System.out.println("Has encontrador un pokemon");
                    System.out.println(poke.get(selecionador));
                   
                    }
                    break;
                }
                case 6: {

                    break;
                }
                case 7: {
                    System.out.println("Hasta la proxima, Gracias por su preferencia");
                    break;
                }
                default: {
                    System.out.println("---Caracter Invalido---");
                    break;
                }
            }
System.out.println("");
        } while (op != 7);
       
    }

}
