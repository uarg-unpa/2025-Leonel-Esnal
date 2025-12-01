public class LetraCola {
     private final int max = 10;
    private int frente, ultimo;
    private char [] elemento;

    public LetraCola(){
        frente = 0;
        ultimo = 0;
        elemento = new char[max];
    }

    public boolean estaVacio(){
        return (ultimo == 0);
    }

    public boolean estaLleno(){
        return (ultimo == max);
    }

    public void insertar(char letra){
        elemento [ultimo] = letra;
        ultimo++;
    }

    public char borrar(){
        char aux = elemento [frente];
        for(int i = 0; i < ultimo; i++){
            elemento[i] = elemento[i + 1];
        }
        ultimo--;
        return aux;
    }

    public int Peek(){
        if (estaVacio()) {
        }
        return elemento[frente];
    }
}
