package Ejercicios;

import java.util.Scanner;

public class DistribucionCiclica {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Escribe el número de procesos: ");
        int n = input.nextInt();
        input.nextLine();

        System.out.print("Escribe el número de hebras: ");
        int nThreads = input.nextInt();
        input.nextLine();

        System.out.print("¿Qué hebra deseas ver?: ");
        int Id = input.nextInt();
        input.nextLine();

        for (int i = Id; i < n; i += nThreads) {
            System.out.println("i = " + i);
        }
    }
}
