public class Palindromo {
    private String texto;
    private String [] caracter;
    private int cima;
    private final int Max = 10;

    public Palindromo(String texto){
        caracter = new String[Max];
        cima = -1;
        this.texto = texto;
    }

    public boolean estaVacia(){
        if (cima == -1) {
            return true;
        }
        return false;
    }

    public boolean estaLleno(){
        if (cima == Max - 1) {
            return true;
        }
        return false;
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

    public boolean esPalindromo(){
        String carar = texto.toLowerCase();
        int inicio = 0;
        int fin = carar.length() - 1;
        while (inicio < fin) {

            while (inicio < fin && carar.charAt(inicio) == ' ') {
                inicio++;
            }

            while (inicio < fin && carar.charAt(fin) == ' ') {
                fin--;
            }

        if (carar.charAt(inicio) != carar.charAt(fin)) {
            return false;
        }
        inicio++;
        fin--;
      }
      return true;
    }
}
