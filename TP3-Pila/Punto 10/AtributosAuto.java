public class AtributosAuto {
    private String patente;
    private String marca;
    private String modelo;

    public AtributosAuto(String patente, String marca, String modelo){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void SetPatente(String patente){
        this.patente = patente;
    }

    public String getPatente(){
        return patente;
    }

    public String toString(){
        return "NombreAuto[Patente= " + patente + " Marca= " + marca + " Modelo= " + modelo + "]";
    }
}
