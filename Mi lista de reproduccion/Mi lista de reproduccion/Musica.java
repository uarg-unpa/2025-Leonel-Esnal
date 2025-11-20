public class Musica{
    private String interprete;
    private String genero;
    private int año;

    public Musica(String interprete, String genero, int año){
        this.interprete = interprete;
        this.genero = genero;
        this.año = año;
    }

    // Metodos set
    public void setInterprete(String interprete){
        this.interprete = interprete;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setAño(int año){
        this.año = año;
    }

    // Metodos get
    public String getInterprete(){
        return this.interprete;
    }

    public String getGenero(){
        return this.genero;
    }

    public int getAño(){
        return this.año;
    }

    public String toString(){
        return "musica[ Interprete " + interprete + " Genero " + genero + " Año " + año + "]";
    }
}