
package estimativa;


public class TesteEstimativa {
    public static void main(String[] args) {
        Estimativa tarefa1 = new Estimativa("Atividade Avaliativa 2 - LP", "Marcos H.", 1);
        Estimativa tarefa2 = new Estimativa("Assistir videoaula - PI", "Marcos H.", 1);
        Estimativa tarefa3 = new Estimativa("Atividade - SO", "Marcos H.", 2);
        
        tarefa1.exibirRelatorio();
        
        tarefa2.terminarAtividade(2);
        tarefa2.exibirRelatorio();
        
        
        System.out.println(tarefa1);
        
    }
}
