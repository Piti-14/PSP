package Ejercicios;

import java.util.Scanner;

public class Potencia {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a base number: ");
        int base = input.nextInt();
        input.nextLine();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        input.nextLine();

        System.out.println("The result is " + powRecursive(base, exponent));
    }

    private static int pow(int base, int exponent) {

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    private static int powRecursive(int base, int exponent) {

        int result = 1;

        if (exponent != 0) {
            result = powRecursive(base, exponent - 1);
            result *= base;
        }
        return result;
    }
}