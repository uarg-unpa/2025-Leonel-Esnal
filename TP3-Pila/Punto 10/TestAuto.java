import java.util.Scanner;

public class TestAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto pila = new Auto(13);
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Meter auto");
            System.out.println("2. Sacar auto");
            System.out.println("3. Mostrar pila");
            System.out.println("0. Salir del menu");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese patente: ");
                    String patente = sc.nextLine();
                    System.out.println("Ingrese marca: ");
                    String marca = sc.nextLine();
                    System.out.println("Ingrese modelo: ");
                    String modelo = sc.nextLine();
                    pila.Meter(new NombreAuto(patente, marca, modelo));
                    break;

                case 2:
                    System.out.println("Ingrese una patente: ");
                    String patente1 = sc.nextLine();
                    NombreAuto eliminar = pila.eliminarAuto(patente1);
                    if (eliminar != null) {
                        System.out.println("Auto eliminado: " + eliminar);
                    }
                    else{
                        System.out.println("No se encontro el auto con esa patente");
                    }
                    break;
                
                case 3:
                    pila.Mostrar();
                    break;

                case 0:
                    System.out.println("Saliendo del menu.....");
                    break;
                default:
                    break;
            }

        }while(opcion != 0);
        sc.close();
    }
}
