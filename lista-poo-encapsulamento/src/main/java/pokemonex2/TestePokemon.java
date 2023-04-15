
package pokemonex2;


public class TestePokemon {
    public static void main(String[] args) {
        
        TreinadorPokemon ashe = new TreinadorPokemon();
        ashe.setNome("Ashe");
        ashe.setNivel(0);
        
        Pokemon pokemon1 = new Pokemon();
        pokemon1.setNome("Charmander");
        pokemon1.setDoce(10);
        pokemon1.setForca(50.0);
        pokemon1.setTipo("Folha");
        
        
        Pokemon pokemon2 = new Pokemon();
        pokemon2.setNome("Bubasar");
        pokemon2.setDoce(0);
        pokemon2.setForca(100.0);
        pokemon2.setTipo("Fogo");
        
        for(int i=0; i < 5; i++)
            ashe.treinarPokemon(pokemon2);
        
        System.out.println(String.format("Pokemon: %s, Força: %.2f, Tipo: %s", pokemon2.getNome(), pokemon2.getForca(), pokemon2.getTipo()));
        
        
        ashe.evoluirPokemon(pokemon2, "Charizard");
        
        
        System.out.println(String.format("Pokemon: %s, Força: %.2f, Tipo: %s", pokemon2.getNome(), pokemon2.getForca(), pokemon2.getTipo()));
        
        
        ashe.treinarPokemon(pokemon1);
        ashe.treinarPokemon(pokemon1);

        System.out.println(String.format("Pokemon: %s, Força: %.2f, Tipo: %s", pokemon1.getNome(), pokemon1.getForca(), pokemon1.getTipo()));
        
        ashe.evoluirPokemon(pokemon1, "Charmeleon");
         
        System.out.println(String.format("Treinador: %s. Nível: %d", ashe.getNome(), ashe.getNivel()));
        
    }
            
            
}
