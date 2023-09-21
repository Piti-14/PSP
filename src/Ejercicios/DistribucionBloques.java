package Ejercicios;

import java.util.Scanner;

public class DistribucionBloques {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Escribe el número de procesos: ");
        int nProcess = input.nextInt();
        input.nextLine();

        System.out.print("Escribe el número de hebras: ");
        int nThreads = input.nextInt();
        input.nextLine();

        System.out.print("¿Qué hebra deseas ver?: ");
        int idThread = input.nextInt();
        input.nextLine();

        int processSize = (nProcess + (nThreads - 1)) / nThreads;
        int init = idThread * processSize;
        int end = Math.min(nProcess, (idThread + 1) * processSize);


        for (int i = init; i < end; i++) {
            System.out.println("i = " + i);
        }
    }
}
