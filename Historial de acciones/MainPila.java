import java.util.Scanner;

public class MainPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaAcciones pila = new PilaAcciones();

        pila.Meter("casa");
        pila.Meter("mate");
        pila.Meter("casa");
        pila.Meter("Torta");
        pila.Meter("perro");

        System.out.println("Coloque la accion: ");
        String accion = sc.nextLine();

        int cantidad = pila.contarAcciones(accion);

        System.out.println("La accion " + accion + " se repite " + cantidad + " veces.");
        sc.close();
    }
}
