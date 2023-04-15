
package controle.atividade;


public class TesteAtividade {
    public static void main(String[] args) {
        Atividade atividade01 = new Atividade("Preparar Aula", "William", 10);
        
        Atividade atividade02 = new Atividade("Pintar as paredes da casa", "Xampson", 3);
        
        Atividade atividade03 = new Atividade("Cozinhar bolo", "Nathan", 1);
        
        atividade01.terminarAtividade(7);
        atividade02.terminarAtividade(3);
        atividade03.terminarAtividade(4);
        
        atividade01.exibirRelatorio();
        atividade02.exibirRelatorio();
        atividade03.exibirRelatorio();
    }
}
