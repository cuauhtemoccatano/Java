import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame un número");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
