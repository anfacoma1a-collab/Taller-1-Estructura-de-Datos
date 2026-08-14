public class MisAlgoritmos implements Ordenamientos,Busquedas{
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
        for (int i = 0; i < arrayPorExplorar.length; i++) {
            int elelmentoActual= arrayPorExplorar[i];
            if (elelmentoActual == elementoABuscar){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
        int inicio = 0;
        int fin = arrayPorExplorar.length - 1;
        while (inicio <= fin) {
            int mitad = (inicio + fin) / 2;
            if (arrayPorExplorar[mitad] == elementoABuscar) {
                return mitad;
            }
            if (arrayPorExplorar[mitad] < elementoABuscar) {
                inicio = mitad + 1;
            } else {
                fin = mitad - 1;
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
        return new int[0];
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}
