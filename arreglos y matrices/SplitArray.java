import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int N = scanner.nextInt();
        int[] A = new int[N];
        
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        List<Integer> negativos = new ArrayList<>();
        List<Integer> ceros = new ArrayList<>();
        List<Integer> positivos = new ArrayList<>();
        
        for (int num : A) {
            if (num < 0) {
                negativos.add(num);
            } else if (num == 0) {
                ceros.add(num);
            } else {
                positivos.add(num);
            }
        }
        
        System.out.println("Arreglo de negativos: " + negativos);
        System.out.println("Arreglo de ceros: " + ceros);
        System.out.println("Arreglo de positivos: " + positivos);
        
        scanner.close();
    }
}
