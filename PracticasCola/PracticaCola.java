
public class PracticaCola {
private final int maxcola=5;
 private int frente, ultimo;
 private int []elementos;

 public PracticaCola(){
 frente=0;
 ultimo=0;
 elementos=new int[maxcola];
 }

 public boolean estaVacia(){
    return ultimo == 0;
 }

 public boolean estaLlena(){
    return ultimo == maxcola;
 }

 public void insertar(int numero){
    elementos[ultimo] = numero;
 }

 public int borrar(){
    int aux = elementos[frente];
    for(int i = 0; i < ultimo -1; i++){
        elementos[i] = elementos(i + 1);
    }
    ultimo--;
    return aux;
  }

  public int Peek(){
    return elementos[frente];
  }
}
