public class Curso {

    private String nombre;
    private double duracion;
    private Profesor profesor;
    // CONSTRUCTOR
    public Curso (String nombre, double duracion, Profesor profesor){
        this.nombre = nombre;
        this.duracion = duracion;
        this.profesor = profesor;

    }
    // METODOS SET
    public void setNombre(String nombre){
        this.nombre = nombre;   
    }
    public void setDuracion(double duracion){
        this.duracion = duracion;   
    }
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;   
    }
    //METODOS GET
    public String getNombre(){
        return this.nombre;
    }
    public double getDuracion(){
        return this.duracion;
    }
    public Profesor getProfesor(){
        return this.profesor;
    }

// OTROS METODOS
    public void actualizarExp(int aumento){
        aumento = aumento + profesor.getExp();
        profesor.setExp(aumento);
    }

    public void CaalcularHorasSemana(double dias){
        dias = getDuracion() / dias; 
        setDuracion(dias);
    }

//TO STRING
    public String toString(){
    return  "Curso [ nombre =" + nombre + ", duracion =" + duracion + ", profesor =" + profesor + " ]";
    }
}
