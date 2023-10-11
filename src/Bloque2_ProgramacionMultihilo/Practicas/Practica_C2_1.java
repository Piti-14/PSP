package Bloque2_ProgramacionMultihilo.Practicas;

public class Practica_C2_1 {

    public static void main(String[] args) {
        int numHebras = 100;
        C2_Hebra[] hebras = new C2_Hebra[numHebras];

        for (int i = 0; i < numHebras; i++) {
            C2_Hebra h = new C2_Hebra(i);
            hebras[i] = h;
        }

        for (C2_Hebra hebra : hebras) {
            if (hebra.getID() % 3 == 0 && hebra.getID() % 5 == 0){
                hebra.start();
                try {
                    hebra.join();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Todas las hebras han terminado");
    }
}

class C2_Hebra extends Thread {
    private int id;
    public C2_Hebra(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Hebra: " + id);
    }

    public int getID() {
        return id;
    }
}
