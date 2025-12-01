public class ColaInt {
        private final int max = 10;
    private int frente, ultimo;
    private int [] elemento;

    public ColaInt(){
        frente = 0;
        ultimo = 0;
        elemento = new int[max];
    }

    public boolean estaVacio(){
        return (ultimo == 0);
    }

    public boolean estaLleno(){
        return (ultimo == max);
    }

    public void insertar(int elem){
        elemento [ultimo] = elem;
        ultimo++;
    }

    public int borrar(){
        int aux = elemento [frente];
        for(int i = 0; i < ultimo; i++){
            elemento [i] = elemento [i + 1];
        }
        ultimo--;
        return aux;
    }

    public int Peek(){
        return elemento [frente];
    }

    public boolean Contiene(int x){
        ColaInt aux = new ColaInt();
        boolean encontrado = false;
        while (!estaVacio()) {
            int valor = borrar();

            if (valor == x) {
                encontrado = true;
            }
            aux.insertar(valor);
        }
        while (!aux.estaVacio()) {
            insertar(aux.borrar());
        }
        return encontrado;
    }

    public int EliminarTodos(int x){
        ColaInt aux2 = new ColaInt();
        int contador = 0;
        while (!estaVacio()) {
            int valor = borrar();

            if (valor == x) {
                contador++;
            }
            else{
                aux2.insertar(valor);
            }
        }

        while (!aux2.estaVacio()) {
            insertar(aux2.borrar());
        }
        return contador;
    }

    public ColaInt Invertida(){
        PilaEnteros pila = new PilaEnteros();   

        while (!estaVacio()) {
            pila.meter(borrar());
        }

        ColaInt invertida = new ColaInt();
        ColaInt aux = new ColaInt();

        while (!pila.estaVacia()) {
            int valor = pila.sacar();
            invertida.insertar(valor);
            aux.insertar(valor);
        }

        while (!aux.estaVacio()) {
            insertar(aux.borrar());
        }
        return invertida;
    }
}
