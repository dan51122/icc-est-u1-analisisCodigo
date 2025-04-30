## Cree una clase MeodosOrdenamiento
## Crear un metodo sort bubble que reciba un 
## arreglo el metodo solo imprima un mensaje

class MetodosOrdenamiento():
    def sort_bubble(self, array):
        print ("-----Bubble sort-----")
        arreglo = array.copy()
        n = len(arreglo)
        for i in range(n):
            for j in range(i+1,n):
                if arreglo[i]> arreglo[j]:
                    arreglo[i], arreglo[j] = arreglo[j], arreglo[i]                    
        return 
    
    def sort_bubble_mejorado_optitimizado(self, array):
        print ("-----Bubble sort mejorado-----")
        arreglo = array.copy()
        n = len(arreglo)
        for i in range(n):
            bol = True
            for j in range(0,n -i-1):
                if arreglo[j]> arreglo[j+1]:
                    arreglo[j], arreglo[j+1] = arreglo[j+1], arreglo[j]                    
                    bol = False 
            if bol == True:
                return arreglo
            return arreglo
    def sort_metodo_seleccion(self, array):
        print ("-----Selecion-----")
        arreglo = array.copy()
        n = len(arreglo)
        for i in range(n):
            min = i
            for j in range (i+1, n):
                if arreglo[j]< arreglo[min]:
                    min = j
                arreglo[i], arreglo[min] = arreglo[min], arreglo[i]
        return arreglo