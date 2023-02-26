
package exercicio03;

import java.util.Scanner;

public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        
        DescontoProgressivo teste = new DescontoProgressivo();
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Bem-vindo ao sistema de desconto progressivo! \n\n"
                            + "Digite o valor unitário do produto:");
        Double valorProduto = leitor.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        Integer qtdItem = leitor.nextInt();
        
        teste.imprimeLinha();
        System.out.println("Valor do produto: " + valorProduto + "\n"
        + "Quantiadade: "+ qtdItem);
        
        teste.imprimeLinha();
        
        teste.exibirNotaFiscal(teste.calcularDesconto(valorProduto, qtdItem));
    }      
}
