import java.util.Scanner;

public class MaxMinCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[30];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countMax = 0, countMin = 0;
        
        System.out.println("Ingrese 30 números:");
        
        for (int i = 0; i < 30; i++) {
            numbers[i] = scanner.nextInt();
            
            if (numbers[i] > max) {
                max = numbers[i];
                countMax = 1; 
            } else if (numbers[i] == max) {
                countMax++;
            }
            
            if (numbers[i] < min) {
                min = numbers[i];
                countMin = 1;
            } else if (numbers[i] == min) {
                countMin++;
            }
        }
        
        System.out.println("Número mayor: " + max + " (Aparece " + countMax + " veces)");
        System.out.println("Número menor: " + min + " (Aparece " + countMin + " veces)");
        
        scanner.close();
    }
}
