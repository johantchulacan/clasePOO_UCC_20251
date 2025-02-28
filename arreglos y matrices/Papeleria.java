import java.util.Scanner;

public class Papeleria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Datos de los cuadernos
        String[] distribuidoras = {"Norma", "Caribe", "Alpes"};
        char[] modelos = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        double[] precios = new double[8];
        int[][] ventas = new int[8][30];
        
        // Ingresar precios de los cuadernos
        System.out.println("Ingrese los precios de los modelos de cuadernos:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Precio del modelo " + modelos[i] + ": ");
            precios[i] = scanner.nextDouble();
        }
        
        // Ingresar ventas diarias de cada modelo
        System.out.println("Ingrese las ventas diarias por modelo durante 30 días:");
        for (int dia = 0; dia < 30; dia++) {
            System.out.println("Día " + (dia + 1) + ":");
            for (int i = 0; i < 8; i++) {
                System.out.print("Ventas del modelo " + modelos[i] + ": ");
                ventas[i][dia] = scanner.nextInt();
            }
        }
        
        // Calcular total recaudado por modelo
        double[] totalPorModelo = new double[8];
        for (int i = 0; i < 8; i++) {
            for (int dia = 0; dia < 30; dia++) {
                totalPorModelo[i] += ventas[i][dia] * precios[i];
            }
        }
        
        // Calcular total recaudado por día
        double[] totalPorDia = new double[30];
        for (int dia = 0; dia < 30; dia++) {
            for (int i = 0; i < 8; i++) {
                totalPorDia[dia] += ventas[i][dia] * precios[i];
            }
        }
        
        // Encontrar el modelo que más dinero produjo
        int indiceMax = 0;
        for (int i = 1; i < 8; i++) {
            if (totalPorModelo[i] > totalPorModelo[indiceMax]) {
                indiceMax = i;
            }
        }
        
        // Mostrar resultados
        System.out.println("\nTotal recaudado por modelo en 30 días:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Modelo " + modelos[i] + ": $" + totalPorModelo[i]);
        }
        
        System.out.println("\nTotal recaudado por día:");
        for (int dia = 0; dia < 30; dia++) {
            System.out.println("Día " + (dia + 1) + ": $" + totalPorDia[dia]);
        }
        
        System.out.println("\nEl modelo que más dinero produjo fue el modelo " + modelos[indiceMax] + " con $" + totalPorModelo[indiceMax]);
        
        scanner.close();
    }
}
