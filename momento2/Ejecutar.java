public class Ejecutar {
  public static void main (String[] args)  {

    //instanciar el objeto (creacion)
    Estudiante objEst1 = new Estudiante(1, "gabriela", "astorquiza", 15, "ingenieria");
    Estudiante objEst2 = new Estudiante(2, "juan", "Castro", 20, "Derecho");

    System.out.println(objEst1); //tostring
    System.out.println(objEst2);

    // modificar la edad del estudiante
    objEst1.setEdad(20);

    System.out.println(objEst1);

  }
}
