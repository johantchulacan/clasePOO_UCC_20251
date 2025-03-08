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
                registrarMoto(scanner);
            } else if (opcion == 2) {
                cobrarTarifa(scanner);
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

    private static void registrarMoto(Scanner scanner) {
        mostrarEstadoParqueadero();
        System.out.print("Ingrese el número de puesto (0-19): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.next();
        }
        int puesto = scanner.nextInt();

        if (puesto < 0 || puesto >= 20) {
            System.out.println("Error: Puesto inválido.");
            return;
        }

        if (!parqueadero[puesto].equals("DISPONIBLE")) {
            System.out.println("Error: El puesto está ocupado.");
            return;
        }

        System.out.print("Ingrese la hora de ingreso (07-22): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.next();
        }
        int hora = scanner.nextInt();

        if (hora < 7 || hora > 22) {
            System.out.println("Error: Hora fuera del horario permitido.");
            return;
        }

        parqueadero[puesto] = "OCUPADO";
        horaIngreso[puesto] = hora;
        System.out.println("Moto registrada en el puesto " + puesto + " a las " + hora + ":00.");
    }


    private static void cobrarTarifa(Scanner scanner) {
        mostrarEstadoParqueadero();
        System.out.print("Ingrese el número de puesto a cobrar (0-19): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.next();
        }
        int puesto = scanner.nextInt();

        if (puesto < 0 || puesto >= 20) {
            System.out.println("Error: Puesto inválido.");
            return;
        }

        if (!parqueadero[puesto].equals("OCUPADO")) {
            System.out.println("Error: No hay una moto en este puesto.");
            return;
        }

        System.out.print("Ingrese la hora actual (07-22): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.next();
        }
        int horaSalida = scanner.nextInt();

        if (horaSalida < 7 || horaSalida > 22) {
            System.out.println("Error: Hora fuera del horario permitido.");
            return;
        }

        int horaIngresoMoto = horaIngreso[puesto];
        if (horaIngresoMoto == -1) {
            System.out.println("Error: No hay registro de ingreso para este puesto.");
            return;
        }

        int tiempo = horaSalida - horaIngresoMoto;

        if (tiempo < 0) {
            System.out.println("Error: La hora de salida no puede ser menor que la hora de ingreso.");
            return;
        }
        

        int tarifa = calcularTarifa(tiempo);

        System.out.println("Tiempo estacionado: " + tiempo + " horas.");
        System.out.println("Total a pagar: $" + tarifa);

        parqueadero[puesto] = "DISPONIBLE";
        horaIngreso[puesto] = -1;
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