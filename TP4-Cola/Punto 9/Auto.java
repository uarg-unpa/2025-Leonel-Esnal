public class Auto {
    private String matricula;
    public Object getMatricula;

    public Auto(String matricula){
        this.matricula = matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String toString(){
        return "Auto [Matricula " + matricula + "]";
    }


}
