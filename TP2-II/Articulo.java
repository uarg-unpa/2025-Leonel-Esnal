public class Articulo {
    private String descripcion;
    private double precio;
    private int codigo;
    private int stock;

    public Articulo(String descripcion, double precio, int codigo, int stock){
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
        this.stock = stock;
    }

    // Metodos set:

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    // Metodos get:

    public String getDescripcion(){
        return this.descripcion;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public int getStock(){
        return this.stock;
    }

    // Metodos

    public void DescrementarStock(int venderStock){
        stock = getStock() - venderStock;
    }

    public void IncrementarStock(int comparStock){
        stock = getStock() + comparStock;
    }

    public String toString(){
        return "Articulo [Descripcion=" + descripcion + ", Precio=" + precio + ", Codigo=" + codigo + ", Stock=" + stock + "]";
    }
}
