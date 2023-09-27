package Bloque2_ProgramacionMultihilo;

public class A_2_2_CreandoConcurrente {

    public static void main(String[] args) {
        Tarea1_1 t1 = new Tarea1_1();
        Tarea2_2 t2 = new Tarea2_2();

        t1.start();
        t2.start();
    }
}

class Tarea1_1 extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarea 1");
        }
    }
}

class Tarea2_2 extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarea 2");
        }
    }
}
