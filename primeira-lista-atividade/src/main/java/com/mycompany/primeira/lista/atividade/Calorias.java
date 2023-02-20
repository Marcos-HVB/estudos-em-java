
package com.mycompany.primeira.lista.atividade;

import java.util.Scanner;

public class Calorias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Tempo(minutos) que passou se aquecendo:");
        Integer tempAquecimento = leitor.nextInt();
        
        System.out.println("Tempo(minutos) que passou fzd exercícios aeróbicos:");
        Integer tempAerobico = leitor.nextInt();
        
        System.out.println("Tempo(minutos) que passou fzd musculação: ");
        Integer tempMusculacao = leitor.nextInt();
        
        Integer totalMin = tempAquecimento + tempAerobico + tempMusculacao;
        
        Integer totalCaloria = (tempAquecimento*12) + (tempAerobico*20) + (tempMusculacao*25);
        
        System.out.println("Olá, Jorge. Você fez um total de "+totalMin
            + " minutos de exercícios e perdeu cerca de\n"
            +totalCaloria+" calorias");
        
        System.out.printf("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de\n" +
        "%d calorias", totalMin, totalCaloria);
    }
}
