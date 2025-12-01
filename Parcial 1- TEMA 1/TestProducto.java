
import java.util.Scanner;

public class TestProducto {
    public static void main(String[] args) {
        Scanner P1 = new Scanner(System.in);
        Scanner P2 = new Scanner(System.in);

        System.out.println("Ingrese nombre del producto");
        String nombre1 = P1.nextLine();

        System.out.println("Ingrese nombre del segundo producto");
        String nombre2 = P2.nextLine();

        System.out.println("Coloque el precio del producto");
        double precio1 = P1.nextDouble();

        System.out.println("Coloque el precio del segundo producto");
        double precio2 = P2.nextDouble();

        System.out.println("coloque la cantidad de stock del producto");
        int cantidadEnStock1 = P1.nextInt();

        System.out.println("coloque la cantidad de stock del segundo producto");
        int cantidadEnStock2 = P2.nextInt();
        
        Producto producto1 = new Producto(nombre1, precio1, cantidadEnStock1);

        Producto producto2 = new Producto(nombre2, precio2, cantidadEnStock2);



        P1.close();
        P2.close();
    }
}
