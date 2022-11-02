public class Hilo1 extends Thread {
    public Hilo1(String nombre) {
        super(nombre);
        System.out.println("Creando hilo " + getName());
    }

    public void run() {
        System.out.println("Hola son un hilo");
    }

}
