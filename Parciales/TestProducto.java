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

        Producto p1 = new Producto(nombre1, precio1, cantidadEnStock1);

         System.out.println("Ingrese nombre del segundo producto");
        String nombre2 = sc.nextLine();

        System.out.println("Coloque el precio del segundo producto");
        double precio2 = sc.nextDouble();

        System.out.println("coloque la cantidad de stock del segundo producto");
        int cantidadEnStock2 = sc.nextInt();

        sc.nextLine();
        Producto p2 = new Producto(nombre2, precio2, cantidadEnStock2);

        int opcion;
        do{
            System.out.println("=== MENU ===");
            System.out.println("1. Vender stock de p1");
            System.out.println("2. Aumentar el stock de p2");
            System.out.println("3. mostrar el producto con mas stock");
            System.out.println("0. salir del menu");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a vender: ");
                    int cantidad = sc.nextInt();
                    p1.Vender(cantidad);
                    System.out.println("Se vendio la cantidad " + cantidad);
                    break;
            
                case 2:
                    p2.aumentarStock(10);
                    break;

                case 3:
                    int diferencia = p1.tieneMasStock(p2);
                    if (diferencia > 0) {
                        System.out.println(p1.getNombre() + " tiene mas stock.");
                    }
                    else if (diferencia < 0) {
                        System.out.println(p2.getNombre() + " tiene mas stock.");
                    }
                    else{
                        System.out.println("Ambos productos tienen el mismo stock");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del menu.....");
                    break;

                default:
                System.out.println("Elija una opcion valida");
                    break;
            }

        }while(opcion != 0);
        sc.close();
    }  
}
