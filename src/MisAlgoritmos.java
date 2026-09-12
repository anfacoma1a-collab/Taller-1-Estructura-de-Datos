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
        return new int[0];
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
