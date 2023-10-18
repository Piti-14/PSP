package Bloque3_ProgramacionMultihilo2;

public class Ej_Reducciones {

    public static void main(String[] args) {
        int numHebras = 4;
        double vector[] = new double[1000000];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        Acumula a = new Acumula();

        MiHebra hebras[] = new MiHebra[numHebras];
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
        for ( int i = miId; i < vector.length; i += numHebras ) {
            a.acumulaValor ( vector [ i ] );
        }
    }
}
class Acumula {
    double suma = 0.0;

    void acumulaValor(double valor) {
        this.suma += valor;
    }

    double dameResultado() {
        return this.suma;
    }
}