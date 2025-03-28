import java.util.ArrayList;
import java.util.Scanner;

public class Maindos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el tamaño del arreglo
        System.out.print("Ingrese el número de elementos: ");
        int N = scanner.nextInt();
        
        int[] A = new int[N];
        System.out.println("Ingrese los elementos del arreglo:");
        
        // Leer los elementos del arreglo
        int suma = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            suma += A[i];
        }
        
        // Calcular la media
        double media = (double) suma / N;
        
        // Listas para almacenar mayores y menores que la media
        ArrayList<Integer> mayores = new ArrayList<>();
        ArrayList<Integer> menores = new ArrayList<>();
        
        for (int num : A) {
            if (num > media) {
                mayores.add(num);
            } else if (num < media) {
                menores.add(num);
            }
        }
        
        // Mostrar resultados
        System.out.println("Media: " + media);
        System.out.println("Elementos mayores que la media: " + mayores);
        System.out.println("Elementos menores que la media: " + menores);
    }
}
