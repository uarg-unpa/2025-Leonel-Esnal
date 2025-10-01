import java.util.Scanner;
public class TestCurso {
    public static <Curso> void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.println("Coloque un nombre al curso");
        String nombre = c.nextLine();

        System.out.println("Coloque la duracion");
        double duracion = c.nextDouble();

        System.out.println("Coloque un nombre al profesor");
        String nombreDeprofesor = c.nextLine();

        System.out.println("Coloque la cantidad de experiencia que tiene el profesor");
        int exp = c.nextInt();

        Profesor profesor1 = new Profesor(nombreDeprofesor, exp);

        Curso curso3 = new Curso(nombre, duracion, profesor1);

        System.out.println(curso3);

        c.close();
    }
}
