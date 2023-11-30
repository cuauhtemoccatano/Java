public class Main {

    public static void main(String[] args) {
        int[] arreglo = {50, 20, 40, 80, 30};
        int auxiliar;
        int posicion;
        for (int i = 0; i < arreglo.length; i++) {
            posicion = i;
            auxiliar = arreglo[i];
            while (posicion > 0 && arreglo[posicion - 1] > auxiliar) {
                arreglo[posicion] = arreglo[posicion - 1];
                posicion--;
            }
            arreglo[posicion] = auxiliar;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}