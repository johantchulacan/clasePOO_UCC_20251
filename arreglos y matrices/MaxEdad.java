public class MaxEdad {
    public static void main(String[] args) {
        int[] edades1 = {25, 34, 18, 42, 55};
        int[] edades2 = {30, 29, 47, 50, 60};
        
        int maxEdad = encontrarMaximo(edades1, edades2);
        
        System.out.println("La edad mayor es: " + maxEdad);
    }
    
    public static int encontrarMaximo(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        
        for (int edad : arr1) {
            if (edad > max) {
                max = edad;
            }
        }
        
        for (int edad : arr2) {
            if (edad > max) {
                max = edad;
            }
        }
        
        return max;
    }
}
