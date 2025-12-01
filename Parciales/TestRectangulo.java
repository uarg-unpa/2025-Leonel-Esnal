import java.util.Scanner;

public class TestRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la base del primer rectangulo");
        double base1 = sc.nextDouble();

        System.out.println("Ingrese la altura del primer rectangulo");
        double altura1 = sc.nextDouble();

        sc.nextLine();

        Rectangulo R1 = new Rectangulo(base1, altura1);

        System.out.println("Ingrese la base del segundo rectangulo");
        double base2 = sc.nextDouble();

        System.out.println("Ingrese la altura de la segundo rectangulo");
        double altura2 = sc.nextDouble();

        sc.nextLine();

        Rectangulo R2 = new Rectangulo(base2, altura2);

        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Mostrar el area del R1");
            System.out.println("2. Mostrar el perimetro de R2");
            System.out.println("3. Mostrar cual rectagulo tiene mayor area");
            System.out.println("0. Salir del menu");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El area del R1 es: " + R1.CalcularArea());
                    break;
            
                case 2:
                    System.out.println("El perimetro " + R2.CalcularPerimetro());
                    break;

                case 3:
                    if (R1.esMayorArea(R2)) {
                        System.out.println("R1 tiene mayor area que R2");
                    }
                    else if (R2.esMayorArea(R1)) {
                        System.out.println("R2 tiene mayor area que R1");
                    }
                    else{
                        System.out.println("Tienen la misma area");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del menu...");
                    break;

                default:
                System.out.println("Elije una opcion valida");
                    break;
            }
        }while(opcion != 0);

        sc.close();
    }
}
