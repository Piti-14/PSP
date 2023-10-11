package Bloque2_ProgramacionMultihilo;

public class A2_5_PasoParametrsHebrasRunnable {

    public static void main(String[] args) {
        Thread t1 = new Thread(new TareaRun01(0));
        Thread t2 = new Thread(new TareaRun01(1));

        t1.start();
        t2.start();
    }
}

class TareaRun01 implements Runnable {

    int idHebra;

    public TareaRun01(int idHebra) {
        this.idHebra = idHebra;
    }

    public void run() {
        System.out.println("Soy la hebra " + idHebra);
    }
}
