package Bloque3_ProgramacionMultihilo2;

public class Ej_Reducciones {
    public static void main(String[] args) {

        long t1, t2;
        double tt;

        int numHebras = 4;
        double vector[] = new double[1000000];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        Acumula a = new Acumula();

        MiHebra hebras[] = new MiHebra[numHebras];
        t1 = System.nanoTime();

        for (int i = 0; i < numHebras; i++){
            hebras[i] = new MiHebra(i, numHebras, vector, a);
            hebras[i].start();
        }

        for (int i = 0; i < numHebras; i++){
            try{
                hebras[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        t2 = System.nanoTime();
        tt = ((double) (t2 - t1)) / 1.0e9;

        System.out.println("Valor acumulado: " + a.dameResultado());
        System.out.println("Tiempo cíclico (seg.):\t\t\t" + tt);
    }
}
class MiHebra extends Thread {
    int miId, numHebras;
    double vector [ ];
    Acumula a;
    public MiHebra ( int miId, int numHebras, double vector [ ], Acumula a ) {
        this.miId = miId;
        this.numHebras = numHebras;
        this.vector = vector;
        this.a = a;
    }
    public void run () {
        double valor = 0.0;
        for ( int i = miId; i < vector.length; i += numHebras ) {
            valor += vector[i];
        }
        a.acumulaValor(valor);
    }
}
class Acumula {
    double suma = 0.0;

    synchronized void acumulaValor(double valor) {
        this.suma += valor;
    }

    synchronized double dameResultado() {
        return this.suma;
    }
}