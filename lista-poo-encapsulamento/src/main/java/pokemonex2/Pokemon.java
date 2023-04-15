
package pokemonex2;


public class Pokemon {
    private String nome;
    private String tipo;
    private Double forca;
    private Integer doce = 0;

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getForca() {
        return forca;
    }

    public Integer getDoce() {
        return doce;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public void setDoce(Integer doce) {
        this.doce = doce;
    }
    
    
    
    
}
