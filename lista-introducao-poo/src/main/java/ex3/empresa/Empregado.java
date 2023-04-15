
package ex3.empresa;

public class Empregado {
    String nome;
    String cargo;
    Double salario = .0;
    
    void reajustarSalario(Double porcentagemAumentada){
        
        salario *= (1 + (porcentagemAumentada / 100));
        
        
           
    }
}
