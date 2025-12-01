public class Arreglo {
    private int [] numero;
    private int indice;

    public Arreglo(int tamaño){
        numero = new int[tamaño];
        indice = 0;
    }

    public void IngresarNumero(int num){
        if (indice < numero.length) {
            numero[indice] = num;
            indice++;
        }
        else{
            System.out.println("El arreglo esta lleno.");
        }
    }

    public void MostrarNum(){
        for(int i = 0; i < indice; i++){
            System.out.println(numero[i] + " ");
        }
    }

    public void VaciarArrglo(){
        indice = 0;
        System.out.println("El arreglo se vacio.");
    }
}
