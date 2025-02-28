import java.util.Scanner;

public class ProduccionPlantas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plantas = 20;
        int dias = 7;
        int[][] produccion = new int[plantas][dias];
        
        // Leer datos de producción
        System.out.println("Ingrese la producción de cada planta para los 7 días de la semana:");
        for (int i = 0; i < plantas; i++) {
            System.out.println("Planta " + (i + 1) + ":");
            for (int j = 0; j < dias; j++) {
                System.out.print("Día " + (j + 1) + ": ");
                produccion[i][j] = scanner.nextInt();
            }
        }
        
        // Encontrar la planta con mayor producción semanal
        int maxProduccionSemanal = 0;
        int plantaMaxSemanal = 0;
        for (int i = 0; i < plantas; i++) {
            int suma = 0;
            for (int j = 0; j < dias; j++) {
                suma += produccion[i][j];
            }
            if (suma > maxProduccionSemanal) {
                maxProduccionSemanal = suma;
                plantaMaxSemanal = i + 1;
            }
        }
        
        // Pedir día específico al usuario
        System.out.print("Ingrese el día (1-7) para buscar la planta con mayor producción: ");
        int diaBuscado = scanner.nextInt() - 1;
        
        // Encontrar la planta con mayor producción en el día específico
        int maxProduccionDia = 0;
        int plantaMaxDia = 0;
        for (int i = 0; i < plantas; i++) {
            if (produccion[i][diaBuscado] > maxProduccionDia) {
                maxProduccionDia = produccion[i][diaBuscado];
                plantaMaxDia = i + 1;
            }
        }
        
        // Imprimir resultados
        System.out.println("\nResultados:");
        System.out.println("La planta con mayor producción semanal es la Planta " + plantaMaxSemanal + " con " + maxProduccionSemanal + " unidades.");
        System.out.println("La planta con mayor producción en el día " + (diaBuscado + 1) + " es la Planta " + plantaMaxDia + " con " + maxProduccionDia + " unidades.");
        
        scanner.close();
    }
}
