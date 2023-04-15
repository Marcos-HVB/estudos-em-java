package com.mycompany.projeto.individual.sprint1;

import java.util.Scanner;

public class MetodosMenu {

    void calcularQtdXicara(Double hora, Integer dificuldade) {

        Double qtdXicara = (hora * 2) * dificuldade;

        System.out.println(String.format("Total de xicaras tomadas: %.2f \n", qtdXicara));

    }

    String recomendarCafe(Integer opcaoEscolhida) {

        String recomendacoes = "";

        switch (opcaoEscolhida) {
            case 1:
                recomendacoes = "Death Wish Coffee - com 200% de cafeína a mais que outros grãos\n";
                break;
            case 2:
                recomendacoes = "Café carioca - ele é um pouco mais diluído em água do que o expresso comum\n";
                break;
            case 3:
                recomendacoes = "Pilão, Três corações, Melita - Possuem baixíssima complexidade no sabor final da bebida\n";
                break;
            default:
                recomendacoes = "Opção inválida!\n";

        }

        return recomendacoes;
    }

    void listarCafeterias() {

        System.out.println("The Coffee \n"
                + "Starbucks\n"
                + "Cheirin Bão – Empório Mineiro e Cafeteria\n"
                + "Sterna Café\n"
                + "Tom Tom Churros & Café\n");

    }

    Integer quizCafe() {
        Scanner leitor = new Scanner(System.in);
        
        Integer somaDePontos = 0;
        
        System.out.println("Qual o café mais forte do mundo?");
        String cafeMaisForte = leitor.nextLine();
        
        if(cafeMaisForte.equals("death wish coffee"))
            somaDePontos += 1;
        
        System.out.println("Qual o café mais caro do mundo?");
        String cafeMaisCaro = leitor.nextLine();
        
        if(cafeMaisCaro.equals("kopi luwak"))
            somaDePontos += 1;
        
        System.out.println("Qual o café mais vendido do mundo?");
        String cafeMaisVendido = leitor.nextLine();
        
        if(cafeMaisVendido.equals("starbucks"))
            somaDePontos += 1;
        
        System.out.println("Qual o café mais vendido no Brasil?");
        String cafeMaisVendidoBrasil = leitor.nextLine();
        
        if(cafeMaisVendidoBrasil.equals("melitta"))
            somaDePontos += 1;
        
        return somaDePontos;
    }
    
}
