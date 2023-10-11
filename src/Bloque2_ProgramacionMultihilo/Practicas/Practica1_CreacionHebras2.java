package Bloque2_ProgramacionMultihilo.Practicas;

public class Practica1_CreacionHebras2 {
    public static void main(String[] args) {
        Thread h1 = new Thread(new HebraThread_Pract1(0));
        Thread h2 = new Thread(new HebraThread_Pract1(1));

        h1.start();
        h2.start();
    }
}

class HebraRunnable_Pract1 implements Runnable {
    int id;
    public HebraRunnable_Pract1(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hebra: " + id);
        }
    }
}
