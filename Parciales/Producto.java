public class Producto{
    // Atributos
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Constructor
    public Producto(String nombre, double precio, int cantidadEnStock){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    //SET
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setCantidadEnStock(int cantidadEnStock){
        this.cantidadEnStock = cantidadEnStock;
    }

    //GET
    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getCantidadEnStock(){
        return this.cantidadEnStock;
    }

    //Metodos

    public boolean hayStock(int cantidad){
        return getCantidadEnStock() > cantidad;
    }

    public boolean Vender(int cantidad){
        if (hayStock(cantidad)) {
            cantidadEnStock -= cantidad;
            return true;
        }
        return false;
    }

    public void aumentarStock(int cantidad){
        cantidadEnStock += cantidad;
    }

    public int tieneMasStock(Producto otro){
        return this.cantidadEnStock - otro.cantidadEnStock;
    }  

    public String toString(){
        return "Producto [Nombre=" + nombre + ", Precio=" + precio + ", Stock=" + cantidadEnStock + "]";
    }

}