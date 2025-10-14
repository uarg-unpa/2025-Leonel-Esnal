import java.util.Scanner;

public class TestProducto {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre del primer producto");
        String nombre1 = sc.nextLine();

        System.out.println("Coloque el precio del primer producto");
        double precio1 = sc.nextDouble();

        System.out.println("coloque la cantidad de stock del primer producto");
        int cantidadEnStock1 = sc.nextInt();

         sc.nextLine();

        Producto producto1 = new Producto(nombre1, precio1, cantidadEnStock1);

         System.out.println("Ingrese nombre del segundo producto");
        String nombre2 = sc.nextLine();

        System.out.println("Coloque el precio del segundo producto");
        double precio2 = sc.nextDouble();

        System.out.println("coloque la cantidad de stock del segundo producto");
        int cantidadEnStock2 = sc.nextInt();

        sc.nextLine();
        Producto producto2 = new Producto(nombre2, precio2, cantidadEnStock2);

        producto1.Vender(30);
        System.out.println(producto1);
        producto2.aumentarStock(10);
        System.out.println(producto2);

        int diferente = producto1.tieneMasStock(producto2);
        if (diferente > 0) {
            System.out.println("El producto con mayor stock es: " + producto1.getNombre());
        }else if(diferente < 0){
            System.out.println("El producto con mayor stock es: " + producto2.getNombre());
        }
        System.out.println("Ambos productos tinen la misma cantidad");
        sc.close();
    }  
}
