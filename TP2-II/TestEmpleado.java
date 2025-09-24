public class TestEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1311, 300000, 12000, 7, true, 3);

        System.out.println("Complemento por horas extras " + empleado1.CalculoDeComplemento());
        System.out.println("Devolucion de sueldo bruto " + empleado1.CalculoDeSueldo());
        System.out.println("Calculo de rentenciones " + empleado1.CalculoRetenciones());

        Empleado empleado2 = new Empleado(2001, 304000, 11000, 3, false, 0);

        System.out.println("Complemento por horas extras " + empleado2.CalculoDeComplemento());
        System.out.println("Devolucion de sueldo bruto " + empleado2.CalculoDeSueldo());
        System.out.println("Calculo de rentenciones " + empleado2.CalculoRetenciones());

    }
}
