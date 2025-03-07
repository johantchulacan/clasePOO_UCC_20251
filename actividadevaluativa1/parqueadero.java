import java.util.Scanner;

public class parqueadero { 
    private static String[] parqueadero = new String[20]; // Vector para puestos
    private static int[] horaIngreso = new int[20]; // Vector para registrar horas de ingreso
    

    public static void main(String[] args) {
        inicializarParqueadero();
        // menu principal
        //do while
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("menu principal");
            System.out.println("1. registro moto");
            System.out.println("2. cobro de tarifa del parqueadero");
            System.out.println("3. cerrar sistema");
            System.out.println("selecione una opcion");
            opcion = scanner.nextInt();
            

            if (opcion == 1){
            System.out.println("1. registro moto");
            } else if (opcion == 2){
            System.out.println("2. cobro de tarifa del parqueadero");
            } else if (opcion == 3){
            System.out.println("saliendo del sistema");
            } else {
            System.out.println("opcion invalida,intente nuevamente");
            }
         } while (opcion != 3);

    }
}

private static void inicializarParqueadero() {
    for (int i = 0; i < 20; i++) {
        parqueadero[i] = "DISPONIBLE";
        horaIngreso[i] = -1;
    }
}

private static void registrarMoto() {
    mostrarEstadoParqueadero();
    System.out.print("Ingrese el número de puesto (0-19): ");
    int puesto = scanner.nextInt();
    
    if (puesto < 0 || puesto >= 20) {
        System.out.println("Puesto inválido.");
        break;
    }

    if (parqueadero[puesto].equals("OCUPADO")) {
        System.out.print("Ingrese la hora de salida (07-22): ");
        int horaSalida = scanner.nextInt();
        
        if (horaSalida < 7 || horaSalida > 22) {
            System.out.println("Hora fuera del horario permitido.");
            break;
        }
        
        int tiempo = horaSalida - horaIngreso[puesto];
        int tarifa = calcularTarifa(tiempo);
        
        System.out.println("Tiempo estacionado: " + tiempo + " horas.");
        System.out.println("Total a pagar: $" + tarifa);
        
        parqueadero[puesto] = "DISPONIBLE";
        horaIngreso[puesto] = -1;
    } else {
        System.out.println("El puesto está vacío, no hay cobro.");

    
    private static int calcularTarifa(int tiempo) {
        if (tiempo <= 0) break 0;
        else if (tiempo <= 1) break 800;
        else if 2000;

    
    }

    private static void mostrarEstadoParqueadero() {
        System.out.println("Estado del Parqueadero:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Puesto " + i + ": " + parqueadero[i]);

        
        }

    }
}