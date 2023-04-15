
package petshop;


public class TestePetShop {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Markléber", "Gato");
        
        PetShop petshop1 = new PetShop("Mundo Animal");
        
        petshop1.darBanho(pet1, 50.5);
        petshop1.darBanho(pet1, 20.0, 10);
        petshop1.darBanho(pet1, 10.0, 2);
        
        petshop1.darBanho(pet1, -2.0);
        
        
        
        System.out.println(petshop1);
        
        System.out.println(pet1);
        
    }
}
