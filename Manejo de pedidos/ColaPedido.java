public class ColaPedido {
    private final int max = 10;
    private int frente, ultimo;
    private Pedido [] elemento;

    public ColaPedido(){
        frente = 0;
        ultimo = 0;
        elemento = new Pedido[max];
    }

    public boolean estaVacia(){
        return ultimo == 0;
    }

    public boolean estaLleno(){
        return (ultimo == max);
    }

    public void insertar(Pedido valor){
        elemento [ultimo] = valor;
        ultimo++;    
    }

    public Pedido borrar(){
        Pedido aux = elemento [frente];
        for(int i = 0; i < ultimo - 1; i++ ){
            elemento[i] = elemento [i + 1];
        }
        ultimo--;
        return aux;
    }

    public ColaPedido pedidosMayoresA(double minimo){
        ColaPedido cola2 = new ColaPedido();
        ColaPedido aux1 = new ColaPedido();

        while (!estaVacia()) {
            Pedido valor = borrar();
            aux1.insertar(valor);
            if (valor.getMonto() > minimo) {
                cola2.insertar(valor);
            }
        }

        while (!aux1.estaVacia()) {
            insertar(aux1.borrar());
        }
        return cola2;
    }
}

