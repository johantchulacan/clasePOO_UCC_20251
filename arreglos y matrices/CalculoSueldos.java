import java.util.Scanner;

public class CalculoSueldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de empleados: ");
        int N = scanner.nextInt();
        
        double[] A = new double[N]; // Sueldos
        double[] B = new double[N]; // Asignaciones
        double[] C = new double[N]; // Deducciones
        double[] T = new double[N]; // Neto a pagar
        
        for (int i = 0; i < N; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            System.out.print("  Sueldo: ");
            A[i] = scanner.nextDouble();
            System.out.print("  Asignaciones: ");
            B[i] = scanner.nextDouble();
            System.out.print("  Deducciones: ");
            C[i] = scanner.nextDouble();
            
            T[i] = A[i] + B[i] - C[i];
        }
        
        System.out.println("\nResumen de pagos:");
        for (int i = 0; i < N; i++) {
            System.out.println("Empleado " + (i + 1) + ": Neto a pagar = " + T[i]);
        }
        
        scanner.close();
    }
}

