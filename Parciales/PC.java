public class PC {
    private String marca;
    private String procesador;
    private double precio;
    private int ram;

    public PC(String marca, String procesador, double precio, int ram){
        this.marca = marca;
        this.procesador = procesador;
        this.precio = precio;
        this.ram = ram;
    }

    // metodos set y get
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setProcesador(String procesador){
        this.procesador = procesador;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
     public void setRam(int ram){
        this.ram = ram;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getProcesador(){
        return this.procesador;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getRam(){
        return this.ram;
    }

    // Metodos
    public int ActualizarRam(int nuevaRam){
        nuevaRam = nuevaRam + getRam();
        return nuevaRam;
    }

    public void AplicarDescuento(double porcentaje){
        double descuento = (precio * porcentaje) / 100;
        precio -= descuento;
    }

    public String toString(){
        return "PC [Marca: " + marca + ", Procesador: " + procesador + ", Precio: " + precio + ", RAM: " + ram + "]";
    }

    public boolean MayorRam(PC p){
        return this.getRam() > p.getRam();
    }

}
