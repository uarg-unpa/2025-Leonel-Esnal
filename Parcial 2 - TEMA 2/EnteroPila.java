//Tema 2 punto 1
public class EnteroPila {
   private int [] elemento;
   private int cima;
   private final int max = 5;
   
   public EnteroPila(){
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

    public boolean masElementosPares(EnteroPila p2){

        EnteroPila aux1 = new EnteroPila();
        EnteroPila aux2 = new EnteroPila();
        int par1 = 0;
        int par2 = 0;

        while (!this.estaVacia()) {
            int valor1 = this.sacar();
            if (valor1 % 2 == 0) {
                par1++;
                aux1.meter(valor1);
            }
        }

        while (!p2.estaVacia()) {
            int valor2 = p2.sacar();
            if (valor2 % 2 == 0) {
                par2++;
                aux2.meter(valor2);
            }
        }

        while (!aux1.estaVacia()) {
            this.meter(aux1.sacar());
        }

        while (!aux2.estaVacia()) {
            p2.meter(aux2.sacar());
        }
        return par1 > par2;
    }
}
