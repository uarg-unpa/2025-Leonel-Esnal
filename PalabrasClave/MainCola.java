public class MainCola {
    public static void main(String[] args) {
        Cola cola1 = new Cola();

        cola1.insertar("Llamada personal");
        cola1.insertar("Llamada de un cliente");
        cola1.insertar("Llamada del banco");
        cola1.insertar("Llamada al personal");
        cola1.insertar("Llamada del jefe");

        System.out.println("Cola original: ");
        Cola axu1 = new Cola();
        while (!cola1.estaVacia()) {
            String palabra = cola1.borrar();
            System.out.println(palabra);
            axu1.insertar(palabra);
        }

        // restaurar cola1
        while (!axu1.estaVacia()) {
            cola1.insertar(axu1.borrar());
        } 
        
        Cola cola2 = cola1.filtrarLlamadas("del");

        System.out.println("Cola filtrada: ");
        Cola aux2 = new Cola();
        while (!cola2.estaVacia()) {
            String palabra2 = cola2.borrar();
            System.out.println(palabra2);
            aux2.insertar(palabra2);
        }

        // restaurar cola2
        while (!aux2.estaVacia()) {
            cola2.insertar(aux2.borrar());
        }

    }
}
