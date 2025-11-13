/*En base a la implementación Frente y Final movible, escribir un método contar que devuelva la 
cantidad de elementos en la cola. Nota: no olvidar que, si bien la cola se implementa como un arreglo, 
no debería manejarse como tal. */

public class ContadorCola {
    private final int max = 10;
    private int frente, ultimo;
    private int [] elemento;

    public ContadorCola(){
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
        int aux = elemento [frente];
        for(int i = 0; i < ultimo; i++){
            elemento[i] = elemento[i + 1];
        }
        ultimo--;
        return aux;
    }

    public int Peek(){
        return elemento[frente];
    }

    public int Contador(){
        if(estaVacio()){
            return 0;
        }
        return (frente + ultimo);
    }
}
