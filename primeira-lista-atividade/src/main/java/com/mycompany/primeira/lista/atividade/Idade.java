
package com.mycompany.primeira.lista.atividade;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome?");
        String nome = leitor.nextLine();
        
        System.out.println("Olá, "+nome+"! Qual o ano de seu nascimento?");
        Integer anoNasc = leitor.nextInt();
        
        System.out.printf("Em 2030 você terá %d anos.", (2030 - anoNasc));
                
    }
            
}
