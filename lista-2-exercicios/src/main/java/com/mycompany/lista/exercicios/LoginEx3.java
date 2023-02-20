
package com.mycompany.lista.exercicios;

import java.util.Scanner;

public class LoginEx3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o login:");
        String loginDigitado = leitor.nextLine();
        
        System.out.println("Insira a senha:");
        String senhaDigitada = leitor.nextLine();
        
        if(loginDigitado.equals("admin" ) && senhaDigitada.equals("#SPtech2022")){
            System.out.println("Login realizado com sucesso!");
        }else{
            System.out.println("Login e/ou senha inválidos");
        }
    }
}
