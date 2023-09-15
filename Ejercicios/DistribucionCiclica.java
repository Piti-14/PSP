package Ejercicios;

import java.util.Scanner;

public class DistribucionCiclica {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Escribe el número de procesos: ");
        int n = input.nextInt();
        input.nextLine();

        System.out.print("Escribe el número de hebras: ");
        int h = input.nextInt();
        input.nextLine();

        for (int i = 0; i < h; i++) {
            System.out.println("i = " + i);
        }
    }
}
