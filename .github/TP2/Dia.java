public class Dia {
    private int dia;
    private int mes;
    private int año;

    public Dia(int dia, int mes, int año){
        if (DiavALIDO(dia,mes,año)) {
            
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        }
        else{
            this.dia = 1;
            this.mes = 1;
            this.año = 2013;
        }

    }

    public void setDia(int d){
        this.dia = d;
    }
    public int getDia(){
        return this.dia;
    }

    public void setMes(int m){
        this.mes = m;
    }
    public int getMes(){
        return this.mes;
    }

    public void setAño(int a){
        this.año = a;
    }
    public int getAño(){
        return this.año;
    }

    //Metodos
    private boolean DiavALIDO(int dia, int mes, int año){
        return (dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && (año > 1);
    }

    public String MostrarFecha(){
        return String.format("%02d/%02d/%04d", dia, mes, año);
    }

    /**
     * @return
     */
    public String getNombreMes(){
        String NombreMes;
        switch (mes) {

            case 1:
                NombreMes = "Enero";
                break;

            case 2:
                NombreMes = "Febrero";
                break;
            
            case 3:
                NombreMes = "Marzo";
                break;

            case 4:
                NombreMes = "Abril";
                break;

            case 5:
                NombreMes = "Mayo";
                break;

             case 6:
                NombreMes = "Junio";
                break;

            case 7:
                NombreMes = "Julio";
                break;

            case 8:
                NombreMes = "Agosto";
                break;

            case 9:
                NombreMes = "Septiembre";
                break;

            case 10:
                NombreMes = "Octubre";
                break;

            case 11:
                NombreMes = "Novienbre";
                break;

            case 12:
                NombreMes = "Diciembre";
                break;


            default:
            NombreMes = "No es valido";
                break;
        }
        return NombreMes;
    }
    
    public String Mostrar(){
        return dia + " de " + getNombreMes() + " de " + año;
    }

    //Punto 7

    public boolean esMayor( int fecha1, int fecha2){
        if (fecha1 > fecha2) {
            return true;
        }
        else{
            return false;
        }
    }
}
