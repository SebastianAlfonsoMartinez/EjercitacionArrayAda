package com.sam.arrayList;

import com.sam.arrayList.operadoresMatematicos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        Suma suma = new Suma();
        System.out.println("Ingrese valores para la suma: ");
        System.out.println("resultado suma: " + suma.operaciones(scanner.nextInt(), scanner.nextInt()));
        Resta resta = new Resta();
        System.out.println("Ingrese valores para la resta: ");
        System.out.println("resultado resta: " + resta.operaciones(scanner.nextInt(), scanner.nextInt()));
        Multiplicacion multiplicacion = new Multiplicacion();
        System.out.println("Ingrese valores para la multiplicacion: ");
        System.out.println("resultado multiplicacion: " + multiplicacion.operaciones(scanner.nextInt(), scanner.nextInt()));
        Division division = new Division();
        System.out.println("Ingrese valores para la division: ");
        System.out.println("resultado division: " + division.operaciones(scanner.nextInt(), scanner.nextInt()));
        Modulo modulo = new Modulo();
        System.out.println("Ingrese valores para la residuo: ");
        System.out.println("resultado residuo: " + modulo.operaciones(scanner.nextInt(), scanner.nextInt()));



        System.out.println("Ingrese el tamano de su matriz 1");
        Integer num1 = scanner.nextInt();
        System.out.println("Ingrese el tamano de su matriz 2");
        Integer num2 = scanner.nextInt();


        int[] matrizUno = new int[num1];
        int[] matrizDos = new int[num2];


        //1.llenando  la primera matriz
        for (int i = 0; i < matrizUno.length; i++) {
            System.out.println("Digita el numero en la posicion [" + i + "]");
            matrizUno[i] = scanner.nextInt();
        }
        //2.llenando  la segunda matriz
        for (int i = 0; i < matrizDos.length; i++) {
            System.out.println("Digita el numero en la posicion [" + i + "]");
            matrizDos[i] = scanner.nextInt();
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