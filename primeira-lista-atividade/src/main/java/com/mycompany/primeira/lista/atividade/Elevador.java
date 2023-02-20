
package com.mycompany.primeira.lista.atividade;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o peso máximo de um elevador:");
        Integer pesoMaximo = leitor.nextInt();
        
        System.out.println("Insira a qtd máxima de pessoas em um elevador:");
        Integer qtdMaxima = leitor.nextInt();
        
        Double pesoTotal = 0.0;
        
        for(Integer i=0; i<3; i++){
            System.out.println("Insira o peso da "+(i+1)+" pessoa que entrou no elevador:");
            pesoTotal += leitor.nextDouble();
        }   
        
        System.out.printf("Entraram 3 pessoas no elevador, no qual cabem %d pessoas.\n" +
        "O peso total no elevador é de %.2f, sendo que ele suporta %d", qtdMaxima, pesoTotal, pesoMaximo);
    }
  
}
