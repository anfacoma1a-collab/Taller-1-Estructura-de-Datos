public class MisAlgoritmos implements Ordenamientos,Busquedas{

    @Override

    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {

        for (int i = 0; i < arrayPorExplorar.length; i++) {
            int elementoActual = arrayPorExplorar[i];

            if (elementoActual == elementoABuscar) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
        int inicio = 0;
        int finalArray = arrayPorExplorar.length - 1;

        while (inicio <= finalArray) {
            int posicionMitad = (inicio + finalArray) / 2;
            int elementoMitad = arrayPorExplorar[posicionMitad];

            if (elementoMitad == elementoABuscar) {
                return posicionMitad;

            } else if (elementoMitad < elementoABuscar) {
                inicio = posicionMitad + 1;

            } else {
                finalArray = posicionMitad - 1;
            }
        }

        return -1;
    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {

        for (int i = 0; i < arrayDesordenado.length - 1; i++) {

            for (int j = 0; j < arrayDesordenado.length - 1 - i; j++) {

                if (arrayDesordenado[j] > arrayDesordenado[j + 1]) {
                    int temporal = arrayDesordenado[j];

                    arrayDesordenado[j] = arrayDesordenado[j + 1];
                    arrayDesordenado[j + 1] = temporal;
                }
            }
        }

        return arrayDesordenado;
    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        for (int i = 0; i < arrayDesordenado.length - 1; i++) {
            int posicionMenor = i;

            for (int j = i + 1; j < arrayDesordenado.length; j++) {
                if (arrayDesordenado[j] < arrayDesordenado[posicionMenor]) {
                    posicionMenor = j;
                }
            }

            int temporal = arrayDesordenado[i];
            arrayDesordenado[i] = arrayDesordenado[posicionMenor];
            arrayDesordenado[posicionMenor] = temporal;
        }

        return arrayDesordenado;
    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {

        for (int i = 1; i < arrayDesordenado.length; i++) {
            int elementoActual = arrayDesordenado[i];
            int posicionAnterior = i - 1;

            while (posicionAnterior >= 0
                    && arrayDesordenado[posicionAnterior] > elementoActual) {

                arrayDesordenado[posicionAnterior + 1]
                        = arrayDesordenado[posicionAnterior];

                posicionAnterior--;
            }

            arrayDesordenado[posicionAnterior + 1] = elementoActual;
        }

        return arrayDesordenado;
    }

    @Override
    public int[] mergeSort(int[] arrayDesordenado) {
        if (arrayDesordenado.length <= 1) {
            return arrayDesordenado;
        }

        int mitad = arrayDesordenado.length / 2;

        int[] izquierda = new int[mitad];
        int[] derecha = new int[arrayDesordenado.length - mitad];

        for (int i = 0; i < mitad; i++) {
            izquierda[i] = arrayDesordenado[i];
        }

        for (int i = mitad; i < arrayDesordenado.length; i++) {
            derecha[i - mitad] = arrayDesordenado[i];
        }

        izquierda = mergeSort(izquierda);
        derecha = mergeSort(derecha);

        return unir(izquierda, derecha);
    }

    public int[] unir(int[] izquierda, int[] derecha) {
        int[] resultado = new int[izquierda.length + derecha.length];

        int posicionIzquierda = 0;
        int posicionDerecha = 0;
        int posicionResultado = 0;

        while (posicionIzquierda < izquierda.length
                && posicionDerecha < derecha.length) {

            if (izquierda[posicionIzquierda] < derecha[posicionDerecha]) {
                resultado[posicionResultado] = izquierda[posicionIzquierda];
                posicionIzquierda++;
            } else {
                resultado[posicionResultado] = derecha[posicionDerecha];
                posicionDerecha++;
            }

            posicionResultado++;
        }

        while (posicionIzquierda < izquierda.length) {
            resultado[posicionResultado] = izquierda[posicionIzquierda];
            posicionIzquierda++;
            posicionResultado++;
        }

        while (posicionDerecha < derecha.length) {
            resultado[posicionResultado] = derecha[posicionDerecha];
            posicionDerecha++;
            posicionResultado++;
        }

        return resultado;
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}
