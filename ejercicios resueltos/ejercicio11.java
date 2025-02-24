public class ejercicio11 {
    public static void main{String[] args { 
    

    /*
     * 11. Dado un arreglo A de N elementos se desea generar tres arreglos que contengan los
     elementos negativos, cero y positivos de arreglo inicial. 
     */

    //creacion de un arreglo a de enteros de n elementos

    //declaracion del arreglo del tamaño n

    int n= (int) (Math.random() * (30 + 15)) + 15;

    int[] a =new int[n];

     //llenar el arreglo con numeros comprendidos entre -20 y 20

     for (int i = 0; i < a.length; i++) {
     a[ï] = (int) (Math.random() * (20 + (-20))) +(-20);
     }
     // mostrar el arreglo para validar que se estan guardando los elementos
     for (int i = 0; i < a.length; i++) {
        System.out.print("|" + a[i]);
     }

     System.out.println();
  }
}
}
