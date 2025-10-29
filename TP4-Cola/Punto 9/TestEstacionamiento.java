import java.util.Scanner;

public class TestEstacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaEstacionamiento estacionamiento = new ColaEstacionamiento();
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Llegada del auto");
            System.out.println("2. Salida del auto");
            System.out.println("3. Mostrar");
            System.out.println("0. Saliendo");
            System.out.println("Elija una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un auto por su matricula");
                    if (estacionamiento.estaLleno()) {
                        System.out.println("La cola esta llena");
                    }
                    else{
                        String auto = sc.nextLine();
                        estacionamiento.Insertar(new Auto(auto));
                    }
                    break;

                case 2:
                    System.out.println("Ingrese la patricula del auto que tiene que salir");
                    String auto2 = sc.nextLine();
                    if (estacionamiento.estaVacio()) {
                        System.out.println("La cola enta vacia");
                    }
                    else{
                        estacionamiento.SalidaDelAuto(auto2);
                        System.out.println("El auto a salido del estacionamiento " + auto2);

                    }
                    break;

                case 3:
                    estacionamiento.Mostar();
                    break;

                case 0:
                    System.out.println("Saliendo del menu......");
                    break;

                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }

        }while(opcion != 0);
        sc.close();
    }
}
