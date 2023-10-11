package Bloque2_ProgramacionMultihilo.Practicas;

public class Prueba_Volatile_Synchroniced {

    int dato = 0;

    synchronized void sumaDato() {
        dato++;
    }

    synchronized int dameDato() {
        return dato;
    }
}
