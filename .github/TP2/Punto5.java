public class Punto5 {
    public static void main(String[] args) {
        Hora hora1;
        Hora hora2;

        hora1 = new Hora(23, 2, 5);
        hora2 = new Hora(26, 3, 22);
        System.out.println("hora1: " + hora1.mostrarHora());
        System.out.println("hora2: " + hora2.mostrarHora());
        System.out.println("--------------------");
        hora1.setHora(2);
        hora1.setMinutos(20);
        hora1.setSegundos(30);
        System.out.println("La hora a cambio: " + hora1.mostrarHora());
        System.out.println("--------------------");
        System.out.println("Devolver hora en minutos: " + hora1.HoraporMinutos());
        System.out.println("--------------------");

    }
}
