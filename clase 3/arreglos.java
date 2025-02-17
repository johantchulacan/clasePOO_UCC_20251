public class arreglos {
    public static void main (String[] args){

        /*
         * primera forma de declarar un arreglo:
         * int[] a= {8, 3, 10, 22, 1, 9};
         * 
         * segunda forma de declarar un arreglo:
         * int[] a = new int[6];
         * el numero hace referncia al tamaño del arreglo
         * tenemos que llenar el arreglo
         */

        int[] a = {8, 3, 10, 22, 1, 9};

        for (int i= 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a [i]);
        }

        //---------------------------------------------

        // new instanciar , crear, darle vida al objeto

        int tam = 10;
        int[] b = new int[tam];

        for(int i = 0; i < b.length; i++){
            b[i] = (int) (Math.random() * (30 + 10)) + 10;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]=" + b[i]);
        }
    }
}