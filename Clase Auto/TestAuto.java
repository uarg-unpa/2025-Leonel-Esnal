import java.util.Scanner;

public class TestAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la marca del primer auto");
        String marca1 = sc.nextLine();

        System.out.println("Ingrese el modelo del primer auto");
        String modelo1 = sc.nextLine();

        System.out.println("Ingrese el año del primer auto");
        int año1 = sc.nextInt();

        System.out.println("Ingrese la velocidad maxima del primer auto");
        int velocidadMax1 = sc.nextInt();

        sc.nextLine();

        Auto auto1 = new Auto(marca1, modelo1, año1, velocidadMax1);


        System.out.println("Ingrese la marca del segundo auto");
        String marca2 = sc.nextLine();

        System.out.println("Ingrese el modelo del segundo auto");
        String modelo2 = sc.nextLine();

        System.out.println("Ingrese el año del segundo auto");
        int año2 = sc.nextInt();

        System.out.println("Ingrese la velocidad maxima del segundo auto");
        int velocidadMax2 = sc.nextInt();

        sc.nextLine();

        Auto auto2 = new Auto(marca2, modelo2, año2, velocidadMax2);


        System.out.println("Ingrese la marca del tercer auto");
        String marca3 = sc.nextLine();

        System.out.println("Ingrese el modelo del tercer auto");
        String modelo3 = sc.nextLine();

        System.out.println("Ingrese el año del tercer auto");
        int año3 = sc.nextInt();

        System.out.println("Ingrese la velocidad maxima del tercer auto");
        int velocidadMax3 = sc.nextInt();

        sc.nextLine();

        Auto auto3 = new Auto(marca3, modelo3, año3, velocidadMax3);

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);

        if (auto1.esMasRapidoQue(auto2) && auto1.esMasRapidoQue(auto3)) {
            System.out.println(auto1.getModelo() + " es mas rapido que: " + auto2.getModelo() + " y " + auto3.getModelo());
        }
        else if (auto2.esMasRapidoQue(auto1) && auto2.esMasRapidoQue(auto3)) {
            System.out.println(auto2.getModelo() + " es mas rapido que: " + auto1.getModelo() + " y " + auto3.getModelo());
        }
        else if (auto3.esMasRapidoQue(auto1) && auto3.esMasRapidoQue(auto2)) {
            System.out.println(auto3.getModelo() + " es mas rapido que: " + auto1.getModelo() + " y " + auto2.getModelo());
        }
        else{
            System.out.println("Tienen la misma velocidad");
        }

        System.out.println("¿Es un auto clasico? " + auto1.esAutoClasico());
        System.out.println("¿Es un auto clasico? " + auto2.esAutoClasico());
        System.out.println("¿Es un auto clasico? " + auto3.esAutoClasico());

        sc.close();
    }
}
