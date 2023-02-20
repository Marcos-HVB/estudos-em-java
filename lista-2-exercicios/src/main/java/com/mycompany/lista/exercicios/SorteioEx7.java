package com.mycompany.lista.exercicios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SorteioEx7 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número de 1 a 100");
        Integer numEscolhido = leitor.nextInt();

        Integer primeiraVezSorteado = 0;
        Integer qtdNumerosPares = 0;
        Integer qtdNumerosImpares = 0;

        for (int i = 0; i < 200; i++) {

            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 101);

            if (numeroSorteado == numEscolhido && primeiraVezSorteado == 0) {
                primeiraVezSorteado = i + 1;
            }

            if (numeroSorteado % 2 == 0) {
                qtdNumerosPares++;
            } else {
                qtdNumerosImpares++;
            }
        }

        String frase = String.format("Primeira vez sorteado: %d \n "
                + "Quantidade de números pares sorteados: %d \n"
                + "Quantidade de números impares sorteados: %d", primeiraVezSorteado,
                qtdNumerosPares, qtdNumerosImpares);

        System.out.println(frase);

    }

}
