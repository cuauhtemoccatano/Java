/*Write a program that prints the product of all integer numbers from a to b (a < b).

        Include a and exclude b from the product.

        For example, if a=2 and b=5, then the answer is 2*3*4=24.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long product = 1;
        for (long i = a; i < b; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}