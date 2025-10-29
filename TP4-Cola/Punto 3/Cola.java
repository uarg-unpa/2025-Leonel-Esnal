/*Escriba la clase Cola cuya declaración de atributos y métodos correspondan a la implementación 
Frente Fijo y Final Movible (tener en cuenta que al borrar debe correr todos los elementos). */

public class Cola{
    private int maxcola = 5;
    private int frente, ultimo;
    private int [] elementos;

    public Cola(){
        frente = 0;
        ultimo = 0;
        elementos = new int[maxcola];
    }

    public boolean estaVacio(){
        return (ultimo == 0);
    }

    public boolean estaLleno(){
        return (ultimo == maxcola);
    }

    public void insertar(int numero){
        elementos[ultimo] = numero;
        ultimo++;
    }

    public int borrar(){
        int aux = elementos[frente];
        for(int i = 0; i < ultimo; i++){
            elementos[i] = elementos[i + 1];
        }
        ultimo--;
        return aux;
    }

    public int Peek(){
        return elementos[frente];
    }
}