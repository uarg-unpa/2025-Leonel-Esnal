public class Pedido{
    private String cliente;
    private double monto;
    private String descripcion;

    public Pedido(String cliente, double monto, String descripcion){
        this.cliente = cliente;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    // Metodo set

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public void setMonto(double monto){
        this.monto = monto;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    // Metodo get

    public String getCliente(){
        return this.cliente;
    }

    public double getMonto(){
        return this.monto;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public String toString(){
        return "Pedido[Clientes: " + cliente + ", Monto: " + monto + ", Descripcion: " + descripcion + "]";
    }
}