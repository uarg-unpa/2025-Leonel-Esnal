import java.util.Scanner;

public class TestCopiaPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CopiaPila pila = new CopiaPila();
        CopiaPila copia = null;
        int opcion;
        
        

        do{
        System.out.println("=== Menu ===");
        System.out.println("1. Meter elemento");
        System.out.println("2. Sacar elemento");
        System.out.println("3. Mostrar pila");
        System.out.println("4. Copia exacta");
        System.out.println("5. Mostrar Copia exacta");
        System.out.println("0. Salir");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese un elemento");
                int elem = sc.nextInt();
                pila.Meter(elem);
                System.out.println("El elemento " + elem + " se ha agrego");
                break;
            
            case 2:
                if (pila.estaVacia()) {
                    System.out.println("La pila esta vacia");
                }else{
                    int elem2 = pila.Sacar();
                    System.out.println("Se a sacado el elemento: " + elem2);
                }
                break;
            
            case 3:
                pila.MostrarPila();
                break;

            case 4:
            copia = pila.CopiarPila();
            System.out.println("Pila copiada");
                break;

            case 5:
            if (copia != null) {
                copia.MostrarPila();
            }
                break;

            case 0:
                System.out.println("Saliendo del menu....");
                break;

            default:
                    System.out.println("La opcion no es valida");
                break;
            }
        }while (opcion != 0);
         sc.close();   
    }
}
