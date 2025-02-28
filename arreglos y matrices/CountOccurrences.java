import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        // Ingresar los elementos del arreglo
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Solicitar el número a buscar
        System.out.print("Ingrese el número a buscar: ");
        int target = scanner.nextInt();
        
        // Contar las ocurrencias
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        
        // Mostrar el resultado
        System.out.println("El número " + target + " aparece " + count + " veces en el arreglo.");
        
        scanner.close();
    }
}
