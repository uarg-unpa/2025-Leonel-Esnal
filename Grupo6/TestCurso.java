public class TestCurso {
    public static void main(String[] args) {

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
        System.out.println(curso2);

    }
}
