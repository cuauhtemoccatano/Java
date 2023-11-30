public class metodoOrdenamiento {

    public void imprimeArreglo(String mensaje, int[] arreglo) {
        System.out.print(mensaje + "[");
        for (int i = 0; i < arreglo.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arreglo[i]);
        }
        System.out.println("]");
    }

    public void saltoLinea() {
        System.out.println("\n");
    }

    public static void main(String args[]) {
        int[] arreglo = {50, 20, 40, 80, 30};  // Cambié los valores del arreglo

        metodoOrdenamiento objOrdena = new metodoOrdenamiento();

        objOrdena.imprimeArreglo("Arreglo inicial: ", arreglo);
        objOrdena.saltoLinea();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("i = " + i);

            for (int j = 0; j < arreglo.length - i - 1; j++) {
                objOrdena.imprimeArreglo("  Arreglo comparando: ", arreglo);
                System.out.println(" <----- j = " + j + " -- " + arreglo[j] + " > " + arreglo[j + 1] + "?");

                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println("    ------- Intercambia " + arreglo[j] + " con " + arreglo[j + 1]);

                    // Intercambio
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    objOrdena.imprimeArreglo("    Arreglo modificado: ", arreglo);
                    objOrdena.saltoLinea();
                }
            }
        }

        objOrdena.saltoLinea();
        objOrdena.imprimeArreglo("Arreglo final: ", arreglo);
    }
}
