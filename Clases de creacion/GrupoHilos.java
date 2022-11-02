public class GrupoHilos extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().toString());
    }
}
