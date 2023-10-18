package com.sam.arrayList;

import com.sam.arrayList.operadoresMatematicos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("");
        Suma suma = new Suma();
        System.out.println(suma.operaciones(5, 7));
        Resta resta = new Resta();
        System.out.println(resta.operaciones(75, 25));
        Multiplicacion multiplicacion = new Multiplicacion();
        System.out.println(multiplicacion.operaciones(8, 9));
        Division division = new Division();
        System.out.println(division.operaciones(20, 4));
        Modulo modulo = new Modulo();
        System.out.println(modulo.operaciones(10, 2));


        Scanner lecturaMatriz = new Scanner(System.in);
        System.out.println("Ingrese el tamano de su matriz 1");
        Integer num1 = lecturaMatriz.nextInt();
        System.out.println("Ingrese el tamano de su matriz 2");
        Integer num2 = lecturaMatriz.nextInt();


        int[] matrizUno = new int[num1];
        int[] matrizDos = new int[num2];


        //1.llenando  la primera matriz
        for (int i = 0; i < matrizUno.length; i++) {
            System.out.println("Digita el numero en la posicion [" + i + "]");
            matrizUno[i] = lecturaMatriz.nextInt();
        }
        //2.llenando  la segunda matriz
        for (int i = 0; i < matrizDos.length; i++) {
            System.out.println("Digita el numero en la posicion [" + i + "]");
            matrizDos[i] = lecturaMatriz.nextInt();
        }

        int[] resultadoMatriz = new int[matrizUno.length];
        for (int i = 0; i < matrizUno.length; i++) {
                resultadoMatriz[i] = matrizUno[i] + matrizDos[i];
            }

        System.out.println("Matriz 1: ");
        imprimirResultado(matrizUno);
        System.out.println("Matriz 2: ");
        imprimirResultado(matrizDos);
        System.out.println("Resultado suma de matrices: ");
        imprimirResultado(resultadoMatriz);

    }

    public static void imprimirResultado(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]+ " ");
        }
        System.out.println();
    }
}