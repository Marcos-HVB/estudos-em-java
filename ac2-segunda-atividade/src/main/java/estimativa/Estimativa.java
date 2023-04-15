
package estimativa;


public class Estimativa {
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Estimativa(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }
    
    public void terminarAtividade(Integer diasUsados){
        if(diasUsados < 0)
            System.out.println("Valor inválido");
        else
            this.diasUsados = diasUsados;
    }
    
    public void exibirRelatorio(){
        if(diasUsados > diasEstimados){
            System.out.println(String.format("Você estimou %d dias, mas a tarefa foi feita em %d dias (%d dias a mais que o estimado). Melhore a estimativa.",diasEstimados,
            diasUsados, (diasUsados - diasEstimados)));      
        }else if(diasUsados < diasEstimados){
            System.out.println(String.format("Você estimou %s dias, e a tarefa foi feita em %d dias (%d dias a menos que o estimado).Parabéns!",diasEstimados,
            diasUsados, (diasEstimados - diasUsados)));  
        }else{
            System.out.println(String.format("Você estimou %d dias, e a tarefa foi feita em %d dias, atendendo a estimativa com precisão",diasEstimados, diasUsados));  
            
        }
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }


    @Override
    public String toString() {
       return String.format("\nEstimativa: \nNome da Atividade: %s \nResponsável: %s \nDias Estimados: %d\nDias Usados: %d\n", nomeAtividade, responsavel,diasEstimados, diasUsados);
    }
    
    
}
