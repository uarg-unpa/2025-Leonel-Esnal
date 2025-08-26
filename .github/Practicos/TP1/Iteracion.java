import java.util.Scanner;

public class Iteracion {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int num, cont, suma, producto;
        cont = 1;
        suma = 0;
        producto = 1;
        System.out.println("Ingrese un numero");
        num = I.nextInt();
        while (cont <= 3) {
            suma = suma + num;
            producto = producto * num;
            cont ++;
        }
        System.out.println("La suma de los numeros es:" + suma);
        System.out.println("El total del producto es:" + producto);
    }
}
