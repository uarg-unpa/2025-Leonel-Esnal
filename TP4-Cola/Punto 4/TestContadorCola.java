import java.util.Scanner;

public class TestContadorCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContadorCola cola = new ContadorCola();
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Encolar elemento");
            System.out.println("2. borrar elemento");
            System.out.println("3. Ver elemento del frente");
            System.out.println("4. Contar elementos");
            System.out.println("0. Salir del sistema");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero");
                    int num = sc.nextInt();
                    if (cola.estaLleno()) {
                        System.out.println("Error la cola esta llena");
                    }
                    else{
                        cola.insertar(num);
                        System.out.println("Se ingreso el numero " + num);
                    }
                    break;

                case 2:
                    if (cola.estaVacio()) {
                        System.out.println("Error la cola esta vacia");
                    }
                    else{
                        int desencolada = cola.borrar();
                        System.out.println("Se ha desencolado " + desencolada);
                    }
                    break;

                case 3:
                    if (cola.estaVacio()) {
                        System.out.println("Error no hay un elemento en el frente de la cola");
                    }
                    else{
                        int frente = cola.Peek();
                        System.out.println("Elemento de frente " + frente);
                    }
                    break;

                case 4:
                    if (cola.estaVacio()) {
                        System.out.println("Error no hay elemnetos en la cola");
                    }
                    else{
                        int contador = cola.Contador();
                        System.out.println("la cantidad de elementos " + contador);
                    }
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
