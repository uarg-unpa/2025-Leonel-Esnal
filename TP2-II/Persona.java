public class Persona{
    private String nombre;
    private int edad;
    private int DNI;
    private char sexo;
    private double peso;
    private double altura;

    //Constructores
    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.DNI = 0;
        this.sexo = 'M';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = 0;
        this.DNI = 0;
        this.sexo = 'M';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int e){
        this.edad = e;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setDNI(int DNI){
        this.DNI = DNI;
    }

    public int getDNI(){
        return this.DNI;
    }

    public void setSexo(char s){
        this.sexo = ComprobarSexo(s);
    }

    public char getSexo(){
        return sexo;
    }

    public void setPeso(double p){
        this.peso = p;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setAltura(double a){
        this.altura = a;
    }

    public double getAltura(){
        return this.altura;
    }

    // metodos

    public boolean esMayorDeEdad(){
        if (this.edad >= 18) {
            return true;
        }
        else{
            return false;
        }
    }

    private char ComprobarSexo(char sexo){
        if (sexo == 'M' || sexo == 'H') {
            return sexo;
        }
        else{
            return 'M';
        }
        
    }

     public String toString() {
        return "Persona {" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", Sexo=" + sexo +
                ", Peso=" + peso +
                ", Altura=" + altura +
                '}';
    }

    
}