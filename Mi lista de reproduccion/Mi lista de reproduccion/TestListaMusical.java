import java.util.Scanner;

public class TestListaMusical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDeReproduccion cola = new ListaDeReproduccion();
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Ingrese una cancion");
            System.out.println("2. Reproducir una cancion");
            System.out.println("3. Saltar cancion");
            System.out.println("0. Salir del menu");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println("Error la cola esta llena");
                    }
                    else{
                        System.out.println("Ingrese un interprete");
                        String interprete = sc.nextLine();
                        System.out.println("Ingrese el genero");
                        String genero = sc.nextLine();
                        System.out.println("Ingrese año de lanzamiento");
                        int año = sc.nextInt();
                        sc.nextLine();
                        Musica lista = new Musica(interprete, genero, año);
                        cola.insertar(lista);
                    }
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("Error la cola esta vacia");
                    }
                    else{
                        Musica reproducir = cola.borrar();
                        System.out.println("Se esta reproducioendo el cancion " + reproducir);
                    }
                    break;

                case 3:
                    if (!cola.estaVacia()) {
                        Musica saltar = cola.borrar();
                        System.out.println("Se salto la cancion " + saltar);
                    }
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
