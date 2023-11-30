import java.util.Stack;
public class Camisa {
    public static void main(String[] args) {
        Stack<String> camisas = new Stack<>();
        camisas.push("Camisa 1");
        camisas.push("Camisa 2");
        camisas.push("Camisa 3");
        System.out.println("La última camisa agregada es: " + camisas.peek());
        while (!camisas.empty()) {
            System.out.println("Sacando camisa: " + camisas.pop());
        }
    }
}