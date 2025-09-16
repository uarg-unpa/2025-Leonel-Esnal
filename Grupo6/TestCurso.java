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


        /*       
        Profesor profesor1 = new Profesor("Juan", 10 );
        Curso curso1 = new Curso("Tercero A", 5.0, profesor1);
        System.out.print(curso1);
        System.out.println(profesor1.esExperto());
        curso1.CaalcularHorasSemana(5);
        System.out.println(curso1);

        Profesor profesor2 = new Profesor("Jose", 3);
        Curso curso2 = new Curso("Segundo B", 30.0, profesor2);
        System.out.println(curso2);
        System.out.println(profesor1.esExperto());
        curso2.CaalcularHorasSemana(3);
        System.out.println(curso2); */
        c.close();
    }
}
