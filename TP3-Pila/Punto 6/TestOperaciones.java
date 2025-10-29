import java.util.Scanner;

public class TestOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones elementos = new Operaciones();
        int opcion;
        int X  = -1;

        do{
        System.out.println("=== Menu ===");
        System.out.println("1. Meter");
        System.out.println("2. Sacar");
        System.out.println("3. Mostrar pila");
        System.out.println("4. a) Asignar a X el segundo elemento.");
        System.out.println("5. b) Asignar a X el segundo elemento de la pila, sin modificarla.");
        System.out.println("6. c) Desde un entero positivo N, asignar a X el N-ésimo elemento.");
        System.out.println("7. d) Dado un entero positivo N, asignar a X el N-ésimo elemento de pila, sin modificarla");
        System.out.println("8. e) Asignar a X el elemento fondo de la pila, dejando la pila vacía.");
        System.out.println("9. f) Asignar a X el elemento fondo de la pila, sin modificarla.");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                   System.out.println("Ingrese un elemento: ");
                   int numero = sc.nextInt();
                   elementos.Meter(numero);
                   System.out.println("el numero " + numero + " se ha ingreso");
                break;

            case 2:
                   if (elementos.estaVacia()) {
                    System.out.println("ERROR LA PILA ESTA VACIA");
                   } else{
                         int elem = elementos.Sacar();
                         System.out.println("Elemento sacado: " + elem);
                   }
                break;

            case 3:
                   elementos.Mostrar();
                break;

            case 4:
                   if (! elementos.estaVacia()) {
                    int aux1 = elementos.Sacar();
                    if (! elementos.estaVacia()) {
                        X = elementos.Sacar();
                        System.out.println("El segundo de la cima es: " + X);
                    }else{
                        elementos.Meter(aux1);
                        System.out.println("No se encuentran dos elemnetos en la pila.");
                    }
                   }
                break;

            case 5:
                   if (!elementos.estaVacia()) {
                      int aux1 = elementos.Sacar();
                      if (!elementos.estaVacia()) {
                          X = elementos.Sacar();
                          System.out.println("El segundo de la cima es: " + X);
                          elementos.Meter(X);
                      }
                      elementos.Meter(aux1);
                   }
                break;

            case 6:
                System.out.println("Ingrese N: ");
                int N = sc.nextInt();
                for(int i = 1; i <= N && !elementos.estaVacia(); i++){
                    X = elementos.Sacar();
                }
                System.out.println("El elemento N-esimo desde la cima era: " + X);
                break;

            case 7:
                   System.out.println("Ingrese N: ");
                   N = sc.nextInt();
                   for(int i = 1; i <= N && !elementos.estaVacia(); i++){
                       int aux2 = elementos.Sacar();
                       elementos.Meter(aux2);
                       if (i == N) {
                          X = aux2;
                       }
                   }
                   System.out.println("El elemento N-esimo desde la cima (sin modificar) es: " + X);
                break;

            case 8:
                  while (!elementos.estaVacia()) {
                    X = elementos.Sacar();
                  }
                  System.out.println("El elemento del fondo era: " + X);
                break;

            case 9:
            Operaciones aux = new Operaciones();
            while (!elementos.estaVacia()) {
                int aux2 = elementos.Sacar();
                aux.Meter(aux2);
                X = aux2;
            }
            while (!aux.estaVacia()) {
                elementos.Meter(aux.Sacar());
            }
            System.out.println("el elemento del fondo (sin modificar) es: " + X);
                break;

            case 0:
                System.out.println("Saliendo del menu.....");
                break;
        
            default:
                    System.out.println("La opcion en incorrecta");
                break;
            }

        }while(opcion != 0);
        sc.close();
    }
}