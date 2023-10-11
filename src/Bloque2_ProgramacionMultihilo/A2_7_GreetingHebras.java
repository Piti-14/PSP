package Bloque2_ProgramacionMultihilo;

public class A2_7_GreetingHebras {

    public static void main(String[] args) {
        Thread t1 = new HelloThread();
        Thread t2 = new GoodbyeThread();

        t1.start();
        t2.start();
    }
}


class HelloThread extends Thread{
   public void run() {
       for (int i = 0; i < 1000; i++) {
           System.out.println("Hello!");
       }
   }
}

class GoodbyeThread extends Thread{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Goodbye!");
        }
    }
}
