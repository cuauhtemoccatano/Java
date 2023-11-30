import java.util.Queue;
import java.util.LinkedList;
public class Eliminar {
    public static void main(String[] args) {
        Queue<String> usuarios = new LinkedList<>();
        usuarios.add("Usuario 1");
        usuarios.add("Usuario 2");
        usuarios.add("Usuario 3");
        usuarios.add("Usuario 4");
        usuarios.add("Usuario 5");
        System.out.println("El nombre a eliminar es: " + usuarios.poll());
        System.out.println("El nombre a eliminar es: " + usuarios.poll());
        System.out.println("El nombre a eliminar es: " + usuarios.poll());
        System.out.println("El próximo nombre a eliminar es: " + usuarios.peek());
    }
}