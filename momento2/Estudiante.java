public class Estudiante {
    //atributos
    private int id;
    private String  nombre;
    private String apellido;
    private int edad;
    private String facultad;

    //constructor de la clase
    //me permite inicializar la clase

    public Estudiante(int id, String nombre, String apellido, int edad, String facultad){
        //autorefencia  a los atributos de a clase
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.facultad = facultad;

    }

    //metodos get y set o (getter and setter)

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getFacultad(){
        return facultad;
    }

    public void setFacultad(String facultad){
        this.facultad = facultad;
    }

    
    //metodos
    public void matricularCursos(String curso){
        System.out.println("curso: " + curso + " matriculado!!.");
    }
// firma del metodo public private protected void no retorna string int retorna
    public String verificarCreditos(int creditos){
        String cad = "";
        if(creditos < 10){
            cad = "No puede matricular menos de 10 creditos";
        }else{
            cad = "Sus creditos cumplen con lo requerido";
        }
        return cad;
    }

    public String toString(){
        return "Estudiante { id:" + id + 
        " nombre:" + nombre + 
        " apellido:" + apellido +
        " edad:" + edad +
        " facultad:" + facultad + "}";
    }

}