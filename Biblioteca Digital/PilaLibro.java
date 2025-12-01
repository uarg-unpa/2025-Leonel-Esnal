public class PilaLibro {
   private Libro [] elemento;
   private int cima;
   private final int max = 10;
   
   public PilaLibro(){
    elemento = new Libro[max];
    cima = -1;
   }

    public boolean estaVacia(){
        return (cima == -1);
    }

    public boolean estaLlena(){
        return (cima == max - 1);
    }

    public void meter(Libro elem){
        cima++;
        elemento [cima] = elem;
    }

    public Libro sacar(){
        Libro aux;
        aux = elemento[cima];
        cima--;
        return aux;
    }

    public PilaLibro filtrarPorAutor(String autorBuscado){
        PilaLibro pila = new PilaLibro();
        PilaLibro aux = new PilaLibro();


        while (!estaVacia()) {
            Libro libro = sacar();
            if (libro.getAutor().contains(autorBuscado)) {
                aux.meter(libro);
            }
        }

        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }
        return pila;
    }
}
