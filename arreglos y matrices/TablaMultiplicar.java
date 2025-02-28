public class TablaMultiplicar {
    public static void main(String[] args) {
        int[][] tabla = new int[10][10];
        
        // Llenar la tabla con las multiplicaciones
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }
        
        // Imprimir la tabla de multiplicar
        System.out.println("Tabla de multiplicar del 1 al 10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println();
        }
    }
}
