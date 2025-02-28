public class MatrizCerosDiagonal {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        // Llenar la matriz con ceros en la diagonal principal y hacia arriba
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j >= i) { // Si está en la diagonal o encima, poner 0
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 1; // Puede ser otro valor según la necesidad
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
