import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in);
        System.out.println("Coloque la inicial del dia de la semana");
        char dia = letra.next().charAt(0);

        switch (dia) {
            case 'L', 'l':
                System.out.println("Hoy no tengo Programcion");
                break;

            case 'M', 'm':
                System.out.println("Hoy tengo Programacion");
                break;

            case 'I', 'i':
                System.out.println("Hoy tengo Programacion");
                break;

            case 'J', 'j':
                System.out.println("Hoy tengo Programacion");
                break;

            case 'V', 'v':
                System.out.println("Hoy no tengo Programcion");
                break;

            case 'S', 's':
                System.out.println("Hoy no tengo Programcion");
                break;

            case 'D', 'd':
                System.out.println("Hoy no tengo Programcion");
                break;
        
            default: System.out.println("No existe ese dia");
                break;
        }
        letra.close();
    }
}
