package Bloque2_ProgramacionMultihilo.Practicas;

public class Practica1_CreacionHebras1 {
    public static void main(String[] args) {
        HebraThread_Pract1 h1 = new HebraThread_Pract1(0);
        HebraThread_Pract1 h2 = new HebraThread_Pract1(1);

        h1.start();
        h2.start();
    }
}

class HebraThread_Pract1 extends Thread {
    int id;
    public HebraThread_Pract1(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hebra: " + id);
        }
    }
}

