import java.util.Scanner;

public class semanaSwitch {
    public static void main(String[] args) {
        Scanner semana = new Scanner(System.in);
        int dia;
        System.out.println("Ingresa dia de la semana");
        dia = semana.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no valido");
        }
    }
}