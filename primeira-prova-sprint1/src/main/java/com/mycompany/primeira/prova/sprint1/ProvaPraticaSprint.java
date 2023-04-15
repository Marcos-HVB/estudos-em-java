package com.mycompany.primeira.prova.sprint1;

import java.util.Scanner;

public class ProvaPraticaSprint {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer opcaoEscolhida = 0;
        Double valorAtual = .0;
        Double valorEscolhido = .0;
        do {

            System.out.println("SPTech Investimentos \n"
                    + "Olá, o que deseja fazer: \n"
                    + "1 - depositar\n"
                    + "2 - Sacar \n"
                    + "3 - Simular rendimentos \n"
                    + "0 - Sair");

            opcaoEscolhida = leitor.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    valorEscolhido = leitor.nextDouble();

                    if (valorEscolhido >= 0) {
                        valorAtual += valorEscolhido;
                        System.out.println(String.format("Depósito realizado - Valor atual: R$%.2f", valorAtual));
                    } else {
                        System.out.println("Valor inválido");
                    }

                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    valorEscolhido = leitor.nextDouble();

                    if (valorEscolhido >= 0) {
                        if (valorEscolhido <= valorAtual) {
                             valorAtual -= valorEscolhido;
                            System.out.println(String.format("Saque realizado - Saldo atual: R$%.2f", valorAtual));
                           
                        } else {
                            System.out.println("Valor inválido");
                        }
                    } else {
                        System.out.println("Valor inválido");
                    }
                    
                    break;
                case 3:
                    
                    if(valorAtual <= 0){
                        System.out.println("Saldo zerado, opção inválida");
                    }else{
                        Double ganhoSimulado = valorAtual;
                        
                        System.out.println(String.format("Saldo atual: R$%.2f", ganhoSimulado));
                        for(int i=1; i <= 12; i++){
                            ganhoSimulado += ganhoSimulado * .1;
                            System.out.println(String.format("Mês %d | Saldo: R$%.2f" ,i, ganhoSimulado));
                        }
                    }

            }

        } while (opcaoEscolhida != 0);
    }
}
