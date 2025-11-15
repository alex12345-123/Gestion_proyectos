package es.etg.dam;

public class Tarea extends Thread{

    private int tiempo;
    private String nombre;

    public Tarea(String nombre, int tiempo){
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    public void run(){
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("He acabado:"+nombre);
    }
}