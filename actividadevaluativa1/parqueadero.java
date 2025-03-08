import java.util.Scanner;

public class parqueadero {

    private static String[] parqueadero = new String[20]; // Vector para puestos
    private static int[] horaIngreso = new int[20]; // Vector para registrar horas de ingreso

    public static void main(String[] args) {
        inicializarParqueadero();
        // menu principal
        // do while
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("menu principal");
            System.out.println("1. registro moto");
            System.out.println("2. cobro de tarifa del parqueadero");
            System.out.println("3. cerrar sistema");
            System.out.println("selecione una opcion");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                registrarMoto();
            } else if (opcion == 2) {
                System.out.println("digite el tiempo que duro parqueado");
                int t = scanner.nextInt();
                calcularTarifa(t);
            } else if (opcion == 3) {
                System.out.println("saliendo del sistema");
            } else {
                System.out.println("opcion invalida,intente nuevamente");
            }
        } while (opcion != 3);

        scanner.close();

    }

    private static void inicializarParqueadero() {
        for (int i = 0; i < parqueadero.length; i++) {
            parqueadero[i] = "DISPONIBLE";
            horaIngreso[i] = -1;
        }
    }

    private static void registrarMoto() {
        Scanner scanner = new Scanner(System.in);
        mostrarEstadoParqueadero();
        System.out.print("Ingrese el número de puesto (0-19): ");
        int puesto = scanner.nextInt();

    
        if (puesto < 0 || puesto >= 20) {
            System.out.println("Puesto inválido.");
        
        }
        

        if (parqueadero[puesto].equals("DISPONIBLE")) {
            System.out.print("Ingrese la hora de salida (07-22): ");
            int horaSalida = scanner.nextInt();

            if (horaSalida < 7 || horaSalida > 22) {
                System.out.println("Hora fuera del horario permitido.");
            }

            int tiempo = horaSalida - horaIngreso[puesto];
            int tarifa = calcularTarifa(tiempo);

            System.out.println("Tiempo estacionado: " + tiempo + " horas.");
            System.out.println("Total a pagar: $" + tarifa);

            parqueadero[puesto] = "OCUPADO";
            horaIngreso[puesto] = -1;
        } else {
            System.out.println("El puesto esta ocupado.");
        }

    }

    private static int calcularTarifa(int tiempo) {
        int v = 0;
        if (tiempo <= 0) {
            v = 0;
        } else if (tiempo <= 1) {
            v = 800;
        } else {
            v = 2000;
        }
        return v;

    }  

    private static void mostrarEstadoParqueadero() {
        System.out.println("Estado del Parqueadero:");
        for (int i = 0; i < parqueadero.length; i++) {
            System.out.println("Puesto " + i + ": " + parqueadero[i]);

        }

    }
}