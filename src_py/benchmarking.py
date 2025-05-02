from metodos_ordenamiento import MetodosOrdenamiento
import random
import time
    # public Benchmarking
class Benchmarking:
    def _init_(self):
        print("benchmarking instanciado")

    def medir_tiempo(self, funcion, arreglo):
        inicio = time.perf_counter()
        funcion(arreglo)
        fin = time.perf_counter()
        return fin - inicio

    def build_arreglo(self, tamano):
        arreglo = []
        for _ in range(tamano):
            numero = random.randint(0, 99999)
            arreglo.append(numero)
        return arreglo

    def build_current_time(self, tarea):
        inicio = time.time()
        tarea()
        fin = time.time()
        return fin - inicio

    def build_nano_time(self, tarea):
        inicio = time.time_ns()
        tarea()
        fin = time.time_ns()
        return (fin - inicio) /1_000_000_000.0