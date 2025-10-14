import java.util.Scanner;
public class TestElector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("coloque el nombre del primer elector");
        String nombre1 = sc.nextLine();

        System.out.println("Coloque el apellido del primer elector");
        String apellido1 = sc.nextLine();

        System.out.println("Coloque la matricula del primer elector");
        int matricula1 = sc.nextInt();

        System.out.println("Coloque la clase del primer elector");
        int clase1 = sc.nextInt();

        System.out.println("Coloque el domicilio del primer elector");
        String domicilio1 = sc.nextLine();

        sc.nextLine();

        Elector elector1 = new Elector(nombre1, apellido1, matricula1, clase1, domicilio1);


        System.out.println("coloque el nombre del segundo elector");
        String nombre2 = sc.nextLine();

        System.out.println("Coloque el apellido del segundo elector");
        String apellido2 = sc.nextLine();

        System.out.println("Coloque la matricula del segundo elector");
        int matricula2 = sc.nextInt();

        System.out.println("Coloque la clase del segundo elector");
        int clase2 = sc.nextInt();

        System.out.println("Coloque el domicilio del segundo elector");
        String domicilio2 = sc.nextLine();

        sc.nextLine();

        Elector elector2 = new Elector(nombre2, apellido2, matricula2, clase2, domicilio2);


        System.out.println("coloque el nombre del tercer elector");
        String nombre3 = sc.nextLine();

        System.out.println("Coloque el apellido del tercer elector");
        String apellido3 = sc.nextLine();

        System.out.println("Coloque la matricula del tercer elector");
        int matricula3 = sc.nextInt();

        System.out.println("Coloque la clase del tercer elector");
        int clase3 = sc.nextInt();

        System.out.println("Coloque el domicilio del tercer elector");
        String domicilio3 = sc.nextLine();

        sc.nextLine();

        Elector elector3 = new Elector(nombre3, apellido3, matricula3, clase3, domicilio3);


        System.out.println("coloque el nombre del cuarto elector");
        String nombre4 = sc.nextLine();

        System.out.println("Coloque el apellido del cuarto elector");
        String apellido4 = sc.nextLine();

        System.out.println("Coloque la matricula del cuarto elector");
        int matricula4 = sc.nextInt();

        System.out.println("Coloque la clase del cuarto elector");
        int clase4 = sc.nextInt();

        System.out.println("Coloque el domicilio del cuarto elector");
        String domicilio4 = sc.nextLine();

        sc.nextLine();

        Elector elector4 = new Elector(nombre4, apellido4, matricula4, clase4, domicilio4);


        System.out.println("coloque el nombre del quinto elector");
        String nombre5 = sc.nextLine();

        System.out.println("Coloque el apellido del quinto elector");
        String apellido5 = sc.nextLine();

        System.out.println("Coloque la matricula del quinto elector");
        int matricula5 = sc.nextInt();

        System.out.println("Coloque la clase del quinto elector");
        int clase5 = sc.nextInt();

        System.out.println("Coloque el domicilio del quinto elector");
        String domicilio5 = sc.nextLine();

        sc.nextLine();

        Elector elector5 = new Elector(nombre5, apellido5, matricula5, clase5, domicilio5);

        System.out.println(elector1);
        System.out.println(elector2);
        System.out.println(elector3);
        System.out.println(elector4);
        System.out.println(elector5);
        System.out.println("----------------------------------------------------");

        // Cambios
        elector1.setApellido("Esteban");
        elector2.setDomicilio("Calle San Martin");
        elector3.setMatricula(23232434);
        elector4.setNombre("Juan");
        elector5.setClase(48594);
        System.out.println("----------------------------------------------------");

        System.out.println(elector1);
        System.out.println(elector2);
        System.out.println(elector3);
        System.out.println(elector4);
        System.out.println(elector5);


        sc.close();
    }
}
