import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int edad = 0;
        System.out.println("Ingrese su nombre");
        nombre = in.nextLine();
        System.out.println("Ingrese su edad");
        edad = in.nextInt();
        System.out.println("Hola " + nombre + " la edad proporcionada es " + edad);
    }
}