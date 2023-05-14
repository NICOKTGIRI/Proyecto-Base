
/**
 * Write a description of class ProgramaGuantes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ProgramaGuantes
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        // Declaración de variables
        String nombreUsuario;
        int opcion1, opcion2;
        double precioTotal = 0;
        double promedioCompra;

        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mensaje de bienvenida y solicitud del nombre del usuario
        System.out.println("Bienvenido al programa de selección de guantes.");
        System.out.println("Por favor, ingresa tu nombre:");
        nombreUsuario = scanner.nextLine();

        // Mostrar opciones de guantes
        System.out.println("Hola, " + nombreUsuario + ". A continuación, elige los tipos de guantes que deseas:");
        System.out.println("1. Guante ligero Nike - Precio: $120.000");
        System.out.println("2. Guantes para ciclismo extremo - Precio: $95.000");
        System.out.println("3. Guantes Kiretsu - Precio: $100.000");

        // Solicitar el primer tipo de guante
        System.out.println("Ingresa el número correspondiente al primer tipo de guante que deseas:");
        opcion1 = Integer.parseInt(scanner.nextLine());

        // Solicitar el segundo tipo de guante
        System.out.println("Ingresa el número correspondiente al segundo tipo de guante que deseas:");
        opcion2 = Integer.parseInt(scanner.nextLine());

        // Calcular precio total
        if (opcion1 == 1) {
            precioTotal += 120000;
            System.out.println("Has seleccionado el Guante ligero Nike.");
        } else if (opcion1 == 2) {
            precioTotal += 95000;
            System.out.println("Has seleccionado los Guantes para ciclismo extremo.");
        } else if (opcion1 == 3) {
            precioTotal += 100000;
            System.out.println("Has seleccionado los Guantes Kiretsu.");
        }

        if (opcion2 == 1) {
            precioTotal += 120000;
            System.out.println("Has seleccionado el Guante ligero Nike.");
        } else if (opcion2 == 2) {
            precioTotal += 95000;
            System.out.println("Has seleccionado los Guantes para ciclismo extremo.");
        } else if (opcion2 == 3) {
            precioTotal += 100000;
            System.out.println("Has seleccionado los Guantes Kiretsu.");
        }

        // Calcular promedio de compra
        promedioCompra = precioTotal / 2;

        // Mostrar resultados
        System.out.println("El resultado de los tipos de guantes que elegiste es:");
        System.out.println("Precio Total: $" + precioTotal);
        System.out.println("Promedio de compra: $" + promedioCompra);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}


