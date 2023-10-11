package Bloque2_ProgramacionMultihilo.Practicas;

/*
   1.1) ¿Qué realiza el código? ¿Qué debería mostrar en pantalla si se
        ejecuta con los parámetros hebras 4 y tope 1000000?

        El código crea un array de hebras y cada una, compartiendo el mismo contador,
        va incrementándolo hasta hacerle tantos incrementos como tope se haya puesto.
        Con el código correcto, se debería mostrar el total de incrementos como el producto
        del total y el número de Hebras.

   1.2) Compila y ejecuta el código con dichos valores en tu ordenador local.
        ¿Qué muestra realmente en pantalla si se ejecuta con los parámetros hebras 4 y tope 1000000?

        Se adjunta captura de pantalla (a continuación)

   1.3) ¿Es un código “thread-safe”?
        No lo es, se crea una condición de carrera y por ello el número total de incrementos es inferior puesto
        que varias hebras acceden a la vez a la variable con un valor determinado y la incrementan, perdiéndose
        uno de los valores, pues la que guarde la variable en última instancia reemplazará el valor de dicha variable.
*/
public class Practica3_SincronizacionBasica {
    public static void main ( String args[] ) {
        long t1, t2;
        double tt;
        long tope;
        int numHebras;

        /***** SI os molesta pasar por argumentos para estos ejemplos sencillos lo quitamos
         if ( args.length != 2 ) {
         System.err.println ( "java CuentaIncrementos <numHebras> <tope>" );
         System.exit(-1);
         }

         numHebras = Integer.valueOf ( args [ 0 ] );
         tope	  = Long.valueOf( args [ 1 ] );

         *////

        numHebras = 4;
        tope = 1000000;

        /// Código original
        System.out.println ( "Código original ...." );
        System.out.println ( "numHebras: " + numHebras );
        System.out.println ( "tope:     " + tope );

        MiHebra v[] = new MiHebra [ numHebras ];
        CuentaIncrementos c = new CuentaIncrementos();
        t1 = System.nanoTime();

        System.out.println ( "Creando y arrancando " + numHebras + " hebras." );

        for ( int i = 0; i < numHebras; i++ ) {
            v[ i ] = new MiHebra ( tope, c );
            v[ i ].start();
        }

        for ( int i = 0; i < numHebras; i++ ) {
            try {
                v[ i ].join();
            } catch ( InterruptedException ex ) {
                ex.printStackTrace();
            }
        }

        t2 = System.nanoTime();
        tt = ( ( double ) ( t2 -t1 ) ) / 1.0e9;
        System.out.println ( "Total de incrementos: " + c.dameNumIncrementos() );
        System.out.println ( "Tiempo Transcurrido en s: " + tt );
        System.out.println();
    }
}


class CuentaIncrementos {
    long numIncrementos = 0;

    synchronized void incrementaNumIncrementos() {
        numIncrementos++;
    }

    synchronized long dameNumIncrementos() {
        return ( numIncrementos );
    }
}


class MiHebra extends Thread {
    long tope;
    CuentaIncrementos c;

    public MiHebra(long tope, CuentaIncrementos c) {

        this.tope = tope;
        this.c = c;
    }

    public void run() {
        for (long i = 0; i < tope; i++) {
            c.incrementaNumIncrementos();
        }
    }
}
