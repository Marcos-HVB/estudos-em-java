
package com.mycompany.primeira.lista.atividade;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Nome do aluno: ");
        String nome = leitor.nextLine();
        
        System.out.println("1° nota:");
        Integer nota1 = leitor.nextInt();
        
        System.out.println("2° nota:");
        Integer nota2 = leitor.nextInt();
        
        Double media = new Double(nota1+nota2)/2; 
                
        System.out.printf("Olá, %s. Sua média foi de %.2f", nome, media);
        
    }
}
