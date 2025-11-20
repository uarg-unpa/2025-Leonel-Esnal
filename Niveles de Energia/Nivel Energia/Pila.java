/*Implementen una pila de enteros que almacene niveles de energía y un método que cuente cuántas veces aparece un valor X, sin modificar la pila

El programa debe permitir:
1️⃣ Agregar nuevos niveles a la pila.
2️⃣ Mostrar el nivel que se encuentra en la cima de la pila.
3️⃣ Pedir al usuario un valor X y contar cuántas veces aparece en la pila. */

public class Pila{
    private int [] elemento;
    private int cima;
    private final int max = 10;


    public Pila(){
        elemento = new int[max];
        cima = -1;
    }

    public boolean estaVacia(){
        return (cima == -1);
    }

    public boolean estaLlena(){
        return (cima == max - 1);
    }

    public void meter(int elem){
        cima++;
        elemento [cima] = elem;
    }

    public int sacar(){
        int aux;
        aux = elemento[cima];
        cima--;
        return aux;
    }

    public int cimaPila(){
        if (!estaVacia()) {
            return elemento[cima];
        }
        else{
            return -1;
        }
    }

    public int ContadorX(int valor){
        Pila aux = new Pila();
        int contador = 0;
        while (!estaVacia()) {
            int valor2 = sacar();
            
            if (valor == valor2) {
                contador++;
            }
            aux.meter(valor2);
        }
        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }
        return contador;
    }
}