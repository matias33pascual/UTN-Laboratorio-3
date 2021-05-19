/*
    Clase 12

    EXECPCIONES
        * Manejo de excepciones
        * try, catch, finally
        * Tipos de excepciones
        * Creando una excepcion

 */

package com.utn.clase13;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase13 {
    public static void init() {

        int numero = 1;

        Scanner s = new Scanner(System.in);

        while(numero != 0) {
            try {
                s.reset();
                System.out.println("ingrese un numero");
                System.out.println("para salir ingrese 0 (cero)");
                System.out.print(">");

                numero = s.nextInt();


            } catch (InputMismatchException e) {
                System.out.println("debe ingresar un numero");
                System.out.println("------------------------");
            }
            finally {
                s.close();
            }
        }

        //ejemplo_1();
        //ejemplo_2();
        ejemplo_3();
    }

    // -----------------------------------------------------------------------------

    public static void ejemplo_1() {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};

        try {
            buscarNumero(15);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void buscarNumero(int[] arreglo, int numero) {

        try {
            for (int i = 0; ; i++) {
                if (arreglo[i] == numero) {
                    System.out.println("numero " + numero + " encontrado en el arreglo");
                    break;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("no se encontro el numero");
        }
    }

    public static void buscarNumero(int numero) throws Exception {

        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};

        for(var n : arreglo) {
            if(n == numero) {
                System.out.println("el numero " + numero + " existe en el arreglo.");
                return;
            }
        }

        throw new Exception("no se encontro el numero");
    }



    // -----------------------------------------------------------------------------

    public static void ejemplo_2() {
        int numero = 1;

        /*
            // sin la excepcion, el programa se terminaria

            System.out.println("ingrese un numero");
            System.out.println("para salir ingrese 0 (cero)");
            System.out.print(">");
            numero = new Scanner(System.in).nextInt();
        */

        Scanner s = new Scanner(System.in);

        while(numero != 0) {
            try {
                s.reset();
                System.out.println("ingrese un numero");
                System.out.println("para salir ingrese 0 (cero)");
                System.out.print(">");

                numero = s.nextInt();


            } catch (InputMismatchException e) {
                System.out.println("debe ingresar un numero");
                System.out.println("------------------------");
            }
            finally {
                s.close();
            }
        }
    }

    // -----------------------------------------------------------------------------

    public static void ejemplo_3() {
        Persona persona = new Persona();
        Scanner scanner = new Scanner(System.in);



        try {
            System.out.println("ingrese su numero de usuario");
            Integer numeroUsuario = scanner.nextInt();
            scanner.reset();

            System.out.println("ingrese su nombre");
            String nombre = scanner.next();

            persona.setNombre(nombre);

            // si ingresamos "no valido" la siguiente linea no se ejecutaria
            System.out.println("esta linea no se ejecutara");
        }
        catch(NombreNoValidoExcepcion e) {
            System.out.println("debe ingresar otro nombre");
        }
        catch(InputMismatchException e) {
            System.out.println("tenias que ingresar un numero");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("programa terminado");
        }
    }
}
