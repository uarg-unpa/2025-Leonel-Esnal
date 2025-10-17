package Grupo6;
public class Profesor {
    private String nombreDeprofesor;
    private int exp;
    //CONSTRUCTOR
    public Profesor (String nombreDeprofesor, int exp){
        this.nombreDeprofesor = nombreDeprofesor;
        this.exp = exp;
    }
    //METODOS SET
    public void setNombreDeprofesor(String nombreDeprofesor){
        this.nombreDeprofesor = nombreDeprofesor;
    }
    public void setExp (int exp){
        this.exp = exp;
    }
    //METODOS GET
    public String getNombreDeprofesor(){
        return this.nombreDeprofesor;
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
        return nombreDeprofesor +  " " + exp;
    }
}
