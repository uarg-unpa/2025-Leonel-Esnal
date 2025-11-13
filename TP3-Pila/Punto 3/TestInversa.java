import java.util.Scanner;

public class TestInversa {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        Inversa pila1 = new Inversa();
        
        System.out.println("Ingrese un palabra: ");
        String pila = p.nextLine();

        for(int i = 0; i < pila.length(); i++){
            pila1.Meter(pila.charAt(i));
        }

        System.out.println("Palabra invertida: ");
        while (!pila1.estaVacia()) {
            System.out.println(pila1.Sacar());
        }

        p.close();
    }
}