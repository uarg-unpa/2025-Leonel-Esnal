public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private int velocidadMax;

    public Auto(String marca, String modelo, int año, int velocidadMax){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadMax = velocidadMax;
    } 
    
    // metodo set
    public void setMarca(String marca){
        this.marca = marca;
    } 

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAño(int año){
        this.año = año;
    }

    public void setVelocidadMax(int velocidadMax){
        this.velocidadMax = velocidadMax;
    }

    // metodo get
    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAño(){
        return this.año;
    }

    public int getVelocidadMax(){
        return this.velocidadMax;
    }

    // Otros metodos
    public boolean esMasRapidoQue(Auto otro){
        return this.velocidadMax > otro.velocidadMax;
    }

    public boolean esAutoClasico(){
        return this.año < 2000;
    }

    public String toString(){
        return "Auto[Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", VelocidadMax: " + velocidadMax + "]";
    }
}
