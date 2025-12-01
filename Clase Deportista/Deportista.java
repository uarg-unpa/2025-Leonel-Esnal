public class Deportista {
    private String nombre;
    private int edad;
    private String deporte;
    private int puntos;

    public Deportista(String nombre, int edad, String deporte, int puntos){
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        this.puntos = puntos;
    }

    //Metodo set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setDeprote(String deporte){
        this.deporte = deporte;
    }

    public void setPuntos(int puntos){
        this.puntos = puntos;
    }

    //Metodo get
    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getDeporte(){
        return this.deporte;
    }

    public int getPuntos(){
        return this.puntos;
    }

    // Otros metodos

    public boolean esMasExperimentado(Deportista otro){
        return this.puntos > otro.puntos;
    }

    public boolean esMayor(){
        return this.edad > 18;
    }

    public String toString(){
        return "Deportista[Nombre: " + nombre + ", Edad: " + edad + ", Deporte: " + deporte + ", Puntos: " + puntos + "]";
    }
}
