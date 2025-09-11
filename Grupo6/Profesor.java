public class Profesor {
    private String nombre;
    private int exp;
    //CONSTRUCTOR
    public Profesor (String nombre, int exp){
        this.nombre = nombre;
        this.exp = exp;
    }
    //METODOS SET
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setExp (int exp){
        this.exp = exp;
    }
    //METODOS GET
    public String getNombre(){
        return this.nombre;
    }
    public int getExp(){
        return this.exp;
    }
    // OTROS METODOS 
    

    public boolean esExperto(){
        if (exp > 10){
            return true;
        }else {
            return false; 
        }
    }

    public String toString(){
        return nombre +  " " + exp;
    }
}
