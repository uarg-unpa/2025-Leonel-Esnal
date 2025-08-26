import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        System.err.println("Coloque 3 numeros enteros");
        int num1,num2,num3,producto,suma;
        num1 = N.nextInt();
        num2 = N.nextInt();
        num3 = N.nextInt();
        producto = num1 * num2 * num3;
        suma = num1 + num2 + num3;
        System.out.println("El total del producto de todos los numeros es:" + producto);
        System.out.println("La suma total de todos los numeros es:" + suma);
    }
}
