
package empresaex1;

import java.util.concurrent.Flow;

public class TesteColaborador {
    public static void main(String[] args) {
        
        RecursosHumanos processos = new RecursosHumanos();
        
        Colaborador colaborador1 = new Colaborador();
        colaborador1.setNome("Roberto");
        colaborador1.setCargo("Analista");
        colaborador1.setSalario(1500.0);
        
        Colaborador colaborador2 = new Colaborador();
        colaborador2.setNome("Fernandes");
        colaborador2.setCargo("Gerente");
        colaborador2.setSalario(2000.0);
        
        
        
        System.out.println(String.format("Nome %s, salário %.2f, cargo %s", colaborador1.getNome(), colaborador1.getSalario(), colaborador1.getCargo()));
        System.out.println(String.format("Nome %s, salário %.2f, cargo %s", colaborador2.getNome(), colaborador2.getSalario(), colaborador2.getCargo()));
        
        processos.promoverColaborador(colaborador2, "Dono da empresa", 3000.0);

        processos.promoverColaborador(colaborador1, "Fachineiro", 1300.0);
        
        System.out.println(processos.getTotalPromovidos());
        System.out.println(processos.getSalarioReajuste());
        
        
    }
}
