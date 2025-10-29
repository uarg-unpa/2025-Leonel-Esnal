public class Auto {
    private NombreAuto [] vehiculo;
    private int cima;

    public Auto(int capacidad){
        vehiculo = new NombreAuto [capacidad];
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

    public void Meter(NombreAuto valor){
        cima++;
        vehiculo[cima] = valor;
    }

    public NombreAuto Sacar(){
        NombreAuto aux;
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

    public NombreAuto eliminarAuto(String patente){
        if (estaVacia()) 
            return null;
        

        Auto aux1 = new Auto(vehiculo.length);
        NombreAuto encontrado = null;

        while (!estaVacia()) {
            NombreAuto auto1 = Sacar();
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

