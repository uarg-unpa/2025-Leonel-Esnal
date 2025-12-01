public class PruebasColas {
    public static void main(String[] args) {
        ColaInt cola = new ColaInt();

        cola.insertar(10);
        cola.insertar(20);
        cola.insertar(15);
        cola.insertar(30);
        cola.insertar(20);
        cola.insertar(40);
        cola.insertar(20);

        System.out.println("¿Contiene 25? " + cola.Contiene(25));

        int eliminados = cola.EliminarTodos(20);
        System.out.println("Cuantas veces se elimina el 20 " + eliminados + " veces.");

        System.out.println("Cola resultante: ");
        ColaInt aux = new ColaInt();
        while (!cola.estaVacio()) {
            int valor = cola.borrar();
            System.out.println(valor + " ");
            aux.insertar(valor);
        }

        while (!aux.estaVacio()) {
            cola.insertar(aux.borrar());
        }

        ColaInt invertida = cola.Invertida();

        System.out.println("Cola invertida: ");
        ColaInt aux2 = new ColaInt();
        while (!invertida.estaVacio()) {
            int valor2 = invertida.borrar();
            System.out.println(valor2 + " ");
            aux2.insertar(valor2);
        }
        while (!aux2.estaVacio()) {
            invertida.insertar(aux2.borrar());
        }
    }
}
