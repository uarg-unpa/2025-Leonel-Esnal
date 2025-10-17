public class TestPersona {
    public static void main(String[] args) {
        Persona persona1;
        Persona persona2;

        persona1 = new Persona();
        persona1.setNombre("Julian");
        persona1.setEdad(20);
        persona1.setDNI(44567897);
        persona1.setSexo('H');
        persona1.setPeso(80.6);
        persona1.setAltura(1.80);

        System.out.println(persona1);
        System.out.println(persona1.esMayorDeEdad());

        persona2 = new Persona("Martin");
        persona2.setEdad(16);
        persona2.setDNI(23445623);
        persona2.setSexo('o');
        persona2.setPeso(60.0);
        persona2.setAltura(1.60);

        System.out.println(persona2);
        System.out.println(persona2.esMayorDeEdad());


    }
}
