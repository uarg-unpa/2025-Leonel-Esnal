public class Hora {
    private int hora;
   private int minutos;
   private int segundos;

    public Hora(int hora, int minutos, int segundos){
        if (horaValida(hora,minutos,segundos)) {
            
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        }

        else{
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public void setHora(int h){
        if (h >= 0 && h < 24) {
            this.hora = h;
        }
        else{
            this.hora = 0;
        }
    }

    public int getHora(){
        return this.hora;
    }

    public void setMinutos(int m){
        if (m >= 0 && m < 60) {
            this.minutos = m;
        }
        else{
            this.minutos = 0;
        }
    }

    public int getMinutos(){
        return this.minutos;
    }

    public void setSegundos(int s){
        if (s >= 0 && s < 60) {
         this.segundos = s;
        }
    }

    public int getSegundos(){
        return this.segundos;
    }

    // Metodos
    private boolean horaValida(int hora, int minutos, int segundos) {
        return (hora >= 0 && hora < 24) &&
               (minutos >= 0 && minutos < 60) &&
               (segundos >= 0 && segundos < 60);
    }

    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }

    public int HoraporMinutos(){
        return (hora * 60) + minutos;
    }
}
