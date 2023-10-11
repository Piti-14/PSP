/*
package Bloque2_ProgramacionMultihilo.Practicas;

public class Practica2_CreacionHebras {

    public static void main(String[] args) {

        int numHebras = 4;
        Hebra_Pract2[] hebras = new Hebra_Pract2[numHebras];
        CuentaIncrementos contador = new CuentaIncrementos();

        for (int i = 0; i < numHebras; i++)  {
            Hebra_Pract2 h = new Hebra_Pract2(i, contador);
            hebras[i] = h;
            h.start();
        }

        for (Hebra_Pract2 h : hebras) {
            try {
                h.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Fin de programa");
    }
}

class Hebra_Pract2 extends Thread {
    int id;
    CuentaIncrementos contador;

    public Hebra_Pract2(int id, CuentaIncrementos contador) {
        this.id = id;
        this.contador = contador;
    }

    public void run() {
        System.out.println("Soy la hebra " + id + ", comienzo el incremento. Contador: " + contador.getContador());
        for (int i = 0; i < 1000000; i++) {
            contador.incrementaContador();
        }
        System.out.println("Soy la hebra " + id + ", termino el incremento. Contador: " + contador.getContador());
    }
}
*/
