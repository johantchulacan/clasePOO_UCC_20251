import java.util.ArrayList;
import java.util.Scanner;

public class FindPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir el arreglo de entrada
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] A = new int[n];
        
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        
        // Ingresar el valor a buscar
        System.out.print("Ingrese el valor X a buscar: ");
        int x = scanner.nextInt();
        
        // Encontrar posiciones
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                B.add(i + 1); // Guardamos la posición (1-based index)
            }
        }
        
        // Mostrar el arreglo resultante
        System.out.println("Arreglo resultante B: " + B);
        
        scanner.close();
    }
}
