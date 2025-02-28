import java.util.Scanner;

public class MaxAbsPerRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ingresar dimensiones de la matriz
        System.out.print("Ingrese el número de filas (N): ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (M): ");
        int M = scanner.nextInt();
        
        // Validar que haya al menos una columna adicional para almacenar el máximo absoluto
        if (M < 2) {
            System.out.println("El número de columnas debe ser al menos 2.");
            return;
        }
        
        int[][] matriz = new int[N][M];
        
        // Ingresar la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M - 1; j++) { // Se deja la última columna para el resultado
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Encontrar el máximo valor absoluto de cada fila y almacenarlo en la última columna
        for (int i = 0; i < N; i++) {
            int maxAbs = Math.abs(matriz[i][0]);
            for (int j = 1; j < M - 1; j++) {
                if (Math.abs(matriz[i][j]) > maxAbs) {
                    maxAbs = Math.abs(matriz[i][j]);
                }
            }
            matriz[i][M - 1] = maxAbs; // Almacenar el máximo en la última columna
        }
        
        // Mostrar la matriz con la última columna actualizada
        System.out.println("Matriz resultante:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
