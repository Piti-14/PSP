package Bloque2_ProgramacionMultihilo;

public class A2_6_EjemploUsoJoin {
    public static void main(String[] args) {
        Tarea1_Join t1 = new Tarea1_Join(0);
        Tarea1_Join t2 = new Tarea1_Join(1);
        Tarea1_Join t3 = new Tarea1_Join(2);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final del programa");
    }
}

class Tarea1_Join extends Thread{
    private int idHebra;
    public Tarea1_Join(int idHebra){
        this.idHebra = idHebra;
    }
    public void run(){
        try{
            int x = (int) (Math.random() * 5000);
            Thread.sleep(x);
            System.out.println("Soy la hebra: "+ idHebra + " (" + x + ")" );
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}