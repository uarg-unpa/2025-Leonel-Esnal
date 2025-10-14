import java.util.Scanner;

public class TestRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la base del primer rectangulo");
        double base1 = sc.nextDouble();

        System.out.println("Ingrese la altura del prrimer rectangulo");
        double altura1 = sc.nextDouble();

        sc.nextLine();

        Rectangulo R1 = new Rectangulo(base1, altura1);

        System.out.println("Ingrese la base del segundo rectangulo");
        double base2 = sc.nextDouble();

        System.out.println("Ingrese la altura de la segundo rectangulo");
        double altura2 = sc.nextDouble();

        sc.nextLine();

        Rectangulo R2 = new Rectangulo(base2, altura2);

        System.out.println("El area del primer rectagulo es: " + R1.CalcularArea());
        
        System.out.println("El perimetro del segundo rectangulo es: " + R2.CalcularPerimetro());

        System.out.println("El primer rectangulo tiene mayor area que el segundo: " + R1.esMayorArea(R2));

        System.out.println(R1);
        System.out.println(R2);

        sc.close();
    }
}
