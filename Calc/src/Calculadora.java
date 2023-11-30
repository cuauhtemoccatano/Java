import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num1 = 0,  num2=0;
        System.out.println("Primer numero");
        num1 = in.nextInt();
        System.out.println("Segundo numero");
        num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("/n el resultado es" + sum);


    }
}
