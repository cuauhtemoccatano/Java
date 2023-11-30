
import java.util.Scanner;
 public class edadCalculada {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         String nombre = "";
         int edad = 0;
         int anio = 0;
         System.out.println("Ingrese su nombre");
         nombre = in.nextLine();
         System.out.println("Ingrese su año de nacimiento");
         anio = in.nextShort();
         edad = (2023 - anio);
         System.out.println("Hola, " + nombre + "\n Tu edad es " + edad);
     }
 }