import java.util.Scanner;

public class TestElementosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaPares pila = new PilaPares();
        ColaPares cola = new ColaPares();
        int opcion;

        do{
            System.out.println("=== menu ===");
            System.out.println("1. Colocar elementos en la pila");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Pasar los elementos pares a la cola");
            System.out.println("4. Mostrar cola");
            System.out.println("0. Salir del menu");
            System.out.println("Elejir una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero positivo");
                    int num = sc.nextInt();
                    if (num > 0) {
                        pila.Meter(num);
                    }
                    else{
                        System.out.println("Error: los numeros ingresados no son positivos");
                    }
                    break;

                case 2:
                    pila.Mostrar();
                    break;

                case 3:
                    if (pila.estaVacio()) {
                        System.out.println("La pila esta vacia");
                    }
                    else{
                        while (!pila.estaVacio()) {
                        int elem = pila.Sacar();
                        if (elem % 2 == 0) {
                            cola.insertar(elem);
                        }
                      }
                      System.out.println("Se pasaron los elementos de la pila a la cola");
                    }
                    break;

                case 4:
                    cola.Mostar();
                    break;

                case 0:
                    System.out.println("Salir del menu....");
                    break;


                default:
                    System.out.println("Coloque una opcion valida");
                    break;
            }

        }while(opcion != 0);
        sc.close();
    }
}
