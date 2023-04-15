
package pokemonex2;


public class TreinadorPokemon {
    private String nome;
    private Integer nivel;
    
    
    public void treinarPokemon(Pokemon pokemon){
        pokemon.setForca(pokemon.getForca() * 1.1);
        pokemon.setDoce(pokemon.getDoce() + 10);
        this.nivel += 2;
    }
    
    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
        if(pokemon.getDoce() >= 50){
            String nomeAntigo = pokemon.getNome();
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoce(pokemon.getDoce() - 50);
            this.nivel += 10;
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", nomeAntigo, pokemon.getNome()));
        }else{
            System.out.println("Não foi possível realizar operação");
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    
    
    
}
