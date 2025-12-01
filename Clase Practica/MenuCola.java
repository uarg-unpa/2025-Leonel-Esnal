import java.util.Scanner;

public class MenuCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Encolar caracter");
            System.out.println("2. borrar caracter");
            System.out.println("3. Ver el caracter del frente");
            System.out.println("4. Mostrar elementos");
            System.out.println("0. Salir del sistema");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un elemento");
                    String letra1 = sc.nextLine();
                    if (cola.estaLleno()) {
                        System.out.println("Error la cola esta llena");
                    }
                    else{
                        cola.insertar(letra1);
                        System.out.println("Se ingreso un elemento " + letra1);
                    }
                    break;

                case 2:
                    if (cola.estaVacio()) {
                        System.out.println("Error la cola esta vacia");
                    }
                    else{
                        String desencolada = cola.borrar();
                        System.out.println("Se ha desencolado " + desencolada);
                    }
                    break;

                case 3:
                    if (cola.estaVacio()) {
                        System.out.println("Error no hay un caracter en el frente de la cola");
                    }
                    else{
                        String frente = cola.Peek();
                        System.out.println("Caracter del frente " + frente);
                    }
                    break;
                
                case 4: 
                    cola.MostrarElementos();
                    break;
                
                case 0:
                    System.out.println("Saliendo del menu......");
                    break;

                default:
                    System.out.println("Error coloque una opcion valido");
                    break;
            }
        }while(opcion != 0);
        sc.close();

    }
}
