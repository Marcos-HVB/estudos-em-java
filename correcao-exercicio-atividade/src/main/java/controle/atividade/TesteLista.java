
package controle.atividade;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {
        List listaEstrnhada = new ArrayList(); 
        
        
        listaEstrnhada.add("Xampson");
        listaEstrnhada.add(42);
        listaEstrnhada.add(42.0);
        listaEstrnhada.add(false);
        
        System.out.println(listaEstrnhada);
        
        
        List<String> nomes = new ArrayList();
        nomes.add("Bob");
        nomes.add("Maria");
        nomes.add("Xampson");
        nomes.add("William");
        nomes.add("Giuliana");
        
        
        String terceiroNome = nomes.get(2);
        
        for (int i = 0; i < nomes.size(); i++) {
            System.out.printf("%d - Nome do índice: %s", i+1, nomes.get(i));
        }
        
        // duas formas de remover
        nomes.remove("William");
        nomes.remove(3); 
        
        
        List<Atividade> atividades = new ArrayList();
        
        Atividade atividade01 = new Atividade("Preparar Aula", "William", 10);
        
        Atividade atividade02 = new Atividade("Pintar as paredes da casa", "Xampson", 3);
        
        // Atividade atividade03 = new Atividade("Cozinhar bolo", "Nathan", 1);
        
        atividades.add(atividade01);
        atividades.add(atividade02);
        atividades.add(new Atividade("Cozinhar bolo", "Nathan", 1));
        
        for (int i = 0; i < atividades.size(); i++) {
            Atividade atividadeDaVez = atividades.get(i);
            if(atividadeDaVez.getDiasEstimados() < 5){
                System.out.println(atividadeDaVez);
            }
        }
        
        // Enhaced for 
        for (Atividade atividadeDaVez : atividades) {
            if(atividadeDaVez.getDiasEstimados() < 5){
                System.out.println(atividadeDaVez);
            }
        }
                
    }
}
