import java.util.Scanner;

public class TestAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expresion = "";
        int opcion;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Meter una expresion");
            System.out.println("2. Validar una expresion");
            System.out.println("0. salir del menu");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese una expresion");
                    expresion = sc.nextLine();
                    break;

                case 2:
                    if (expresion.isEmpty()) {
                        System.out.println("Primero debe ingresar una expresion");
                    }else{
                        if (Aritmetica.Verificacion(expresion)) {
                            System.out.println("las expresiones entan bien colocadas");
                        }else{
                            System.out.println("Las expresiones no estan bien colocadas");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del menu....");
                    break;
                default:
                    break;
            }


        }while(opcion != 0);
        sc.close();
    }

}
