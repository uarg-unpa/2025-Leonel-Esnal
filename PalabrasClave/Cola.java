public class Cola{
    private final int max = 10;
    private int frente, ultimo;
    private String [] elemento;

    public Cola(){
        frente = 0;
        ultimo = 0;
        elemento = new String[max];
    }

    public boolean estaVacia(){
        return (ultimo == 0);
    }

    public boolean estaLleno(){
        return (ultimo == max);
    }

    public void insertar(String Llamada){
        elemento [ultimo] = Llamada;
        ultimo++;    
    }

    public String borrar(){
        String aux = elemento [frente];
        for(int i = 0; i < ultimo - 1; i++ ){
            elemento[i] = elemento [i + 1];
        }
        ultimo--;
        return aux;
    }

    public Cola filtrarLlamadas(String palabraClave){
        Cola NuevaCola = new Cola();
        Cola aux = new Cola();

        while (!estaVacia()) {
            String palabra = borrar();

            if (palabra.contains(palabraClave)) {
                NuevaCola.insertar(palabra);
            }
            aux.insertar(palabra);
        
        }
        while (!aux.estaVacia()) {
            insertar(aux.borrar());
        }

        return NuevaCola;
    }
}