/*Crea un programa que forme parte de un módulo para el sistema de una estética de perros. El programa deberá de contener lo siguiente:

        Una clase RecibeMascota.

        Los atributos: nombre de perro, edad, raza, tamaño y nombre de dueño.

        Crear el método main en donde contendrá el código para realizar el siguiente procedimiento:
        Crear un arreglo dinámico de tipo de la clase.

        Hacer una instancia para crear un objeto de tipo de la clase.

        Asignar valores a los atributos de la clase con datos que tú prefieras.

        Agregar el objeto creado al arreglo.

        Imprimir la cantidad de perros que se encuentran en la estética con el siguiente mensaje: Perros actuales en la estética: <Número de perros>.*/
public class esteticaPerros {
    public static void main(String[] args) {
        String []RecibeMascota = new RecibeMascota[1];
        RecibeMascota perro = new RecibeMascota();
        perro.nombrePerro = "Firulais";
        perro.edad = 5;
        perro.raza = "Chihuahua";
        perro.tamaño = "Chico";
        perro.nombreDueño = "Juan";
        arreglo[0] = perro;
        System.out.println("Perros actuales en la estética: " + arreglo.length);

    }
}