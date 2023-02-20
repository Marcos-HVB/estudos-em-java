
package com.mycompany.primeira.lista.atividade;

import java.util.Scanner;


public class CadastroUsuario {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira seu login: ");
        String login = leitor.nextLine();
        
        System.out.println("Insira sua senha: ");
        String senha = leitor.nextLine();
        
        System.out.println("Quantidade de tentativas antes do bloqueio: ");
        String tentativa = leitor.nextLine();
        
        System.out.println("Seu login é " +login+ " e sua senha é "+senha+". Você tem T\n" + tentativa+
        " tentativas antes de ser bloqueado");
        
        System.out.printf("Seu login é %s e sua senha é %s. Você tem %s\n tentativas antes de ser bloqueado", login, senha, tentativa);
    }
}
