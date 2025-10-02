public class TestEstacion {
    public static void main(String[] args) {
        Estacion estacion1;
        
        estacion1 = new Estacion(5000.0);

        estacion1.CargarCombustible(2000.0);
        estacion1.CargarCombustible(3000.0);
        estacion1.CargarCombustible(5000.0);
        System.out.println("Cantidad actual de combustible que hay en la estacion: " + estacion1.getCantidadActual() + " litros");
    }
}
