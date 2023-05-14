
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
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.println("Bienvenido al programa de selección de guantes.");
        System.out.println("Por favor, ingresa tu nombre:");
        String nombreUsuario = scanner.nextLine();

        // Crear objeto Usuario
        Usuario usuario = new Usuario(nombreUsuario);

        // Mostrar opciones de guantes
        System.out.println("Hola, " + usuario.getNombre() + ". A continuación, elige los tipos de guantes que deseas:");
        System.out.println("1. Guante ligero Nike - Precio: $120.000");
        System.out.println("2. Guantes para ciclismo extremo - Precio: $95.000");
        System.out.println("3. Guantes Kiretsu - Precio: $100.000");

        // Solicitar el primer tipo de guante
        System.out.println("Ingresa el número correspondiente al primer tipo de guante que deseas:");
        int opcion1 = scanner.nextInt();
        usuario.elegirGuante(opcion1);

        // Solicitar el segundo tipo de guante
        System.out.println("Ingresa el número correspondiente al segundo tipo de guante que deseas:");
        int opcion2 = scanner.nextInt();
        usuario.elegirGuante(opcion2);

        // Calcular precio total y promedio de compra
        usuario.calcularTotal();
        usuario.calcularPromedio();

        // Mostrar resultados
        System.out.println("El resultado de los tipos de guantes que elegiste es:");
        System.out.println("Precio Total: $" + usuario.getPrecioTotal());
        System.out.println("Promedio de compra: $" + usuario.getPromedioCompra());

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
