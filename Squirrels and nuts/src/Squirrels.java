import java.util.Scanner;
public class Squirrels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner. nextInt();
        System.out.println("Enter the number of squirrels: ");
        System.out.println("Enter the number of nuts: ");
        System.out.println(k % n);
    }
}