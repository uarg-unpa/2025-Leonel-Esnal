public class Punto3 {

    public static void main(String[] args) {
        int A = 5;
        int B = 9;
        int C = 2;
        int aux = C;
        if (A != B && A != C) {
            B = A;
            C = A;
            A = aux;
        }
        else{
            System.out.println("Las variables B y C tienen el mismo valor inicial a la varible A");
        }
        System.out.println("La variable B tiene el valor:" + B);
        System.out.println("La variable C tiene el valor:" + C);
        System.out.println("La variable A tiene el valor:" + A);
    }
}
