
package com.mycompany.lista.exercicios;

import java.util.Scanner;

public class PotenciaEx6 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer base = leitor.nextInt();
        
        Integer expoente = leitor.nextInt();
        
        Integer valorAtual = base;
        
        for(int i=0; i<expoente-1; i++){
            valorAtual *= base;
        }   
        
        System.out.println(valorAtual);
        
    }
}
