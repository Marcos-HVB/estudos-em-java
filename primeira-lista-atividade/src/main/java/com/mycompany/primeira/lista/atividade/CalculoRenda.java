
package com.mycompany.primeira.lista.atividade;

import java.util.Scanner;


public class CalculoRenda {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Filhos de 0-3 anos: ");
        Integer qtdFilhoNovo = leitor.nextInt();
        
        System.out.println("Filhos de 4-16 anos: ");
        Integer qtdFilhoMedio = leitor.nextInt();
        
        System.out.println("Filhos de 17-18 anos: ");
        Integer qtdFilhoVelho = leitor.nextInt();
        
        Integer totalFilho = qtdFilhoNovo + qtdFilhoMedio + qtdFilhoVelho;
        
        Double valorBolsa = (qtdFilhoNovo * 25.12) + (qtdFilhoMedio * 15.88) + (qtdFilhoVelho * 12.44);
        
        System.out.println("Você tem um total de "+totalFilho+" filhos e vai receber R$"+valorBolsa+" de bolsa");
        
        System.out.printf("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", totalFilho, valorBolsa);
        
    }
}
