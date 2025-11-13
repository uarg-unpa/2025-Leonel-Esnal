public class MismoTipo {
    private final int max = 10;
    private int frente, ultimo;
    private int [] elemento;

    public MismoTipo(){
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

    public void insertar(int numero){
        if (!estaVacio()) {
        elemento [ultimo] = numero;
        ultimo++;    
        }
    }

    public int borrar(){
        int aux = elemento [frente];
        for(int i = 0; i < ultimo - 1; i++ ){
            elemento[i] = elemento [i + 1];
        }
        ultimo--;
        return aux;
    }

    public int Peek(){
        return elemento[frente];
    }

    public void Mostar(){
        if (estaVacio()) {
        }
        for(int i = frente; i < ultimo; i++){
            System.out.println(elemento[i] + " ");
        }
    }

    public boolean sonIguales(MismoTipo otro){
        if (this.ultimo != otro.ultimo) {
            return false;
        }

        boolean iguales = true;
        MismoTipo aux1 = new MismoTipo();
        MismoTipo aux2 = new MismoTipo();

        while (!this.estaVacio() && !otro.estaVacio()) {
            int elem = this.borrar();
            int elem2 = otro.borrar();

            if (elem != elem2) {
                iguales = false;
            }

            aux1.insertar(elem);
            aux2.insertar(elem2);
        }

        while (!aux1.estaVacio()) {
            this.insertar(aux1.borrar());
            otro.insertar(aux2.borrar());
        }
        return iguales;
    }
}
