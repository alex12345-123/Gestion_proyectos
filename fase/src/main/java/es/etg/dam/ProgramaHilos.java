package es.etg.dam;

public class ProgramaHilos {
    public static void main(String[] args) throws InterruptedException{

        Tarea Analisis = new Tarea("Analisis",3000);
        Tarea Diseño = new Tarea("Diseño",2000);
        Tarea Codificacion = new Tarea("Codificacion",1000);
        Tarea Pruebas = new Tarea("Pruebas",2000);
    
        System.out.println("Ejecuto Analisis y diseño");
        Analisis.start();
        Diseño.start(); 

        Analisis.join();
        Diseño.join();

        System.out.println("Codificacion inicia");
        Codificacion.start();

        System.out.println("Inicia pruebas");
        Pruebas.start();
        
    }
}