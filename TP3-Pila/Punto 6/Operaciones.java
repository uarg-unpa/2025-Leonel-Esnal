/* */

public class Operaciones {
    private int [] elem;
    private int cima;
    private final int max = 10;

    public Operaciones(){
        elem = new int [max];
        cima = -1;
    }

    public boolean estaVacia(){
        if (cima == -1) {
            return true;
        }
        return false;
    }

    public void Meter(int valor){
        cima++;
        elem [cima] = valor;
    }

    public int Sacar(){
        int aux;
        aux = elem[cima];
        cima--;
        return aux;
    }

    public void Mostrar(){
        if (estaVacia()) {
        }
        else{
            for(int i = cima; i >= 0; i--){
                System.out.println(elem[i] + " ");
            }
        }
    }
}
