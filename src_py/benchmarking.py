from metodos_ordenamiento import MetodosOrdenamiento
import random
import time

class Benchmarking:


    # public Benchmarking
    def __init__(self):
        print ("BechMarking instanciado")
        self.mO = MetodosOrdenamiento()
        arreglo = self.build_arreglo(10000)
        tarea = lambda : self.mO.sort_bubble(arreglo)
        #tiempoM = self.build_current_time(tarea)
        tiempoN =  self.build_nano_time(tarea)

        #print(f"Tiempo en milisegunos: {tiempoM}")
        print(f"Tiempo en naanosegundos: {tiempoN}")

        tareabM = lambda : self.mO.sort_bubble_mejorado_optitimizado(arreglo)
        #tiempoMbM = self.build_current_time(tareabM)
        tiempoNbM =  self.build_nano_time(tareabM)
        
        #print(f"Tiempo en milisegunos: {tiempoMbM}")
        print(f"Tiempo en naanosegundos: {tiempoNbM}")

        tareaS = lambda : self.mO.sort_metodo_seleccion(arreglo)
        #tiempoMbM = self.build_current_time(tareabM)
        tiempoNS =  self.build_nano_time(tareaS)
        
        #print(f"Tiempo en milisegunos: {tiempoMbM}")
        print(f"Tiempo en naanosegundos: {tiempoNS}")

        
    def build_arreglo(self,tamano):
        arreglo = []
        for _ in range(tamano):
            numero = random.randint(0, 99999)
            arreglo .append(numero)
        return arreglo
    
    #import time 
    #milisegundos en segundos con # x = time. time()
    #nanosegundoscon # x = time.time_ns()
    #ejecutar es tarea


    def build_current_time(self,tarea):
        inicio= time.time()
        tarea()
        fin = time.time()
        return fin - inicio


    def build_nano_time(self,tarea):
        inicio = time.time_ns()
        tarea()
        fin = time.time_ns()
        return (fin - inicio)/ 1_000_000_000.0

