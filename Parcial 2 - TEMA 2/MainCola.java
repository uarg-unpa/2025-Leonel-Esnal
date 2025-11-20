//Tema 2 Punto 2
public class MainCola {
    public static void main(String[] args) {
        ColaCaracteres Q1 = new ColaCaracteres();
        CaracterPila p1 = new CaracterPila();
        CaracterPila p2 = new CaracterPila();

            p1.meter('a');
            p1.meter('c');
            p1.meter('e');
            p1.meter('g');

            p2.meter('b');
            p2.meter('d');
            p2.meter('f');
            p2.meter('h');
            
            CaracterPila aux1 = new CaracterPila();
            CaracterPila aux2 = new CaracterPila();

            while (!p1.estaVacia()) {
                aux1.meter(p1.sacar());
            }

            while (!p2.estaVacia()) {
                aux2.meter(p2.sacar());
            }

            while (!aux1.estaVacia() && !aux2.estaVacia()) {
                char letra1 = aux1.sacar();
                char letra2 = aux2.sacar();

                Q1.insertar(letra1);
                Q1.insertar(letra2);
                
            }

            while (!aux1.estaVacia()) {
                p1.meter(aux1.sacar());
            }

            while (!aux2.estaVacia()) {
                p2.meter(aux2.sacar());
            }

            
            System.out.println("Cola intercalada: ");
            while (!Q1.estaVacia()) {
                System.out.println(Q1.borrar());
            }
    }
}
