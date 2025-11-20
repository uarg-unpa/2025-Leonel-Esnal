public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;       
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int[MAX];
        cima = -1;
        // Crear el array
        // Completar: inicializar cima
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        if (cima == -1) {
            return true;
        }
        // Completar: devolver true si cima indica que la pila está vacía
        return false;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        if (cima == MAX - 1) {
            return true;
        }
        else{

            return false;
        
        }
        // Completar: devolver true si cima está en el límite del array
        
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
            cima++;
            elementos[cima] = elem;
              // Completar: incrementar cima y asignar el elemento
        
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
        int aux;
        aux = elementos[cima];
        cima --;
        return aux;
        // Completar: guardar el elemento de la cima, decrementar cima y devolverlo  
    }
    
    public int cantidadDeOcurrencia(int elem){
        PilaEnteros aux = new PilaEnteros();
        int contador = 0;
        while (!estaVacia()) {
            int elemento = sacar();

            if (elem == elemento) {
            contador++;
        }
        aux.meter(elem);
    }
        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }
        return contador;
    }
}