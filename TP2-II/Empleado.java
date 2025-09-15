public class Empleado {
    private int numeroDeLegajo;
    private double sueldoBase;
    private double pagoPorHoraExtra;
    private int horaExtrasRealizadas;
    private boolean casado;
    private int hijo;

    public Empleado(int numeroDeLegajo, double sueldoBase, double pagoPorHoraExtra, int horaExtrasRealizadas, boolean casado, int hijo){
        this.numeroDeLegajo = numeroDeLegajo;
        this.sueldoBase = sueldoBase;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
        this.horaExtrasRealizadas = horaExtrasRealizadas;
        this.casado = casado;
        this.hijo = hijo;
    }

    //Metodos set

    public void setNumeroDeLegajo(int numeroDeLegajo){
        this.numeroDeLegajo = numeroDeLegajo;
    }

    public void setSueldoBase(double sueldoBase){
        this.sueldoBase = sueldoBase;
    }

    public void setPagoPorHoraExtra(double pagoPorHoraExtra){
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    public void setHoraExtraRealizadas(int horaExtrasRealizadas){
        this.horaExtrasRealizadas = horaExtrasRealizadas;
    }

    public void setCasado(boolean casado){
        this.casado = casado;
    }

    public void setHijo(int hijo){
        this.hijo = hijo;
    }

    //Metodo get

    public int getNumeroDeLegajo(){
        return this.numeroDeLegajo;
    }

    public double getSueldoBase(){
        return this.sueldoBase;
    }

    public double getPagoPorHoraExtra(){
        return this.pagoPorHoraExtra;
    }

    public int getHoraExtraRealizadas(){
        return this.horaExtrasRealizadas;
    }

    public boolean getCasado(){
        return this.casado;
    }

    public int getHijo(){
        return this.hijo;
    }

    //Metodos

    public double CalculoDeComplemento(){
        return pagoPorHoraExtra * horaExtrasRealizadas;
    }

    public double CalculoDeSueldo(){
        return sueldoBase + CalculoDeComplemento();
    }

    public double CalculoRetenciones(){
        double rentencion = 0.0;
        if (casado) {
            rentencion = rentencion + 10.0;
        }
        rentencion = rentencion + (hijo * 1.0);

        return (sueldoBase * rentencion) / 100.0;
    }
}
