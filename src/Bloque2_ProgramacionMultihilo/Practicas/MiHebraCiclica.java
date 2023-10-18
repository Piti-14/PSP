package Bloque2_ProgramacionMultihilo.Practicas;

import static Bloque2_ProgramacionMultihilo.Practicas.CalculoPrimos_vector_Bloques.esPrimo;

public class MiHebraCiclica extends Thread{
    private int idHebra, numHebras;
    private long vector[];

    public MiHebraCiclica(int idHebra, int numHebras, long vector[]) {
        this.idHebra = idHebra;
        this.numHebras = numHebras;
        this.vector = vector;
    }

    public synchronized void run() {
        for (int n = idHebra; n < vector.length; n+=numHebras) {
            if (esPrimo(vector[n])){
                System.out.println(vector[n]);
            }
        }
    }
}
