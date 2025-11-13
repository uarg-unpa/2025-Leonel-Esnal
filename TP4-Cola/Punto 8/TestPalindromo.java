import java.util.Scanner;

public class TestPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaPalindromo cola = new ColaPalindromo();
        PilaPalindromo pila = new PilaPalindromo();
        String cadena = "";
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Ingresar cadena");
            System.out.println("2. Verificar si es palindromo");
            System.out.println("0. Salir del menu");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    pila = new PilaPalindromo();
                    cola = new ColaPalindromo();

                    System.out.println("Ingrese una cadena: ");
                    cadena = sc.nextLine();
                    cadena = cadena.toLowerCase();

                    for(int i = 0; i < cadena.length(); i++){
                        char palabra = cadena.charAt(i);
                        if (palabra != ' ') {
                            pila.Meter(palabra);
                            cola.insertar(palabra);
                        }
                    }
                    System.out.println("Se guardo la cadena " + cadena);
                    break;

                case 2:

                    if (cadena.isEmpty()) {
                        System.out.println("Se debe ingresar una cadena");
                    }

                    PilaPalindromo copiaPila = new PilaPalindromo();
                    ColaPalindromo copiaCola = new ColaPalindromo();

                    for(int i = 0; i < cadena.length(); i++){
                        char palabra = cadena.charAt(i);
                        if (palabra != ' ') {
                            copiaCola.insertar(palabra);
                            copiaPila.Meter(palabra);
                        }
                    }

                    boolean esPalindromo = true;

                    while (!copiaPila.estaVacio() && !copiaCola.estaVacio()) {
                        if (copiaPila.Sacar() != copiaCola.borrar()) {
                            esPalindromo = false;
                        }
                    }

                    if (esPalindromo) {
                        System.out.println("La cadena " + cadena + "es un palindromo");
                    }
                    else{
                        System.out.println("La cadena " + cadena + "no es un palindromo");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del menu.....");
                    break;
            
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }
        }while(opcion != 0);
        sc.close();
    }
}
