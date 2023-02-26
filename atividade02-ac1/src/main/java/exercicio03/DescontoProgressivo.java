
package exercicio03;

import java.sql.SQLOutput;

public class DescontoProgressivo {
    
    Double calcularDesconto(Double valorItem, Integer qtdItem){
        Double desconto, valorFinal;
        
        switch(qtdItem){
            case 1:
                desconto = 0.1;
                break;
            case 2: 
                desconto = 0.2;
                break;
            default:
                desconto = 0.3;
        }
        
        return valorFinal = (valorItem * qtdItem) * desconto;
    }
    
    void exibirNotaFiscal(Double valorFinal){
        
        System.out.println("Valor com desconto: "+ valorFinal);
               
    }
    
    
    void imprimeLinha(){
        System.out.println("---------------------------------------");
    }
}
