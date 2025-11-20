import java.util.Scanner;

public class TestDeportista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque un nombre al primer deportista");
        String nombre1 = sc.nextLine();

        System.out.println("Coloque la edad del primer deportista");
        int edad1 = sc.nextInt();

        sc.nextLine();

        System.out.println("Coloque el deporte que realiza el primer deportista");
        String deporte1 = sc.nextLine();

        System.out.println("Coloque la cantidad de puntos que tiene el primer deportista");
        int puntos1 = sc.nextInt();

        sc.nextLine();

        Deportista deportista1 = new Deportista(nombre1, edad1, deporte1, puntos1);

        System.out.println("Coloque un nombre al segundo deportista");
        String nombre2 = sc.nextLine();

        System.out.println("Coloque la edad del segundo deportista");
        int edad2 = sc.nextInt();

        sc.nextLine();

        System.out.println("Coloque el deporte que realiza el segundo deportista");
        String deporte2 = sc.nextLine();

        System.out.println("Coloque la cantidad de puntos que tiene el degundo deportista");
        int puntos2 = sc.nextInt();

        sc.nextLine();

        Deportista deportista2 = new Deportista(nombre2, edad2, deporte2, puntos2);

        System.out.println(deportista1);
        System.out.println(deportista2);

        System.out.println("¿Es mas experimentado? " + deportista1.esMasExperimentado(deportista2));

        System.out.println("¿Es mayor de edad? " + deportista1.esMayor());
        sc.close();

    }
}
