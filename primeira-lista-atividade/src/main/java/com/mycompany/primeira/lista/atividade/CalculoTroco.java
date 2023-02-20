
package com.mycompany.primeira.lista.atividade;

import java.util.Scanner;

public class CalculoTroco {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor unitário de um produto: ");
        Double valorProduto = leitor.nextDouble();
        
        System.out.println("Insira a quantidade vendida:");
        Integer qtdVendida = leitor.nextInt();
        
        System.out.println("Valor pago pelo cliente:");
        Double valorCliente = leitor.nextDouble();
        
        Double trocoCliente = valorCliente - (valorProduto * qtdVendida);
        
        System.out.println("Seu troco será de R$"+trocoCliente);
        
        System.out.printf("Seu troco será de R$%.2f", trocoCliente);
    }
}
