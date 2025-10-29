public class Inversa {
    private char [] palabra;
    private int cima;
    private final int MAX = 10;

    public Inversa(){
        palabra = new char[MAX];
        cima = -1;
    }

    public boolean estaVacia(){
        if (cima == -1 ) {
            return true;
        }
        return false;
    }

    public boolean estaLleno(){
        if (cima == MAX - 1) {
            return true;
        }
        return false;
    }

    public void Meter(char valor){
        cima++;
        palabra[cima] = valor;
    }

    public char Sacar(){
        char aux;
        aux = palabra[cima];
        cima--;
        return aux;
    }

}
