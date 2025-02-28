import java.util.Scanner;

public class SumaArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese la cantidad de números (N): ");
        int N = scanner.nextInt();
        
        // Declarar el arreglo
        int[] numeros = new int[N];
        int suma = 0;
        
        // Leer los números y calcular la suma
        System.out.println("Ingrese los " + N + " números:");
        for (int i = 0; i < N; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        
        // Mostrar la suma de los números
        System.out.println("La suma de los " + N + " números es: " + suma);
        
        scanner.close();
    }
}
