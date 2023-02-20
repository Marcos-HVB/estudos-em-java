
package com.mycompany.lista.exercicios;

import java.util.Scanner;


public class AcumuladorEx2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        
        Integer numeroLido;
        Integer somaNumeros = 0;
        do{
            
            numeroLido = leitor.nextInt();
            
            somaNumeros += numeroLido;
            
        }while(numeroLido != 0);
        
        String texto = String.format("A soma dos números é %d", somaNumeros);
        
        System.out.println(texto);
        
    }
}
