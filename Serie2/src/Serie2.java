import java.util.Scanner;
public class Serie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N squirrels
        int K = sc.nextInt(); // K nuts
        int result = K/N;
        System.out.println(result);
    }
}