public class TestArreglo {
    public static void main(String[] args) {
        Arreglo arreglo1 = new Arreglo(4);
        arreglo1.IngresarNumero(30);
        arreglo1.IngresarNumero(3);
        arreglo1.IngresarNumero(6);
        arreglo1.IngresarNumero(87);

        arreglo1.MostrarNum();
        arreglo1.VaciarArrglo();

        System.out.println("----------------------");

        Arreglo arreglo2 = new Arreglo(2);
        arreglo2.IngresarNumero(34);
        arreglo2.IngresarNumero(9);
        arreglo2.IngresarNumero(3);
        
        arreglo2.MostrarNum();

        System.out.println("----------------------");


        Arreglo arreglo3 = new Arreglo(10);
        arreglo3.IngresarNumero(986);
        arreglo3.IngresarNumero(120);
        arreglo3.IngresarNumero(90);
        arreglo3.IngresarNumero(54);
        arreglo3.IngresarNumero(37);
        arreglo3.IngresarNumero(65);
        arreglo3.IngresarNumero(4);
        arreglo3.IngresarNumero(3);
        arreglo3.MostrarNum();
    }
}
