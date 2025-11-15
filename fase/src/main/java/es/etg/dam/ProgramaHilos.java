package es.etg.dam;

public class ProgramaHilos {

    public static void main(String[] args) throws InterruptedException {

        Tarea analisis = new Tarea("Análisis", 3000);
        Tarea diseño = new Tarea("Diseño", 2000);
        Tarea codificacion = new Tarea("Codificación", 1000);
        Tarea pruebas = new Tarea("Pruebas", 2000);

        System.out.println("Inicia diseño y analisis");
        analisis.start();
        diseño.start();

        diseño.join();
        System.out.println("Inicia las pruebas");
        pruebas.start();

        analisis.join();
        System.out.println("Inicia Codificación");
        codificacion.start();

        pruebas.join();
        codificacion.join();

        System.out.println("Las tareas han finalizado");
    }
}
