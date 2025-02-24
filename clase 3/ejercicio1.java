import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1: Suma de N números
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        System.out.println("La suma es: " + suma);

 // Ejercicio 2: Neto a pagar por empleado
 System.out.print("Ingrese la cantidad de empleados: ");
 int empleados = scanner.nextInt();
 int[] sueldos = new int[empleados];
 int[] asignaciones = new int[empleados];
 int[] deducciones = new int[empleados];
 int[] netoPagar = new int[empleados];
 for (int i = 0; i < empleados; i++) {
     System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
     sueldos[i] = scanner.nextInt();
     System.out.print("Ingrese las asignaciones: ");
     asignaciones[i] = scanner.nextInt();
     System.out.print("Ingrese las deducciones: ");
     deducciones[i] = scanner.nextInt();
     netoPagar[i] = sueldos[i] + asignaciones[i] - deducciones[i];
 }
 System.out.println("Neto a pagar por empleado: ");
 for (int i = 0; i < empleados; i++) {
     System.out.println("Empleado " + (i + 1) + ": " + netoPagar[i]);
 }
}
}
