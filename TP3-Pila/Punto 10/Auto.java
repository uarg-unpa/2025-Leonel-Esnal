public class Auto {
    private AtributosAuto [] vehiculo;
    private int cima;

    public Auto(int capacidad){
        vehiculo = new AtributosAuto [capacidad];
        cima = -1;
    }

    public boolean estaVacia(){
        if (cima == -1) {
            return true;
        }
        return false;
    }

    public boolean estaLleno(){
        if (cima == vehiculo.length - 1) {
            return true;
        }
        return false;
    }

    public void Meter(AtrinbutosAuto valor){
        cima++;
        vehiculo[cima] = valor;
    }

    public AtributosAuto Sacar(){
        AtrinbutosAuto aux;
        aux = vehiculo[cima];
        cima--;
        return aux;
    }

    public void Mostrar(){
        if (estaVacia()) {
        }
        for(int i = cima; i >= 0; i--){
            System.out.println(vehiculo[i]);
        }
    }

    public AtrinbutosAuto eliminarAuto(String patente){
        if (estaVacia()) 
            return null;
        

        Auto aux1 = new Auto(vehiculo.length);
        AtrinbutosAuto encontrado = null;

        while (!estaVacia()) {
            AtrinbutosAuto auto1 = Sacar();
            if (auto1.getPatente().equalsIgnoreCase(patente)) {
                encontrado = auto1;
            }else{
                aux1.Meter(auto1);
            }
        }
        while (!aux1.estaVacia()) {
            Meter(aux1.Sacar());
    }
    return encontrado;
  }
}

