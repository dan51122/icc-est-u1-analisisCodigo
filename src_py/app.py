import benchmarking as bm
import metodos_ordenamiento as mo
from copy import deepcopy

if __name__ == "_main_":
    print("funciona")
    bench = bm.Benchmarking()
    metodosO = mo.MetodosOrdenamiento()

    tamanos = [5000, 10000, 10500]  # Lista de tamaños
    for tam in tamanos:
        metodos_dic = {
            "Burbuja": metodosO.sort_bubble,
            "Burbuja Mejorado": metodosO.sort_bubble_mejorado_optitimizado,
            "Seleccion": metodosO.sort_metodo_seleccion
        }

        resultado = []

        for tam in tamanos:
            arreglo_base = bench.build_arreglo(tam)  # <-- Ahora sí pasa un solo entero
            for nombre, fun_metodo in metodos_dic.items():
                arreglo_copia = deepcopy(arreglo_base)
                tiempo_resultado = bench.medir_tiempo(fun_metodo, arreglo_copia)
                tupla_resultado = (tam, nombre, tiempo_resultado)
                resultado.append(tupla_resultado)

    for tam, nombre, tiempo in resultado:
        print(f'Tamaño: {tam}, Método: {nombre}, Tiempo: {tiempo:.6f} segundos')