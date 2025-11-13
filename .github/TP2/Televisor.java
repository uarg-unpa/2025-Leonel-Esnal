public class Televisor {
    private String marca;
    private String modelo;
    private String estado;
    private int volumen;
    private int canal;
    private int anterior;
    
    
    //Constructor
    public Televisor(String marca, String modelo, String estado, int volumen, int canal){
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.volumen = volumen;
        this.canal = canal;
        this.anterior = canal;
    }

    // set y get
    
    public void setMarca(String m){
        this.marca = m;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String mo){
        this.modelo = mo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setEstado(String e){
        this.estado = e;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setVolumen(int vol){
        this.volumen = vol;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public void setCanal(int ca){
        this.canal = ca;
    }
    public int getCanal(){
        return this.canal;
    }

    public void setAnterior(int ant){
        this.anterior = ant;
    }

    public int getAnterior(){
        return this.anterior;
    }

    //Metodos
    public void subirCanal(){
        this.canal = canal + 1;
    }

    public void bajasCanal(){
        this.canal = canal - 10;
    }

    public void subirVolumen(){
        this.volumen = volumen + 5;
    }

    public void bajarVolumen(){
        this.volumen = volumen - 3;
    }

    public void volveralcanal(){
        this.canal = anterior;
    }

}
