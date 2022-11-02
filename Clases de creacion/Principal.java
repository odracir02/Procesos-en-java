/**
 * Thread
 */
public class Principal {

    public static void main(String[] args) {
        ThreadGroup grupo = new ThreadGroup("Grupo de hilos");

        GrupoHilos h = new GrupoHilos();
        Thread h1 = new Thread(grupo, h, "Hilo 1");
        Thread h2 = new Thread(grupo, h, "Hilo 2");
        Thread h3 = new Thread(grupo, h, "Hilo 3");

        h1.start();
        h2.start();
        h3.start();
    }
}