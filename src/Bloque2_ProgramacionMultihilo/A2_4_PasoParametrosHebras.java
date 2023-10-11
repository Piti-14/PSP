package Bloque2_ProgramacionMultihilo;

public class A2_4_PasoParametrosHebras {

    public static void main(String[] args) {
        Tarea01 t1 = new Tarea01(0);
        Tarea01 t2 = new Tarea01(1);

        t1.start();
        t2.start();
    }
}

class Tarea01 extends Thread{
    int idHebra;

    public Tarea01(int idHebra) {
        this.idHebra = idHebra;
    }

    public void run() {
        System.out.println("Soy la hebra " + idHebra);
    }
}
