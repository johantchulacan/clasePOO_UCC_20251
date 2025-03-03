import java.util.Scanner;

public class parqueadero {
    public static void main(String[] args) {
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
            int opcion = scanner.nextInt();
            

            if (opcion == 1){
            System.out.println("1. registro moto");
            //lógica
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
