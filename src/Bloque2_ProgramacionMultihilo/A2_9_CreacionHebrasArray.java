package Bloque2_ProgramacionMultihilo;

public class A2_9_CreacionHebrasArray {

    public static void main(String[] args) {
        int numHebras = 5;
        Hebra[] hebras = new Hebra[numHebras];

        for (int i = 0; i < numHebras; i++) {
            Hebra h = new Hebra(i);
            hebras[i] = h;
            h.start();
        }

        for (Hebra h : hebras) {
            try{
                h.join();
            } catch(Exception e) {
                 e.printStackTrace();
            }
        }
        System.out.println("Todas las hebras han terminado");
    }
}

class Hebra extends Thread {
    int id;

    public Hebra(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Soy la hebra " + id);
        }
    }
}
