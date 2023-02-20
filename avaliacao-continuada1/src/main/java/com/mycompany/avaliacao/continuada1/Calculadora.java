package com.mycompany.avaliacao.continuada1;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer escolha;
        String msg = "Digite um número inteiro:";

        do {
            System.out.println("Digite o número correspondente a operação desejada:\n"
                    + "1 - Soma\n"
                    + "2 - Multiplicação\n"
                    + "3 - Divisão\n"
                    + "4 - Subtração\n"
                    + "5 - Potência\n"
                    + "6 - Resto\n"
                    + "0 – Sair");

            escolha = leitor.nextInt();

            switch (escolha) {
                case 0:
                    msg = "Até logo!";
                    break;
                default:
                    if (escolha > 6 || escolha < 1) {
                        msg = "Opção inválida, tente novamente \n";
                    }
                    break;
            }

            System.out.println(msg);
            
            Double numEscolhido, valorAtual;
            String resultado;
         

            switch (escolha) {
                case 1:
                    numEscolhido = leitor.nextDouble();
                    for (int i = 1; i <= 10; i++) {
                        resultado = String.format(" %.2f + %d = " + (numEscolhido + i), numEscolhido, i);
                        System.out.println(resultado);
                    }
                    break;
                    
                case 2:
                    numEscolhido = leitor.nextDouble();
                    for (int i = 1; i <= 10; i++) {
                        resultado = String.format(" %.2f * %d = " + (numEscolhido * i), numEscolhido, i);
                        System.out.println(resultado);
                    }
                    break;
                    
                case 3:
                    numEscolhido = leitor.nextDouble();
                    for (int i = 1; i <= 10; i++) {
                        valorAtual = numEscolhido / i;
                        resultado = String.format(" %.2f / %d = %.2f ",numEscolhido, i, valorAtual);
                        System.out.println(resultado);
                    }
                    break;
                    
                case 4:
                    numEscolhido = leitor.nextDouble();
                    for (int i = 1; i <= 10; i++) {
                        resultado = String.format(" %.2f - %d = " + (numEscolhido - i), numEscolhido, i);
                        System.out.println(resultado);
                    }
                    break;
                    
                case 5:
                    numEscolhido = leitor.nextDouble();
                    for (int i = 1; i <= 10; i++) {
                        resultado = String.format(" %.2f ** %d = " + (Math.pow(numEscolhido, i)), numEscolhido, i);
                        System.out.println(resultado);
                    }
                    break;
                    
                case 6:
                    numEscolhido = leitor.nextDouble();
                    for (int i = 1; i <= 10; i++) {
                        valorAtual = numEscolhido % i;
                        resultado = String.format(" %.2f %% %d = ",numEscolhido, i, valorAtual);
                        System.out.println(resultado);
                    }
                    break;
            }
        } while (escolha != 0);
    }

}
