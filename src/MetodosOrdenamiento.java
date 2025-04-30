import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado:el arreglo esta retornado "new int[] {}"
    // Solución: Cambié el `return new int[] {}` por `return arreglo` para devolver
    // el arreglo ordenado correctamente.
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: El arrglo esaba ordenando de manera descendente por el
    // if (arreglo[i] < arreglo[j]).
    // Solución: Cambié el operador `<` por `>` para que ordene de manera
    // ascendente.

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: en el "for (int j = 0; j < n; j++)"" el valor se sale
    // del tamaño del arreglo
    // Solución: Cambié el `j < n` por `j + 1 < n` para evitar que el arreglo se
    // salga del tamaño real del arreglo.
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j + 1 < n; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: el arreglo no returneava nada
    // Solución: Coloque `return arreglo` para devolver el arreglo ordenado
    // correctamente.
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;

    }

    // Método de selección con errores
    // Error encontrado: el arroglo estaba como for (int j = i + 1; j <
    // arreglo.length; j--)
    // haciendo que este no se ejecute correctamente.
    // Solución: Cambié el `j--` por `j++` para que el bucle se ejecute
    // correctamente.
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:a la hora de remplazar en numero n el auxiliar el codigo
    // esta asi
    // int smallerNumber = arreglo[i];
    // arreglo[indiceMinimo] = arreglo[i];
    // arreglo[indiceMinimo] = smallerNumber;
    // haceindo que este no guarde adecuadamente el numero menor
    // Solución: Cambié el arreglo para qu este escogiera adecuadamente el menor
    // int smallerNumber = arreglo[indiceMinimo];
    // arreglo[indiceMinimo] = arreglo[i];
    // arreglo[i] = smallerNumber;

    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:Al tener el codigo "while (i > 0 && arreglo[i] < key)"
    // El codigo no tomaba el primer valor y se ordenaba descendentemente
    // Solución cambiarlo por while (i >= 0 && arreglo[i] > key)
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: el codigo copila con la posicion j en lugar del i
    // for (; j >= 0 && arreglo[j] > actual; j--) {arreglo[j + 1] = arreglo[j];
    // Solucion: Cambié el `j` por `i` para que el bucle se ejecute correctamente.

    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];

            int i = j - 1;
            for (; i >= 0 && arreglo[i] > actual; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    // int i = j el bucle se ejecuta incorrectamente
    // while (i > 0 && arreglo[i] < key) el bucle no toma el valor 0 ademas de
    // ordenarse descendetemente
    // return new int[] { 15, 34, 1, 2, 5, 6, 7, 10 } no returnea corectamente el
    // arreglo
    // Solución: Cambié el `i` por `i - 1` para que el bucle se ejecute
    // correctamente.
    // cambiar:
    // int i = j por int i = j - 1 y < pr or > para que el bucle sea ascendente.
    // return new int[] { 15, 34, 1, 2, 5, 6, 7, 10 } por return arreglo
    // Cambié el `i > 0` por `i >= 0` para que el bucle tome el valor 0

    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

}
