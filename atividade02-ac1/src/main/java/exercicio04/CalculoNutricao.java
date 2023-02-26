
package exercicio04;

public class CalculoNutricao {
    
    void calculaIMC(Double peso, Double altura){
        
        Double imc = peso / (altura * altura);
        
        String msg = String.format("Seu IMC é: %.2f \n", imc);
        System.out.println(msg);
    }
    
}
