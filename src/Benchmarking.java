public class Benchmarking {

    private MetodosOrdenamiento mOrdenamiento;

    public Benchmarking() {
        /*long CurrentMillis = System.currentTimeMillis();
        long currentNano = System.nanoTime();
        System.out.println(CurrentMillis);
        System.out.println(currentNano);

        mOrdenamiento = new MetodosOrdenamiento();
        int[] arreglo = generarArregloAleatorio(1000000);

        Runnable tarea = () -> mOrdenamiento.burbujaTradicional(arreglo);

        double tiempoDuracionMilis = medirCoCurrentTime(tarea);
        double tiempoDuracionNano = medirCoCurrentTime(tarea);

        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoDuracionMilis + " ms");
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoDuracionNano + " ns");*/
    }

    private int[] generarArregloAleatorio(int tamaño) {
        int[] arreglo = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = (int) (Math.random() * 100_000);
        }
        return arreglo;
    }

    public double medirCoCurrentTimeMiles(Runnable tarea) {
        long inicio = System.currentTimeMillis();
        tarea.run();
        long fin = System.currentTimeMillis();
        double tiempoSegundos = (fin - inicio) * 1000.0;
        return tiempoSegundos;
    }

    public double medirCoCurrentTime(Runnable tarea) {
        long inicio = System.nanoTime();
        tarea.run();
        long fin = System.nanoTime();

        return (fin - inicio) * 100_000_000_000.0;
    }
}
