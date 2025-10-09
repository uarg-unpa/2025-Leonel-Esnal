public class Punto6 {
     public static void main(String[] args) {
        Dia fecha1;
        Dia fecha2;

        fecha1 = new Dia(10, 4, 2015);
        fecha2 = new Dia(20, 6, 2000);
        System.err.println(fecha1.MostrarFecha());
        System.out.println(fecha2.MostrarFecha());

        fecha1.setDia(1);
        fecha1.setMes(9);
        fecha1.setAño(2012);

        System.out.println("La fecha a cambiado " + fecha1.MostrarFecha());
        System.out.println(fecha1.Mostrar());

        //Punto 7
        if (fecha1.esMayor(fecha1.getAño(), fecha2.getAño()) == true){
            System.out.println(fecha1.getAño() + " es mayor");
        }
        else{
            System.out.println( fecha2.getAño() + " es mayor");
        }
        
    }
}
