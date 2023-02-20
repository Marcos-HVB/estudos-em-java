
package com.mycompany.primeira.lista.atividade;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número: ");
        Double primeiroNum = leitor.nextDouble();
        
        System.out.println("Insira o segundo número: ");
        Double segundoNum = leitor.nextDouble();
        
        System.out.println("Resultado da soma: ");
        System.out.println(primeiroNum + segundoNum);
        
        System.out.println("Resultado da subtração: ");
        System.out.println(primeiroNum - segundoNum);
        
        System.out.println("Resultado da multiplicação: ");
        System.out.println(primeiroNum * segundoNum);
        
        System.out.println("Resultado da divisão: ");
        System.out.println(primeiroNum / segundoNum);
    }
}
