package Bloque2_ProgramacionMultihilo;

public class A_2_3_RunableThreads {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Tarea1_Runable());
        Thread t2 = new Thread(new Tarea2_Runable());

        t1.start();
        t2.start();
    }
}

    class Tarea1_Runable implements Runnable{
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Tarea 1");
            }
        }
    }

    class Tarea2_Runable implements Runnable{
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Tarea 2");
            }
        }
    }
