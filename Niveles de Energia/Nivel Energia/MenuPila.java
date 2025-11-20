import java.util.Scanner;

public class MenuPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Ingrese un elemento");
            System.out.println("2. Sacar un elemento");
            System.out.println("3. Contador");
            System.out.println("4. Cima de la pila");
            System.out.println("0. Salir del menu");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (pila.estaLlena()) {
                        System.out.println("Error: la pila esta llena.");
                    }
                    else{
                        System.out.println("Ingrese un elemento: ");
                        int elemento = sc.nextInt();
                        pila.meter(elemento);
                        System.out.println("El elemento " + elemento + " se agrego.");
                    }
                    break;

                case 2:
                    if (pila.estaVacia()) {
                        System.out.println("Error: la pila esta vacia.");
                    }
                    else{
                        int elem = pila.sacar();
                        System.out.println("El elemento se a eliminado: " + elem);
                    }
                    break;

                case 3:
                    System.out.println("¿Que elemento quiere comparar?");
                    int num = sc.nextInt();
                    int contador = pila.ContadorX(num);
                    System.out.println("El elemento " + num + " se repitio " + contador + " veces ");
                    break;

                case 4:
                    System.out.println(pila.cimaPila());
                    break;

                case 0:
                    System.out.println("Saliendo del menu....");
                    break;


                default:
                System.out.println("Elija una opcion valida");
                    break;
            }

        }while(opcion != 0);
        sc.close();
    }
}
