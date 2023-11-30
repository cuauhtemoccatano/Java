import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int number, i;
        Scanner limite =new Scanner(System.in);
        System.out.print("¿Hasta que número debo calcular?: ");
        number = limite.nextInt();
        i=2;
        System.out.print("Lista números pares: ");
        while(i<=number)
        {
            System.out.print(i +" ");
            i=i+2;
        }
    }
}