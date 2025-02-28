import java.util.Scanner;

public class MatrizMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer dimensiones de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        // Leer la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Mostrar la matriz
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Encontrar el mayor y menor elemento y sus posiciones
        int mayor = matriz[0][0], menor = matriz[0][0];
        int filaMayor = 0, columnaMayor = 0, filaMenor = 0, columnaMenor = 0;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    filaMenor = i;
                    columnaMenor = j;
                }
            }
        }
        
        // Mostrar los resultados
        System.out.println("El mayor elemento es " + mayor + " en la posición [" + filaMayor + "][" + columnaMayor + "]");
        System.out.println("El menor elemento es " + menor + " en la posición [" + filaMenor + "][" + columnaMenor + "]");
        
        scanner.close();
    }
}
