
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Usuario
{
    // instance variables - replace the example below with your own
    private String nombre;
    private double precioTotal;
    private double promedioCompra;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getPromedioCompra() {
        return promedioCompra;
    }

    public void elegirGuante(int opcion) {
        switch (opcion) {
            case 1:
                precioTotal += 120000;
                System.out.println("Has seleccionado el Guante ligero Nike.");
                break;
            case 2:
                precioTotal += 95000;
                System.out.println("Has seleccionado los Guantes para ciclismo extremo.");
                break;
            case 3:
                precioTotal += 100000;
                System.out.println("Has seleccionado los Guantes Kiretsu.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    public void calcularTotal() {
        // El método ya se encarga de calcular el total al elegir los guantes
    }

    public void calcularPromedio() {
        promedioCompra = precioTotal / 2;
    }
}

