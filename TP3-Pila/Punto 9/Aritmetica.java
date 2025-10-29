public class Aritmetica {
    private char [] exprecion;
    private int cima;
    private int Max;

    public Aritmetica(int Max){
        exprecion = new char[Max];
        cima = -1;
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

    public void Meter(char valor){
        cima++;
        exprecion [cima] = valor;
    }

    public char Sacar(){
        char aux;
        aux = exprecion[cima];
        cima--;
        return aux;
    }

    public static boolean Verificacion(String exprecion){
        Aritmetica pila = new Aritmetica(exprecion.length());

        for(int i = 0; i < exprecion.length(); i++){
            char c = exprecion.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                pila.Meter(c);
            }else if (c == ')' || c == '}' || c == ']') {
                if (pila.estaVacia()) {
                    return false;

                }
                char espresion1 = pila.Sacar();
                if ((c == ')' && espresion1 != '(') || (c == '}' && espresion1 != '{') || (c == ']' && espresion1 != '[')) {
                    return false;
                }
            }
        }
        return pila.estaVacia();
    }
}