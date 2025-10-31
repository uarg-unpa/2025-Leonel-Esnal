public class PilaPalindromo {
    private char [] caracter;
    private int cima;
    private final int maxPila = 10;

    public PilaPalindromo(){
        caracter = new char [maxPila];
        cima = -1;
    }

    public boolean estaVacio(){
        return (cima == -1);
    }

    public boolean estaLleno(){
        return (cima == maxPila - 1);
    }

    public void Meter(char valor){
        cima++;
        caracter[cima] = valor;
    }

    public char Sacar(){
        char aux;
        aux = caracter[cima];
        cima--;
        return aux;
    }
}
