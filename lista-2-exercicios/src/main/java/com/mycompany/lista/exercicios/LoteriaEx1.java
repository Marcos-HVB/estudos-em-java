
package com.mycompany.lista.exercicios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class LoteriaEx1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número entre 0-10");
        Integer numeroEscolhido = leitor.nextInt();
        
        Integer contador = 0;
        Integer numeroSorteado;
        
        do{
            
            numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
                
            contador++;
            
        }while(numeroSorteado != numeroEscolhido);       
        
        if(contador <= 3){
            System.out.println("Você é MUITO sortudo");
        }else if(contador <= 10){
            System.out.println("Você é sortudo");
        }else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");    
        }
    }
            
}
