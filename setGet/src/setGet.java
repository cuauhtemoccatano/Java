/* Autor: Cuauhtémoc Cataño
 * Fecha: Miércoles 5 de Julio 2023*/
 /** Descripción: Ejercicio 8. Crea una clase Persona con los métodos set y get para el nombre, la edad y el teléfono.
 * En el método set valida que los datos introducidos son correctos.
 * En el main crea dos objetos Persona y comprueba que los datos son correctos.
 */
public class setGet {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Cuauhtémoc");
        System.out.println("Me llamo " + persona.getNombre());
        persona.setEdad(27);
        System.out.println("Mi edad es: " + persona.getEdad());
        persona.setTelefono(558394038);
        System.out.println("Mi número telefonico es " + persona.getTelefono());
    }
}

class Persona {

    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}
