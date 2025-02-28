import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número de productos
        System.out.print("Ingrese la cantidad de productos: ");
        int N = scanner.nextInt();
        
        // Definir los arreglos
        double[] PU = new double[N]; // Precios unitarios
        int[] CC = new int[N];       // Cantidades compradas
        String[] descripcion = new String[N]; // Descripción de productos
        double[] TG = new double[N]; // Total gastado por producto
        
        // Ingresar los datos
        for (int i = 0; i < N; i++) {
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Ingrese la descripción del producto " + (i + 1) + ": ");
            descripcion[i] = scanner.nextLine();
            System.out.print("Ingrese el precio unitario de " + descripcion[i] + ": ");
            PU[i] = scanner.nextDouble();
            System.out.print("Ingrese la cantidad comprada de " + descripcion[i] + ": ");
            CC[i] = scanner.nextInt();
            
            // Calcular total gastado por producto
            TG[i] = PU[i] * CC[i];
        }
        
        // Calcular el total general de compras
        double totalGeneral = 0;
        int indiceMayorGasto = 0;
        
        for (int i = 0; i < N; i++) {
            totalGeneral += TG[i];
            if (TG[i] > TG[indiceMayorGasto]) {
                indiceMayorGasto = i;
            }
        }
        
        // Mostrar resultados
        System.out.println("\nResumen de compras:");
        for (int i = 0; i < N; i++) {
            System.out.println(descripcion[i] + " - Total gastado: " + TG[i]);
        }
        
        System.out.println("\nTotal general de todas las compras: " + totalGeneral);
        System.out.println("El producto con mayor gasto fue: " + descripcion[indiceMayorGasto] + " con " + TG[indiceMayorGasto]);
        
        scanner.close();
    }
}
