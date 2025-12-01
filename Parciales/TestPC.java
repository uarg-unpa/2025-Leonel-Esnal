import java.util.Scanner;

public class TestPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la marca de la primera pc");
        String marca1 = sc.nextLine();

        System.out.println("Ingrese el procesador de la primera pc");
        String procesador1 = sc.nextLine();

        System.out.println("Ingrese el precio de la primera pc");
        double precio1 = sc.nextDouble();

        System.out.println("Ingrese la cantidad de ram de la primera pc");
        int ram1 = sc.nextInt();

        sc.nextLine();

        PC v1 = new PC(marca1, procesador1, precio1, ram1);

        System.out.println("Ingrese la marca de la segunda pc");
        String marca2 = sc.nextLine();

        System.out.println("Ingrese el procesador de la primera pc");
        String procesador2 = sc.nextLine();

        System.out.println("Ingrese el precio de la primera pc");
        double precio2 = sc.nextDouble();

        System.out.println("Ingrese la cantidad de ram de la primera pc");
        int ram2 = sc.nextInt();

        sc.nextLine();

        PC v2 = new PC(marca2, procesador2, precio2, ram2); 

        System.out.println("Se desconto: ");
        double descuento = sc.nextDouble();
        v1.AplicarDescuento(descuento);

        v2.setPrecio(v2.getPrecio() + 5000);

        System.out.println("Mostrar la informacion de la primera " + v1);
        v1.Mostrarinformacion();

        System.out.println("Mostrar la informacion de la segunda " + v2);

        System.out.println("Comparacion de ram de las PCs " + v1.MayorRam(v2));

        sc.close();
    }
}
