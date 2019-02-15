package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero = 0; // Variable que determina que accion tomar segun el menu
        int valores = 0; // Son la cantidad de operaciones a realizar
        int Suma = 0; // suma cada uno de los valores almacenados en el arreglo total


        System.out.println("Card wash Limpiecito");

        System.out.println("\nIngrece el numero de Operaciones a realizar: ");
        valores = input.nextInt();

        int[] total = new int[valores]; // arreglo total almacena los valores numericos
        String[] operaciones = new String[valores]; // arreglo operaciones almacena la operacion correspondiente

        //menu
        System.out.println("Operaciones:  ");
        System.out.println("\n  Precio   servicios");
        System.out.println("1)L.300    Lavado General\n" +
                "2)L.200    Lavado de motor y chasis\n" +
                "3)L.500    Lavado completo\n" +
                "4)Expopotar a Excel\n" +
                "5)para salir");

        int contador = 1; // una variable que me retringira el ciclo wile
        int posicionArreglo = 0; /* esta pocicion me determina en que lugar del arreglo guardare los
        valores tanto numericos como escritos*/

        while (contador <= valores) {    // para poder entrar al case n cantidad de veces

            System.out.println("\nIngrece un numero: ");  // inicializo la variable numero segun el menu
            numero = input.nextInt();

            if (numero <= 4 && numero >= 1) {    // compruevo que el numero corresponda a los valores del menu
                switch (numero) {  //

                    case 1:
                        total[posicionArreglo] = 300;
                        operaciones[posicionArreglo] = "Lavado General";
                        System.out.println("Lavado General L.300");
                        posicionArreglo++;
                        contador++;
                        break;

                    case 2:
                        total[posicionArreglo] = 200;
                        operaciones[posicionArreglo] = "Lavado de motor y chasis";
                        System.out.println("Lavado de motor y chasis L.200");
                        posicionArreglo++;
                        contador++;
                        break;

                    case 3:
                        total[posicionArreglo] = 500;
                        operaciones[posicionArreglo] = "Lavado completo";
                        System.out.println("Lavado completo L.500");
                        posicionArreglo++;
                        contador++;

                        break;

                    case 4:   // muestro el arreglo
                        int contador2 = 0;

                        while (valores > contador2) {

                            System.out.println("" + total[contador2] + "----- " + operaciones[contador2]);
                            Suma += total[contador2];
                            contador2++;

                        }
                        System.out.println("Total:  " + Suma);

                        break;

                    default:
                        System.out.println("El numero que ingreso no es correcto seleccione del 1 al 4" +
                                "\n el numero que ingreso fue:  " + numero);
                        break;
                }
            }
            else {  // si ningun valor corresponde a los valores del menu muestro el siguiente msj
                System.out.println("El numero que ingreso no es correcto, El programa a finalizado.  ");

            }

        }

        int contador2 = 0;

        while (valores > contador2) {  // sirve para mostrar el arreglo

            System.out.println("" + total[contador2] + "----- " + operaciones[contador2]);
            Suma += total[contador2];
            contador2++;

        }
        System.out.println("Total:  " + Suma);
        System.out.println("\nEl programa a finalizado");
    }
}

