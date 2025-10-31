public class PilaPares {
    private int [] elemento;
    private int cima;
    private final int max = 10;

    public PilaPares(){
        elemento = new int[max];
        cima = -1;
    }

    public boolean estaVacio(){
        return (cima == - 1);
    }

    public boolean estaLleno(){
        return (cima == max - 1);
    }

    public void Meter(int valor){
        if (!estaLleno()) {
        cima++;
        elemento [cima] = valor;          
        }
    }

    public int Sacar(){
        int aux;
        aux = elemento[cima];
        cima--;
        return aux;
    }

    public void Mostrar(){
    if (estaVacio()) {
    }
    else{
        for(int i = cima; i >= 0; i--){
            System.out.println(elemento [i] + " ");
            }
        }
    }
}
