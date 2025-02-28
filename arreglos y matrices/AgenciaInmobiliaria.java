import java.util.Scanner;

public class AgenciaInmobiliaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de viviendas: ");
        int n = scanner.nextInt();
        
        double[] alquileres = new double[n];
        double[] porcentajes = new double[n];
        double[] ganancias = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el alquiler de la vivienda " + (i + 1) + ": ");
            alquileres[i] = scanner.nextDouble();
            
            System.out.print("Ingrese el porcentaje de ganancia para la vivienda " + (i + 1) + " (en %): ");
            porcentajes[i] = scanner.nextDouble();
            
            ganancias[i] = (alquileres[i] * porcentajes[i]) / 100;
        }
        
        System.out.println("\nGanancias por cada vivienda:");
        for (int i = 0; i < n; i++) {
            System.out.println("Vivienda " + (i + 1) + ": " + ganancias[i]);
        }
        
        scanner.close();
    }
}
