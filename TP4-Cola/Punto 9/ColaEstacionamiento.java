public class ColaEstacionamiento {
    private final int max = 10;
    private int frente, ultimo;
    private Auto [] elemento;

    public ColaEstacionamiento(){
        elemento = new Auto[max];
        frente = 0;
        ultimo = 0;
    }

    public boolean estaVacio(){
        return (ultimo == 0);
    }

    public boolean estaLleno(){
        return (ultimo == max);
    }

    public void Insertar(Auto elem){
        elemento[ultimo] = elem;
        ultimo++;
    }

    public Auto Borrar(){
        Auto aux = elemento[frente];
        for(int i = 0; i < ultimo - 1; i++){
            elemento[i] = elemento[i + 1];
        }
        ultimo--;
        return aux;
    }

    public Auto Peek(){
        return elemento[frente];
    }

    public void SalidaDelAuto(String matricula){
        if (estaVacio()) {
            return;
        }
        ColaEstacionamiento aux = new ColaEstacionamiento();

        while (!estaVacio()) {
            Auto actual = Borrar();

            if (actual.getMatricula().equals(matricula)) {
            }
            else{
               aux.Insertar(actual);
            }
        }
        while (!aux.estaVacio()) {
            Insertar(aux.Borrar());
        }

    }

    public void Mostar(){
        if (estaVacio()) {
        }
        for(int i = frente; i < ultimo; i++){
            System.out.println(" " + elemento[i].getMatricula());
        }
    }

}