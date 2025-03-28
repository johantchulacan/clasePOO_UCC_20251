import java.util.Scanner;

 class CalculadoraCientifica {
    // Atributos
    private double num1;
    private double num2;
    private Scanner scanner;

    // Constructor
    public CalculadoraCientifica() {
        scanner = new Scanner(System.in);
    }

    // Métodos Get y Set
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Métodos de operación
    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero no permitida.");
            return Double.NaN;
        }
    }

    public double potencia() {
        return Math.pow(num1, num2);
    }

    public double raizCuadrada() {
        if (num1 >= 0) {
            return Math.sqrt(num1);
        } else {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN;
        }
    }

    // Método para iniciar la calculadora
    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            if (opcion == 7) {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
            } else {
                ejecutarOperacion(opcion);
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n--- Calculadora Científica ---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz Cuadrada");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void ejecutarOperacion(int opcion) {
        if (opcion >= 1 && opcion <= 5) {
            System.out.print("Ingrese el primer número: ");
            setNum1(scanner.nextDouble());
            System.out.print("Ingrese el segundo número: ");
            setNum2(scanner.nextDouble());
        } else if (opcion == 6) {
            System.out.print("Ingrese el número: ");
            setNum1(scanner.nextDouble());
        }

        double resultado = 0;
        if (opcion == 1) {
            resultado = sumar();
        } else if (opcion == 2) {
            resultado = restar();
        } else if (opcion == 3) {
            resultado = multiplicar();
        } else if (opcion == 4) {
            resultado = dividir();
        } else if (opcion == 5) {
            resultado = potencia();
        } else if (opcion == 6) {
            resultado = raizCuadrada();
        } else {
            System.out.println("Opción no válida. Intente de nuevo.");
            return;
        }
        System.out.println("Resultado: " + resultado);
    }
}

public class Main {
    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        calculadora.iniciar();
    }
}
