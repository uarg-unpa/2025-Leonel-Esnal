public class Punto4 {
     public static void main(String[] args) {

        Televisor televisor1;

        televisor1 = new Televisor("Sony", "LED", "apagado", 10, 55);
        
        System.out.println(televisor1.getMarca());

        System.out.println(televisor1.getModelo());

        televisor1.subirCanal();
        System.out.println(televisor1.getCanal());

        televisor1.bajasCanal();
        System.out.println(televisor1.getCanal());

        televisor1.subirVolumen();
        System.out.println(televisor1.getVolumen());

        televisor1.bajarVolumen();
        System.out.println(televisor1.getVolumen());

        televisor1.volveralcanal();
        System.out.println("Volver al canal:" + " " + televisor1.getAnterior());

        televisor1.setEstado("encendido");
        System.out.println(televisor1.getEstado());
    }
}
