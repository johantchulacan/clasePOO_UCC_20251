import java.util.Scanner;

public class SumaParesMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz M: ");
        int M = scanner.nextInt();
        
        int[][] matriz = new int[M][M];
        int[] B = new int[M]; // Vector B para almacenar la suma de pares de cada fila
        
        // Llenar la matriz con valores ingresados por el usuario
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Calcular la suma de los valores pares en cada fila
        for (int i = 0; i < M; i++) {
            int sumaPares = 0;
            for (int j = 0; j < M; j++) {
                if (matriz[i][j] % 2 == 0) { // Verificar si es par
                    sumaPares += matriz[i][j];
                }
            }
            B[i] = sumaPares;
        }
        
        // Mostrar el vector B
        System.out.println("Vector B con las sumas de los pares de cada fila:");
        for (int i = 0; i < M; i++) {
            System.out.print(B[i] + " ");
        }
        
        scanner.close();
    }
}

