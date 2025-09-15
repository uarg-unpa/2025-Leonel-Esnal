public class TestArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Galletas Pepas", 2000, 121213133, 20);
        System.out.println(articulo1);
        articulo1.DescrementarStock(13);
        articulo1.IncrementarStock(3);
        System.out.println(articulo1);
        
        Articulo articulo2 = new Articulo("Coca Cola", 3000, 324224232, 100);
        articulo2.DescrementarStock(35);
        System.out.println(articulo2);
        articulo2.IncrementarStock(15);
        System.out.println(articulo2);

        Articulo articulo3 = new Articulo("Papas Lays", 2500, 242434353, 35);
        articulo3.DescrementarStock(8);
        System.out.println(articulo3);
        articulo3.IncrementarStock(50);
        System.out.println(articulo3);
    }
}
