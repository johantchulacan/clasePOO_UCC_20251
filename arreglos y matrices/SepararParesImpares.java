import java.util.Arrays;

public class SepararParesImpares {
    public static void main(String[] args) {
        int[] A = {12, 7, 5, 8, 9, 14, 3, 6, 17, 10}; // Arreglo original
        
        // Contar pares e impares
        int countPares = 0, countImpares = 0;
        for (int num : A) {
            if (num % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }
        
        // Crear los arreglos de pares e impares
        int[] pares = new int[countPares];
        int[] impares = new int[countImpares];
        
        // Llenar los arreglos
        int indexPares = 0, indexImpares = 0;
        for (int num : A) {
            if (num % 2 == 0) {
                pares[indexPares++] = num;
            } else {
                impares[indexImpares++] = num;
            }
        }
        
        // Imprimir los resultados
        System.out.println("Arreglo original: " + Arrays.toString(A));
        System.out.println("Números pares: " + Arrays.toString(pares));
        System.out.println("Números impares: " + Arrays.toString(impares));
    }
}
