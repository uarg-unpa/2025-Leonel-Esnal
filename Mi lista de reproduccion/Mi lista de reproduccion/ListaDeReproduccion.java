public class ListaDeReproduccion {
    private final int max = 2;
    private int frente, ultimo;
    private Musica [] elemento;

    public ListaDeReproduccion(){
        elemento = new Musica[max];
        frente = 0;
        ultimo = 0;
    }

	    public boolean estaVacia(){
        return (ultimo == 0);
    }

    public boolean estaLlena(){
        return (ultimo == max);
    }

    public void insertar(Musica elem){
        elemento[ultimo] = elem;
        ultimo++;
    }

    public Musica borrar(){
        Musica aux = elemento[frente];
        for(int i = 0; i < ultimo - 1; i++){
            elemento[i] = elemento[i + 1];
        }
        ultimo--;
        return aux;
    }
}
