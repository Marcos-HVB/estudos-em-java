
package exercicio04;

import java.util.Scanner;

public class TesteCalculoNutricao {
    public static void main(String[] args) {
        
        CalculoNutricao calculadora = new CalculoNutricao();
        Scanner leitor = new Scanner(System.in);
        
        Double altura = 1., peso = 1.;
        
        while(peso != 0 || altura != 0){
            System.out.println("Insira sua altura(em metros): ");
            altura = leitor.nextDouble();
            
            System.out.println("Insira seu peso: ");
            peso = leitor.nextDouble();
            
            calculadora.calculaIMC(peso, altura);
        }    
        
    }
 
}
