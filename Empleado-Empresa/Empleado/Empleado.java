package Empleado;
public class Empleado{
    private String nombre;
    private int legajo;
    private double sueldo;

    public Empleado(String nombre, int legajo, double sueldo){
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    // Metodos set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setLegajo(int legajo){
        this.legajo = legajo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    // Metodos get
    public String getNombre(){
        return this.nombre;
    }

    public int getLegajo(){
        return this.legajo;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public boolean ganaMasQue(Empleado otro){
        if (this.sueldo > otro.sueldo) {
            return true;
        }
        return false;
    }
}