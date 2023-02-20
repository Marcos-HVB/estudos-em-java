package com.mycompany.lista.exercicios;

import java.util.Scanner;

public class VotacaoEx9 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu sabor favorito? \n"
                + "5 - Mussarela \n"
                + "25 - Calabresa \n"
                + "50 - Quatro Queijos");

        Integer votoMussarela = 0;
        Integer votoCalabresa = 0;
        Integer votoQuatroQueijo = 0;

        for (int i = 0; i < 10; i++) {
            Integer votoAtual = leitor.nextInt();

            if (votoAtual == 5) {
                votoMussarela++;
            } else if (votoAtual == 25) {
                votoCalabresa++;
            } else {
                votoQuatroQueijo++;
            }
        }
        
        String msg = String.format("Votos mussarela: %d"
                + "Votos calabresa: %d"
                + "Votos quatro queijos: %d",votoMussarela, votoCalabresa, votoQuatroQueijo);
        
        String resultado;
        
        if(votoMussarela > votoCalabresa && votoMussarela > votoQuatroQueijo){
            resultado = "Mussarela";
        }else if(votoCalabresa > votoMussarela && votoCalabresa > votoQuatroQueijo){
            resultado = "Calabresa";
        }else if(votoMussarela == votoCalabresa || votoMussarela == votoQuatroQueijo || 
                votoQuatroQueijo == votoCalabresa){
            resultado = "Não houve";
        }else{
            resultado = "Calabresa";
        }
        
        System.out.println(resultado+" a mais votada.");
    }
}


