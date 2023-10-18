package Bloque2_ProgramacionMultihilo.Practicas;

import static Bloque2_ProgramacionMultihilo.Practicas.CalculoPrimos_vector_Bloques.esPrimo;

public class MiHebraBloques extends Thread{
    private int idHebra, numHebras;
    private long vector[];

    public MiHebraBloques(int idHebra, int numHebras, long vector[]) {
        this.idHebra = idHebra;
        this.numHebras = numHebras;
        this.vector = vector;
    }

    public synchronized void run() {
        int skip = (vector.length + numHebras - 1) / numHebras;
        int init = idHebra * skip;
        int fin = Math.min(vector.length, (idHebra + 1) * skip);

        for (int i = init; i < fin; i++) {
            if (esPrimo(vector[i])){
                System.out.println(vector[i]);
            }
        }
    }
}
