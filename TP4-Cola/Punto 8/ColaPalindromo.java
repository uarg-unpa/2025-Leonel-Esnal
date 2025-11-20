public class ColaPalindromo {
    private final int maxcola = 10;
    private int frente, ultimo;
    private char [] caracter;

    public ColaPalindromo(){
        frente = 0;
        ultimo = 0;
        caracter = new char[maxcola];
    }

    public boolean estaVacio(){
        return (ultimo == 0);
    }

    public boolean estaLleno(){
        return (ultimo == maxcola);
    }

    public void insertar(char letra){
        caracter[ultimo] = letra;
        ultimo++;
    }

    public char borrar(){
        char aux = caracter[frente];
        for(int i = 0; i < ultimo; i++){
            caracter[i] = caracter[i + 1];
        }
        ultimo--;
        return aux;
    }

    public char Peek(){
        return caracter[frente];
    }
}
