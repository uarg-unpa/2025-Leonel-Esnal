import java.util.Scanner;

public class TestPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Ingrese un caracter");
            System.out.println("0. Salir del menu");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un caracter");
                    String entrada = sc.nextLine();
                    Palindromo pila = new Palindromo(entrada);
                    if (pila.esPalindromo()) {
                        System.out.println("La cadena es un palindromo " + entrada);
                    }else{
                        System.out.println("No es palindromo " + entrada);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del menu....");
                    break;
            
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        }while(opcion != 0);
        sc.close();
    }
}
