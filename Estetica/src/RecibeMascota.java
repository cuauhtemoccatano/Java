import java.util.ArrayList;
import java.util.Scanner;
public class RecibeMascota {
    String nombrePerro;
    int edad;
    String raza = "Callejero";
    String tamanio;
    String nombrePropietario;
    public RecibeMascota(String nombrePerro, int edad, String raza, String tamanio, String nombrePropietario) {
        this.nombrePerro = nombrePerro;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
        this.nombrePropietario = nombrePropietario;
    }
    public static void main(String[] args) {
        var estetica = new ArrayList<RecibeMascota>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("¿Desea ingresar un nuevo perro? (S/N)");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("N")) {
                break;
            }

            System.out.println("Ingrese el nombre del perro:");
            String nombrePerro = scanner.nextLine();

            System.out.println("Ingrese la edad del perro:");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese la raza del perro:");
            String raza = scanner.nextLine();

            System.out.println("Ingrese el tamaño del perro:");
            String tamanio = scanner.nextLine();

            System.out.println("Ingrese el nombre del dueño:");
            String nombrePropietario = scanner.nextLine();

            RecibeMascota perro = new RecibeMascota(nombrePerro, edad, raza, tamanio, nombrePropietario);

            estetica.add(perro);
        }
        System.out.println("Perros actuales en la estética: " + estetica.size());
    }
}