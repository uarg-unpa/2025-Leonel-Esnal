public class PilaAcciones{
    private String [] caracter;
    private int cima;
    private final int Max = 10;

    public PilaAcciones(){
        caracter = new String[Max];
        cima = -1;
    }

    public boolean estaVacia(){
        return cima == - 1;
    }

    public boolean estaLleno(){
        return (cima == Max - 1); 

    }

    public void Meter(String palabra){
        cima++;
        caracter[cima] = palabra;
    }

    public String Sacar(){
        String aux;
        aux = caracter[cima];
        cima--;
        return aux;
    }  

    public int contarAcciones(String accion){
        PilaAcciones aux1 = new PilaAcciones();
        int contador = 0;

        while (!estaVacia()) {
            String letra = Sacar();
            if (letra.equals(accion)) {
                contador++;
            }
            aux1.Meter(letra);
        }

        while (!aux1.estaVacia()) {
            Meter(aux1.Sacar());
        }
        return contador;
    }
}