
public class Rectangulo{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //Metodos set y get

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    // Metodos
    public double CalcularArea(){
        return (base*altura);
    }

    public double CalcularPerimetro(){
        return ((2 * base) + (2 * altura));
    }

    public boolean esMayorArea(Rectangulo R){
        return this.CalcularArea() > R.CalcularArea();
    }

    public String toString(){
        return "Rectangulo [Base= " + base + " Altura= " + altura + " Area= " + CalcularArea() + " Perimetro= " + CalcularPerimetro() + "]";
    }
}