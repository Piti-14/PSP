package Bloque2_ProgramacionMultihilo;

public class A2_8_GreetingHebras2 {
    public static void main(String[] args) {
        Thread t1 = new GreetingThread(0);
        Thread t2 = new GreetingThread(1);

        t1.start();
        t2.start();
    }
}

class GreetingThread extends Thread{
    String greet;

    public GreetingThread(int idHebra) {
        greet = (idHebra == 0) ? "Hello!" : "Goodbye!";
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(greet);
        }
    }
}