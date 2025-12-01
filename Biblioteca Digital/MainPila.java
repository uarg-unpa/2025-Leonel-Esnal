public class MainPila {
    public static void main(String[] args) {
        PilaLibro pila = new PilaLibro();

        pila.meter(new Libro("Harry potter", "Rowling", 100));
        pila.meter(new Libro("Crimenes Imperceptibles", "Guillermo", 300));
        pila.meter(new Libro("El principito", "Antoine", 1000));

        System.out.println("Pila original: ");
        PilaLibro aux1 = new PilaLibro();
        while (!pila.estaVacia()) {
            Libro libro1 = pila.sacar();
            System.out.println(libro1);
            aux1.meter(libro1);
        }

        while (!aux1.estaVacia()) {
            
            pila.meter(aux1.sacar());
        }

        PilaLibro pila2 = pila.filtrarPorAutor("Guillermo");

        System.out.println("Pila filtrada: ");
        PilaLibro aux2 = new PilaLibro();
        while (!pila2.estaVacia()) {
            Libro libro2 = pila2.sacar();
            System.out.println(libro2);
            aux2.meter(libro2);
        }

        while (!aux2.estaVacia()) {
            pila2.meter(aux2.sacar());
        }
    }
}
