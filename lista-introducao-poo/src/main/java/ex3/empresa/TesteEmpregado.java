
package ex3.empresa;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregadoJoao = new Empregado();
        Empregado empregadoCleber = new Empregado();
        
        empregadoJoao.nome = "João";
        empregadoJoao.cargo = "Analista de Sistemas";
        empregadoJoao.salario = 5400.0;
        
        empregadoJoao.reajustarSalario(15.0);
        
        System.out.println(String.format("Funcionário: %s\n"
                + "Cargo: %s\n"
                + "Salário: %.2f\n",empregadoJoao.nome, empregadoJoao.cargo, empregadoJoao.salario));
        
        
        empregadoCleber.nome = "Cleber";
        empregadoCleber.cargo = "Dormir";
        empregadoCleber.salario = 400.0;
        
        empregadoCleber.reajustarSalario(100.0);
        
        System.out.println(String.format("Funcionário: %s\n"
                + "Cargo: %s\n"
                + "Salário: %.2f\n",empregadoCleber.nome, empregadoCleber.cargo, empregadoCleber.salario));
        
        
    }
}
