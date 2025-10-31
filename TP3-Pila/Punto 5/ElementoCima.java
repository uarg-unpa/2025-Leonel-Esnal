public class ElementoCima {
    private int [] elemento;
    private int cima;
    private final int Max = 3;

    public ElementoCima(){
        elemento = new int[Max];
        cima = - 1;
    }

    public boolean estaVacia(){
        if (cima == -1) {
            return true;
        }
        return false;
    }

    public boolean estaLleno(){
        if (cima == Max - 1) {
            return true;
        }
        return false;
    }

    public void Meter(int valor){
        cima ++;
        elemento[cima] = valor;
    }

    public int Sacar(){
        int aux;
        aux = elemento[cima];
        cima--;
        return aux;
    }

    public int elementoCima(){
        if (!estaVacia()) {
            return elemento[cima];
        }
        else{
            return -1;
        }
    }
}
