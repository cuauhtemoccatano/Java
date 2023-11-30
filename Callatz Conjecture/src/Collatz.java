/*Given natural number n not exceeding 1_000_000, generate a sequence of integers, described in the Collatz conjecture:
If n is an even number, divide it in half; if it is odd, multiply it by 3 and add 1.
Repeat this operation until we get the number 1 as a result.*/
import java.util.Scanner;
public class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                System.out.print(n + " ");
            } else {
                n = n * 3 + 1;
                System.out.print(n + " ");
            }
        }
    }
}