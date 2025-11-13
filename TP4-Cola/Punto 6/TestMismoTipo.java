import java.util.Scanner;

public class TestMismoTipo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MismoTipo cola1 = new MismoTipo();
        MismoTipo cola2 = new MismoTipo();
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Encolar elemento en cola1");
            System.out.println("2. Encolar elemento en cola2");
            System.out.println("3. Borrar elemento en cola1");
            System.out.println("4. Borrar elemento en cola2");
            System.out.println("5. Ver elemento de frente en cola1");
            System.out.println("6. ver elemento de frente en cola2");
            System.out.println("7. Mostrar cola1");
            System.out.println("8. Mostrar cola2");
            System.out.println("9. Son iguales");
            System.out.println("Elegir opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un elemento");
                    int elem = sc.nextInt();
                    if (cola1.estaLleno()) {
                        System.out.println("Error la cola esta llena");
                    }
                    else{
                        cola1.insertar(elem);
                        System.out.println("Se a encolado " + elem);
                    }
                    break;
                
                case 2:
                    System.out.println("Ingrese un elemento");
                    int elem2 = sc.nextInt();
                    if (cola2.estaLleno()) {
                        System.out.println("Error la cola esta llena");
                    }
                    else{
                        cola2.insertar(elem2);
                        System.out.println("Se a encolado " + elem2);
                    }
                    break;

                case 3:
                    if (cola1.estaLleno()) {
                        System.out.println("Error la cola esta vacia");
                    }
                    else{
                        int desencolar = cola1.borrar();
                        System.out.println("El elemento se a desencolado " + desencolar);
                    }
                    break;

                case 4:
                    if (cola2.estaLleno()) {
                        System.out.println("Error la cola esta vacia");
                    }
                    else{
                        int desencolar2 = cola2.borrar();
                        System.out.println("El elemento se a desencolado " + desencolar2);
                    }
                    break;

                case 5:
                    if (cola1.estaVacio()) {
                        System.out.println("Error la cola esta vacia");
                    }
                    else{
                        int frente1 = cola1.Peek();
                        System.out.println("El elemento que esta en frente: " + frente1);
                    }
                    break;

                case 6:
                    if (cola2.estaVacio()) {
                        System.out.println("Error la cola esta vacia");
                    }
                    else{
                        int frente2 = cola2.Peek();
                        System.out.println("El elemento que esta en frente: " + frente2);
                    }
                    break;

                case 7:
                    cola1.Mostar();
                    break;

                case 8:
                    cola2.Mostar();
                    break;

                case 9:
                    boolean iguales = cola1.sonIguales(cola2);
                    System.out.println("¿Son iguales? " + iguales);
                    break;

                case 0:
                    System.out.println("Saliendo del menu.....");
                    break;

                default:
                    System.out.println("Error elija un opcion valida");
                    break;
            }

        }while(opcion != 0);
        sc.close();
    }
}
