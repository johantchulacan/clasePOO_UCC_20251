public class Ejercicio2 {
    public static void main(String[] args) {

        /*
         * Se tienen N empleados de una compañía y se ha ideado llenar un arreglo lineal A con
         sueldos de los empleados, un arreglo B con las asignaciones totales de cada empleado,
         un arreglo C con las deducciones de cada uno. Crear un arreglo T que contenga el neto
         a pagar a cada empleado. (Neto a pagar= sueldo + asignaciones - deducciones) 
         */
         //tener en cuenta que los arreglos todos deben ser del mismo tamaño
         //sueldo de los empleados
         double[] A = {  1000.0, 1350.0, 900.0 };
         //asignaciones totales de cada empleado
         double[] B = { 100.0, 230.0, 150.0 };
         //deducciones de cada empleado
         double[] C = {20.0, 35.0, 10.0};

         //arreglo que almacena el neto a pagar de cada empleado ej: A.length --> 3
         double[] T = new double[A.length];

         for(int i=0; i< T.length; i++) {
            T[i] = A [i] + B[i] - C[i];
         }

         //mostrar el neto a pagar de los empleados

         for(int i = 0; i < T.length; i++) {
            System.out.println("T[" + i + "]=" + T[i]);
         }

        
    }
}