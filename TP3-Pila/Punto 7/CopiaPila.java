public class CopiaPila {
    private int [] elemento;
    private int cima;
    private final int Max = 10;

    public CopiaPila(){
        elemento = new int[Max];
        cima = -1;
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
        cima++;
        elemento[cima] = valor;
    }

    public int Sacar(){
        int aux;
        aux = elemento[cima];
        cima--;
        return aux;
    }

    public CopiaPila CopiarPila(){
        CopiaPila aux = new CopiaPila();
        CopiaPila copia = new CopiaPila();

        while (!this.estaVacia()) {
            aux.Meter(this.Sacar());
        }

        while (!aux.estaVacia()) {
            int aux2 = aux.Sacar();
            this.Meter(aux2);
            copia.Meter(aux2);
        }
        return copia;
    }
    public void MostrarPila(){
        if (estaVacia()) {
        }else{
            for(int i = 0; i <= cima; i++ ){
                System.out.println(elemento[i] + " ");
            }
        }
    }
}
