
package com.mycompany.primeira.lista.atividade;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor do salário bruto:");
        Double salarioBruto = leitor.nextDouble();
        
        System.out.println("Valor da condução casa->trabalho:");
        Double valorCond = leitor.nextDouble();
        
        Double totalDescontos = (salarioBruto*0.1) + (salarioBruto * 0.2) + ((valorCond * 2) * 22);
        
        Double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println("Seu salário bruto é R$"+salarioBruto+", tem um total de R$"+totalDescontos+" em descontos e receberá um\n" +
        "líquido de R$"+salarioLiquido);
        
        System.out.printf("Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um\n" +
        "líquido de R$%.2f", salarioBruto, totalDescontos, salarioLiquido);
    }
 
}
