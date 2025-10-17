public class Cola {
    private final int max = 10;
    private int frente, ultimo;
    private String [] elemento;

    public Cola(){
        frente = 0;
        ultimo = 0;
        elemento = new String[max];
    }

    public boolean estaVacio(){
        return (ultimo == 0);
    }

    public boolean estaLleno(){
        return (ultimo == max);
    }

    public void insertar(String letra){
        elemento [ultimo] = letra;
        ultimo++;
    }

    public String borrar(){
        String aux = elemento [frente];
        for(int i = 0; i < ultimo; i++){
            elemento[i] = elemento[i + 1];
        }
        ultimo--;
        return aux;
    }

    public String Peek(){
        if (estaVacio()) {
        }
        return elemento[frente];
    }

    public void MostrarElementos(){
        if (!estaVacio()) {
            for(int i = frente; i < ultimo; i++){
                String elem = elemento[i];
                System.out.println(elem.length());
            }
        }
    }
}
