
package exercicio05;

public class ValidacaoNumerica {
    void verificarPrimo(Integer num){
        
        Integer qtdPrimo = 0;
        
        for(int i = 1; i <= num; i++){
            
            if(num % i == 0)
                qtdPrimo++;
                
        }
        
        if(qtdPrimo <= 2)
            System.out.println("Esse número é primo");
        else
            System.out.println("Esse número não é primo");
        
    }
}
