public class Teatro {
    private String nombre;
    private String calle;
    private int numero;

    //Constructor
    public Teatro(String nombre, String calle, int numero){
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setCalle(String calle){
        this.calle = calle;
    }

    public String getCalle(){
        return this.calle;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public String toString(){
        return nombre + " " + calle + " " + numero;
    }

}
