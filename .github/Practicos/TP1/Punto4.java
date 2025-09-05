import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int num1 = 0, num2 = 0, num3 = 0;
            System.out.println("Ingrese 3 numeros enteros");

            num1 = input.nextInt();
            num2 = input.nextInt();
            num3 = input.nextInt();

            if (num1 > num2 && num1 > num3) {
                System.out.println("El numero mayor es:" + num1);
            }
            else{
                if (num2 > num1 && num2 > num3 ) {
                    System.out.println("El numero mayor es:" + num2);
                }
                else{
                    System.out.println("El numero mayor es  :" + num3);
            }
        }
    }
}
