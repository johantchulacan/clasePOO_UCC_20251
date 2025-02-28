import java.util.ArrayList;
import java.util.Scanner;

public class SueldoPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> sueldos = new ArrayList<>();
        
        System.out.print("Ingrese la cantidad de trabajadores: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        double sumaSueldos = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del trabajador " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
            
            System.out.print("Ingrese el sueldo de " + nombre + ": ");
            double sueldo = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea
            sueldos.add(sueldo);
            
            sumaSueldos += sueldo;
        }
        
        double promedio = sumaSueldos / cantidad;
        System.out.println("\nEl sueldo promedio es: " + promedio);
        
        System.out.println("Trabajadores con sueldo igual al promedio:");
        int contador = 0;
        for (int i = 0; i < cantidad; i++) {
            if (sueldos.get(i) == promedio) {
                System.out.println(nombres.get(i));
                contador++;
            }
        }
        
        if (contador == 0) {
            System.out.println("Ningún trabajador tiene el sueldo promedio.");
        } else {
            System.out.println("Total de trabajadores con sueldo promedio: " + contador);
        }
        
        scanner.close();
    }
}

