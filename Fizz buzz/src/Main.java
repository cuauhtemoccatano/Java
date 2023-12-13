
/*given a number n, for each integer i in the range from 1 to n inclusive, print one value per line as follows:
if i is a multiple of both 3 and 5, print FizzBuzz
if i is a multiple of 3 (but not 5), print Fizz
if i is a multiple of 5 (but not 3), print Buzz
if i is not a multiple of 3 or 5, print the value of i
it includes bufferedreader*/
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero");
       int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) { // for each integer i in the range from 1 to n inclusive and accumulate each number before reaching user defined input
            if (i % 15 == 0) { //if i is a multiple of both 3 and 5, print FizzBuzz
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { //if i is a multiple of 3 (but not 5), print Fizz
                System.out.println("Fizz");
            } else if (i % 5 == 0) { //if i is a multiple of 5 (but not 3), print Buzz
                System.out.println("Buzz");
            } else { //if i is not a multiple of 3 or 5, print the value of i
                System.out.println(i);

            }
        }
    }
}