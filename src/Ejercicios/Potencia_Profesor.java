package Ejercicios;

public class Potencia_Profesor {


    public static double potenciaIterativa(double base, int exponente) {
        int result = 1;

        for (int i = 0; i < exponente; i++) {
            result *= base;
        }

        return result;
    }


    public static double potenciaRecursiva(double base, int exponente) {
        double result = 1;

        if (exponente != 0) {
            result = potenciaRecursiva(base, exponente - 1);
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        double base = 2.0;
        int exponente = 10;
        long t1;
        long t2;
        double tt;


        // Tiempo ejecución iterativa
        t1 = System.nanoTime();
        double resultadoIterativo;
        resultadoIterativo = potenciaIterativa(base, exponente);
        t2 = System.nanoTime();
        tt =  ((double) (t2 - t1)) / 1.0e9;

        System.out.println("Potencia Iterativa: " + resultadoIterativo);
        System.out.println("Tiempo de ejecución de la potencia iterativa (seg.):\t\t\t " + tt);

        // Tiempo ejecución recursiva
        t1 = System.nanoTime();
        double resultadoRecursivo = potenciaRecursiva(base, exponente);
        t2 = System.nanoTime();
        tt =  ((double) (t2 - t1)) / 1.0e9;

        System.out.println("Potencia Recursiva: " + resultadoRecursivo);
        System.out.println("Tiempo de ejecución de la potencia recursiva (seg.): \t\t\t" + tt);
    }
}