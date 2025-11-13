import java.util.Scanner;

public class TestRepetidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Repetidos cola = new Repetidos();
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Borrar elemento");
            System.out.println("3. Ver elemento de frente");
            System.out.println("4. Mostar cola");
            System.out.println("5. Eliminar repetidos");
            System.out.println("0. Salir del menu");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingese un elemento");
                    int num = sc.nextInt();
                    if (cola.estaLleno()) {
                        System.out.println("Error la cola esta llena");
                    }
                    else{
                        cola.insertar(num);
                        System.out.println("Se inserto el numero " + num);
                    }
                    break;

                case 2:
                    if (cola.estaVacio()) {
                        System.out.println("Error la cola esta vacia");
                    }
                    else{
                        int desencolar = cola.borrar();
                        System.out.println("El elemento se a borrado " + desencolar);
                    }
                    break;

                case 3:
                    if (cola.estaVacio()) {
                        System.out.println("Error no hay elementos al frente de la cola");
                    }
                    else{
                        int frente = cola.Peek();
                        System.out.println("El elemento que esta al frente de la cola es: " + frente);
                    }
                    break;

                case 4:
                    cola.Mostar();
                    break;

                case 5:
                    if (cola.estaVacio()) {
                        System.out.println("Error la pila no tiene elementos");
                    }
                    else{
                        for(int i = cola.frente; i < cola.ultimo; i++){
                            for(int j = i; j < cola.ultimo; j++){
                                if (cola.elemento[i] == cola.elemento[j]) {
                                    for(int k = j; k < cola.ultimo - 1; k++){
                                    }
                                    cola.ultimo--;
                                    j--;
                                }
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Salir del menu....");
                    break;

                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }

        }while(opcion != 0);
        sc.close();
    }
}
