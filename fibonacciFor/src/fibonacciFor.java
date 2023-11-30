public class fibonacciFor {
    public static void main(String[] args) {
        int n= 15;
        int numActual = 0;
        int valorSiguiente = 0;
        int i = 0;
        int numSiguiente = 1;
        for (i = 0; i < n; i++) {
            System.out.println(numActual);
            valorSiguiente = numActual + numSiguiente;
            numActual = numSiguiente;
            numSiguiente = valorSiguiente;
        }
    }
}