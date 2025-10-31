/*Agregar un método en la clase Cola que elimine los elementos repetidos de la cola. */
public class Repetidos {
    private final int max = 10;
    private int frente, ultimo;
    private int [] elemento;

    public Repetidos(){
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
        elemento [ultimo] = numero;
        ultimo++;
    }

    public int borrar(){
        int aux = elemento[frente];
        for(int i = 0; i < ultimo; i++){
            elemento[i] = elemento [i + 1];
        }
        ultimo--;
        return aux;
    }

    public int Peek(){
        return elemento [frente];
    }

    public void Mostar(){
        if (estaVacio()) {
        }
        for(int i = frente; i < ultimo; i++){
            System.out.println(elemento[i] + " ");
        }
    }
}
