import java.util.Arrays;

public class SumaOpuestos {
    public static void main(String[] args) {
        int[] A = {8, 5, 3, 10, 2, 8, 1};
        int[] B = generarArregloB(A);
        System.out.println("Arreglo resultante B: " + Arrays.toString(B));
    }

    public static int[] generarArregloB(int[] A) {
        int N = A.length;
        int nuevoTamano = (N + 1) / 2; // Redondeo hacia arriba si N es impar
        int[] B = new int[nuevoTamano];
        
        for (int i = 0; i < nuevoTamano; i++) {
            int j = N - 1 - i;
            B[i] = A[i] + (i != j ? A[j] : 0); // Si son el mismo índice, no sumar dos veces
        }
        
        return B;
    }
}
