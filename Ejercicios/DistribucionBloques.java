package Ejercicios;

import java.util.Scanner;

public class DistribucionBloques {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Escribe el número de procesos: ");
        int nProcesos = input.nextInt();
        input.nextLine();

        System.out.print("Escribe el número de hebras: ");
        int nHebras = input.nextInt();
        input.nextLine();

        int nFilas = nProcesos / nHebras;
        int idHebra = 3;


        for (int i = idHebra; i < nFilas; i ++) {
            int proceso = i;
            System.out.print("i = " + proceso + " | ");
            proceso += nFilas;
            System.out.println();
        }
    }
}
