import java.util.Scanner;

public class ProduccionCereales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] cosechas = new double[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        // Entrada de datos
        System.out.println("Ingrese la producción de cereales en toneladas para cada mes:");
        double total = 0;
        for (int i = 0; i < 12; i++) {
            System.out.print(meses[i] + ": ");
            cosechas[i] = scanner.nextDouble();
            total += cosechas[i];
        }
        
        // Cálculo del promedio anual
        double promedioAnual = total / 12;
        System.out.printf("\nPromedio anual de toneladas cosechadas: %.2f\n", promedioAnual);
        
        // Cálculo de meses por encima y por debajo del promedio
        int mesesSuperiores = 0, mesesInferiores = 0;
        for (double cosecha : cosechas) {
            if (cosecha > promedioAnual) {
                mesesSuperiores++;
            } else if (cosecha < promedioAnual) {
                mesesInferiores++;
            }
        }
        System.out.println("Meses con cosecha superior al promedio anual: " + mesesSuperiores);
        System.out.println("Meses con cosecha inferior al promedio anual: " + mesesInferiores);
        
        // Determinar el mes con mayor producción
        int indiceMaximo = 0;
        for (int i = 1; i < 12; i++) {
            if (cosechas[i] > cosechas[indiceMaximo]) {
                indiceMaximo = i;
            }
        }
        System.out.println("El mes con mayor producción fue: " + meses[indiceMaximo] + " con " + cosechas[indiceMaximo] + " toneladas.");
        
        scanner.close();
    }
}
