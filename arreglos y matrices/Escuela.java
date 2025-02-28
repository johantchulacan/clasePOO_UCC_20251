import java.util.ArrayList;
import java.util.Scanner;

class Profesor {
    String nombre;
    int edad;
    char sexo;

    public Profesor(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
}

public class Escuela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Profesor> profesores = new ArrayList<>();
        
        System.out.print("Ingrese el número de profesores: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los datos del profesor " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();
            
            profesores.add(new Profesor(nombre, edad, sexo));
        }
        
        // Calcular edad promedio
        int sumaEdades = 0;
        Profesor masJoven = profesores.get(0);
        Profesor masViejo = profesores.get(0);
        
        for (Profesor p : profesores) {
            sumaEdades += p.edad;
            if (p.edad < masJoven.edad) {
                masJoven = p;
            }
            if (p.edad > masViejo.edad) {
                masViejo = p;
            }
        }
        
        double edadPromedio = (double) sumaEdades / n;
        
        // Contar profesoras mayores al promedio y profesores menores al promedio
        int profesorasMayores = 0, profesoresMenores = 0;
        
        for (Profesor p : profesores) {
            if (p.edad > edadPromedio && p.sexo == 'F') {
                profesorasMayores++;
            }
            if (p.edad < edadPromedio && p.sexo == 'M') {
                profesoresMenores++;
            }
        }
        
        // Imprimir resultados
        System.out.println("Edad promedio del grupo: " + edadPromedio);
        System.out.println("Profesor más joven: " + masJoven.nombre);
        System.out.println("Profesor de mayor edad: " + masViejo.nombre);
        System.out.println("Número de profesoras con edad mayor al promedio: " + profesorasMayores);
        System.out.println("Número de profesores con edad menor al promedio: " + profesoresMenores);
    }
}
