import java.util.Scanner;

public class MainCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Encolar tarea (agregar elemento)");
            System.out.println("2. Desencolar (sacr elemento)");
            System.out.println("3. Ver elemento en frente (peek)");
            System.out.println("0. Salir del menu");
            System.out.println("opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                System.out.println("Ingrese un numero");
                int numero = sc.nextInt();
                if (cola.estaLleno()) {
                    System.out.println("Error: La cola esta esta llena");
                }
                else{
                    cola.insertar(numero);
                    System.out.println("Numero " + numero + " se encolo exitosamente");
                }
                    break;
                
                case 2:
                if (cola.estaVacio()) {
                    System.out.println("Error: la cola esta vacia");
                }
                else{
                    int desencolada = cola.borrar();
                    System.out.println("tarea desencolada: " + desencolada);
                }
                    break;

                case 3:
                if (cola.estaVacio()) {
                    System.out.println("Error: la cola esta vacia. No hay un numero el frente de la cola");
                }
                else{
                    int frente = cola.Peek();
                    System.out.println("Tarea en frente: " + frente);
                }
                    break;

                case 0:
                    System.out.println("Saliendo del menu.....");
                    break;

                default:
                System.out.println("Error: coloque una opcion valida");
                    break;
            }

        }while(opcion != 0);
        sc.close();
    }
}
