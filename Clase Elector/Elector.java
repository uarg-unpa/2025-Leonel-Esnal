public class Elector {
    private String nombre;
    private String apellido;
    private int matricula;
    private int clase;
    private String domicilio;

    public Elector(String nombre, String apellido, int matricula, int clase, String domicilio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.clase = clase;
        this.domicilio = domicilio;
    }

    // Metodo set y get
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setClase(int clase){
        this.clase = clase;
    }

    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public int getClase(){
        return this.clase;
    }

    public String getDomicilo(){
        return this.domicilio;
    }

    // Metodos

    public String toString(){
        return "Elector [Nombre= " + nombre + ", Apellido= " + apellido + ", Matricula= " + matricula + ", Clase= " + clase + ", Domicilio= " + domicilio + "]";
    }
}
