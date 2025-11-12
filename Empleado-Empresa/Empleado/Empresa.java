package Empleado;
public class Empresa {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Rodrigo", 200032, 300000.99);
        Empleado empleado2 = new Empleado("Carlos", 64972, 200000.75);
        Empleado empleado3 = new Empleado("luis", 232424, 500000.56);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

        System.out.println("¿Tiene un mayor sueldo? " + empleado1.ganaMasQue(empleado3));
        System.out.println("¿Tiene un mayor sueldo? " + empleado3.ganaMasQue(empleado2));
        System.out.println("¿Tiene un mayor sueldo? " + empleado2.ganaMasQue(empleado1));
        
        if (empleado1.ganaMasQue(empleado3)) {
            System.out.println(empleado1.getNombre() + " gana mas que " + empleado3.getNombre());
        }
        else if (empleado3.ganaMasQue(empleado1)) {
            System.out.println(empleado3.getNombre() + " gana mas que " + empleado1.getNombre());
        }
        else{
            System.out.println("Ganan lo mismo");
        }
    }
}

