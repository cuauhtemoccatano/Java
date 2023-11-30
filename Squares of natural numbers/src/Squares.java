/*Read an integer number N from the input and print all the squares of positive integers:

- less than or equal to N,
- in ascending order.*/
import java.util.Scanner;
public class Squares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i * i <= n) {
            System.out.println(i * i);
            i++;
        }
    }
}
