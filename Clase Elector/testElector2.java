public class testElector2 {
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

        sc.nextLine();

        System.out.println("Coloque el nombre de la calle");
        String calle1 = sc.nextLine();

        System.out.println("Coloque el numero de su calle");
        int numero1 = sc.nextInt();

        sc.nextLine();


        Domicilio domicilio1 = new Domicilio(calle1, numero1);
        Elector elector1 = new Elector(nombre1, apellido1, matricula1, clase1, domicilio1);

        System.out.println("coloque el nombre del segundo elector");
        String nombre2 = sc.nextLine();

        System.out.println("Coloque el apellido del segundo elector");
        String apellido2 = sc.nextLine();

        System.out.println("Coloque la matricula del segundo elector");
        int matricula2 = sc.nextInt();

        System.out.println("Coloque la clase del segundo elector");
        int clase2 = sc.nextInt();

        sc.nextLine();

        System.out.println("Coloque el nombre de la calle del segundo elector");
        String calle2 = sc.nextLine();

        System.out.println("Coloque el numero de su calle del segundo elector");
        int numero2 = sc.nextInt();

        sc.nextLine();

        Domicilio domicilio2 = new Domicilio(calle2, numero2);
        Elector elector2 = new Elector(nombre2, apellido2, matricula2, clase2, domicilio2);


        System.out.println("coloque el nombre del tercer elector");
        String nombre3 = sc.nextLine();

        System.out.println("Coloque el apellido del tercer elector");
        String apellido3 = sc.nextLine();

        System.out.println("Coloque la matricula del tercer elector");
        int matricula3 = sc.nextInt();

        System.out.println("Coloque la clase del tercer elector");
        int clase3 = sc.nextInt();

        sc.nextLine();

        System.out.println("Coloque el nombre de la calle");
        String calle3 = sc.nextLine();

        System.out.println("Coloque el numero de su calle");
        int numero3 = sc.nextInt();

        sc.nextLine();

        Domicilio domicilio3 = new Domicilio(calle3, numero3);
        Elector elector3 = new Elector(nombre3, apellido3, matricula3, clase3, domicilio3);


        System.out.println("coloque el nombre del cuarto elector");
        String nombre4 = sc.nextLine();

        System.out.println("Coloque el apellido del cuarto elector");
        String apellido4 = sc.nextLine();

        System.out.println("Coloque la matricula del cuarto elector");
        int matricula4 = sc.nextInt();

        System.out.println("Coloque la clase del cuarto elector");
        int clase4 = sc.nextInt();

        sc.nextLine();

        System.out.println("Coloque el nombre de la calle");
        String calle4 = sc.nextLine();

        System.out.println("Coloque el numero de su calle");
        int numero4 = sc.nextInt();

        sc.nextLine();

        Domicilio domicilio4 = new Domicilio(calle4, numero4);
        Elector elector4 = new Elector(nombre4, apellido4, matricula4, clase4, domicilio4);


        System.out.println("coloque el nombre del cuarto elector");
        String nombre5 = sc.nextLine();

        System.out.println("Coloque el apellido del cuarto elector");
        String apellido5 = sc.nextLine();

        System.out.println("Coloque la matricula del cuarto elector");
        int matricula5 = sc.nextInt();

        System.out.println("Coloque la clase del cuarto elector");
        int clase5 = sc.nextInt();

        sc.nextLine();

        System.out.println("Coloque el nombre de la calle");
        String calle5 = sc.nextLine();

        System.out.println("Coloque el numero de su calle");
        int numero5 = sc.nextInt();

        sc.nextLine();

        Domicilio domicilio5 = new Domicilio(calle5, numero5);
        Elector elector5 = new Elector(nombre5, apellido5, matricula5, clase5, domicilio5);

        System.out.println(elector1);
        System.out.println(elector2);
        System.out.println(elector3);
        System.out.println(elector4);
        System.out.println(elector5);

        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Cambiar de nombre");
            System.out.println("2. Cambiar de apellido");
            System.out.println("3. Cambiar matricula");
            System.out.println("4. Cambiar clase");
            System.out.println("5. Cambiar domicilio");
            System.out.println("6. Mostrar los electores");
            System.out.println("0. Salir del menu");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Cambiar nombre");
                    String nuevoNombre = sc.nextLine();
                    elector1.setNombre(nuevoNombre);
                    break;

                case 2:
                    System.out.println("Cambiar Apellido");
                    String nuevoApellido = sc.nextLine();
                    elector2.setApellido(nuevoApellido);
                    break;

                case 3:
                    System.out.println("Cambiar Matricula");
                    int nuevaMatricula = sc.nextInt();
                    elector3.setMatricula(nuevaMatricula);
                    break;

                case 4:
                    System.out.println("Cambiar Clase");
                    int nuevaClase = sc.nextInt();
                    elector4.setClase(nuevaClase);
                    break;

                case 5:
                    System.out.println("Cambiar calle");
                    String nuevaCalle = sc.nextLine();
                    System.out.println("Cambiar numero");
                    int nuevoNumero = sc.nextInt();
                    sc.nextLine();
                    elector5.setDomicilio(new Domicilio(nuevaCalle, nuevoNumero));

                    break;

                case 6:
                    System.out.println("Mostrar cambios");
                    System.out.println(elector1);
                    System.out.println(elector2);
                    System.out.println(elector3);
                    System.out.println(elector4);
                    System.out.println(elector5);
                    break;

                case 0:
                    System.out.println("Saliendo del menu.....");
                    break;

                default:
                    System.out.println("Coloque una opcion valida");
                    break;
            }

        }while(opcion != 0);

        sc.close();
    }
}
