package com.mycompany.projeto.individual.sprint1;

import java.util.Scanner;

public class MenuCafé {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        MetodosMenu acao = new MetodosMenu();
        Integer opcaoMenu;
        Integer ponto = 0;

        do {

            System.out.println("Bem-vindo ao menu dos cafés! \nEscola uma opção do menu:");

            System.out.println("1 - Calcular quantidade de xícaras de café tomada por um programador: \n"
                    + "2 - Recomendação de café:\n "
                    + "3 - Listar principais franquias de café\n "
                    + "4 - sair\n "
                    + "5 - jogo ");

            opcaoMenu = leitor.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Horas que passou codando: ");
                    Double horasCodando = leitor.nextDouble();

                    System.out.println("Dificuldade da tarefa (1 a 3)");
                    Integer dificuldadeTarefa = leitor.nextInt();

                    acao.calcularQtdXicara(horasCodando, dificuldadeTarefa);

                    break;
                case 2:

                    Integer opcaoTipoCafe;

                    do {
                        System.out.println("2 - Recomendação de café: ");

                        System.out.println("1 - Forte \n2 - Fraco \n3 - Tradicional ");

                        opcaoTipoCafe = leitor.nextInt();

                        System.out.println(acao.recomendarCafe(opcaoTipoCafe));
                        

                    } while (opcaoTipoCafe > 3 || opcaoTipoCafe < 1);

                    break;
                case 3:

                    acao.listarCafeterias();

                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nossa ferramenta!");
                    break;
                case 5:

                    Integer pontosFeito = acao.quizCafe();

                    ponto += pontosFeito;

                    System.out.println(String.format("Pontuação atual: %d \n", ponto));

                    break;
                default:
                    System.out.println("Escolha uma opção válida!\n");

            }

        } while (opcaoMenu != 4);

    }

}
