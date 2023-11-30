/*Write a program that reads three integer numbers and prints true if the first number is between the second and the third one (inclusive).
Otherwise, it must print false.
The last two arguments may not be sorted.*/
import java.util.Scanner ;
public class Relational {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() ;
        int b = scanner.nextInt() ;
        int c = scanner.nextInt() ;
        if (a >= b && a <= c || a <= b && a >= c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
