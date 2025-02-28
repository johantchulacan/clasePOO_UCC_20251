import java.util.Arrays;

public class ArrayDifferences {
    public static int[] getDifferences(int[] arr) {
        if (arr.length < 2) {
            return new int[0]; // Si el arreglo tiene menos de 2 elementos, no hay diferencias
        }
        
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            result[i] = arr[i + 1] - arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {4, 6, 8, 2, 6, 9, 5, 1};
        int[] B = getDifferences(A);
        
        System.out.println("Arreglo dado A: " + Arrays.toString(A));
        System.out.println("Arreglo resultante B: " + Arrays.toString(B));
    }
}
