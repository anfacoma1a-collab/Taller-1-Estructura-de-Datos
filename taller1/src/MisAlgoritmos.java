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


        while (arrayPorExplorar[0] != elementoABuscar){


                    //.length/2 + arrayPorExplorar.length/4;
        }

        //paso1
        int posicionMitad =arrayPorExplorar.length/2;
        //paso2
        if (arrayPorExplorar[posicionMitad]>elementoABuscar){
            //reviso a la derecha

        }else{
            //reviso a la izquierda
        }
        System.out.println(posicionMitad);
        return 0;
    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        return new int[0];
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
