public class NombresCola {
    private final int max = 10;
    private int frente, ultimo;
    private String [] estudiantes;

    public NombresCola(){
        frente = 0;
        ultimo = -1;
        estudiantes = new String [max];
    }

    public boolean estaVacio(){
        return (ultimo == 0);
    }

    public boolean estaLleno(){
        return (ultimo == max);
    }

    public void insertar(String nombre){
        ultimo = (ultimo + 1) % max;
        estudiantes[ultimo] = nombre;

    }

    public String borrar(){
         String eliminado = estudiantes [frente];

        if (frente == ultimo) {
            frente = -1;
            ultimo = -1;
        } else {
            frente = (frente + 1) % max;
        }
        return eliminado;
    }

    public String Peek(){
        if (estaVacio()) {
        }
        return estudiantes[frente];
    }
}
