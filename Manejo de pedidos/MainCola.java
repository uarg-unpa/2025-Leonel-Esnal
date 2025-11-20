public class MainCola {
    public static void main(String[] args) {
        ColaPedido cola1 = new ColaPedido();

        cola1.insertar(new Pedido("Jonatan", 10000, "Impresora"));
        cola1.insertar(new Pedido("Maria", 157000, "Moto"));
        cola1.insertar(new Pedido("Camila", 250000, "Auto"));
        cola1.insertar(new Pedido("Daniel", 860000, "Casa"));
        cola1.insertar(new Pedido("Jose", 300000, "Vacaciones"));

        System.out.println("Cola original: ");
        ColaPedido aux1 = new ColaPedido();
        while (!cola1.estaVacia()) {
            Pedido valor1 = cola1.borrar();
            System.out.println(valor1);
            aux1.insertar(valor1);
        }
        while (!aux1.estaVacia()) {
            cola1.insertar(aux1.borrar());
        }


        ColaPedido cola2 = cola1.pedidosMayoresA(11000);

        System.out.println("Cola filtrada: ");
        ColaPedido aux2 = new ColaPedido();
        while (!cola2.estaVacia()) {
            Pedido valor2 = cola2.borrar();
            System.out.println(valor2);
            aux2.insertar(valor2);
        }
        while (!aux2.estaVacia()) {
            cola2.insertar(aux2.borrar());
        }
    }
}
