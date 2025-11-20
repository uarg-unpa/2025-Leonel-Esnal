import java.util.Scanner;

public class TestElementoCima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementoCima elem = new ElementoCima();
        int opcion;

        do{
        System.out.println("=== Menu ===");
        System.out.println("1. Meter elemento");
        System.out.println("2. Sacar elemento");
        System.out.println("3. Verificar estado (vacia/llena)");
        System.out.println("4. VER ELEMENTO DE LA CIMA");
        System.out.println("0. Salir");
        System.out.println("Opcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1: // Meter elemento
                    if (elem.estaLleno()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = sc.nextInt();
                        elem.Meter(num);
                        System.out.println("Elemento " + num + " agregado.");
                    }
                    break;

            case 2: // Sacar elemento
                    if (elem.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int elemento = elem.Sacar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;

            case 3: // Verificar estado
                    System.out.println("¿Vacía? " + elem.estaVacia() + " | ¿Llena? " + elem.estaLleno());
                    break;

            case 4:
                   int cima = elem.elementoCima();
                   if (cima !=-1) {
                      System.out.println("Elemento cima " + cima);
                   }
                   break;

            case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

            default:
                    System.out.println("Opción inválida.");
                }
        }while(opcion != 0);

        sc.close();
    }
}
