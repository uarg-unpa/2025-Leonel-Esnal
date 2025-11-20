public class TestTeatro {
    public static void main(String[] args) {
        
    Teatro teatro1 = new Teatro("Colon", "Av. Colon", 413);
    Obra obra1 = new  Obra("Cats", 20000, teatro1);
    System.out.println(obra1);

    Teatro teatro2 = new Teatro("General San Martin", "Av. Corrientes", 1530);
    Obra obra2 = new Obra("El Cascanueces", 30000 , teatro2);
    System.out.println(obra2);

    Teatro teatro3 = new Teatro("Gran Rex", "Av.Corrientes", 857);
    Obra obra3 = new Obra("Onegin", 40000, teatro3);
    System.out.println(obra3);
   }
}
