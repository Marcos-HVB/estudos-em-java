package lista.de.inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inteiros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> inteiros = new ArrayList<>();
        Integer somaDeInteiros = 0;
        Integer menorNumero;
        Integer maiorNumero;

        do {
            System.out.println("Insira um número inteiro: ");
            Integer numAtual = leitor.nextInt();

            if (numAtual == 0) {
                break;
            }
            inteiros.add(numAtual);

        } while (true);

        System.out.println("Pares: ");
        for (Integer par : inteiros) {
            if (par % 2 == 0) {
                System.out.println(par);
            }
        }

        System.out.println("Impares: ");
        for (Integer impar : inteiros) {
            if (impar % 2 != 0) {
                System.out.println(impar);
            }
        }

        for (Integer soma : inteiros) {
            somaDeInteiros += soma;
        }

        System.out.printf("Soma: %d\n", somaDeInteiros);

        menorNumero = inteiros.get(1);
        for (Integer numAtual : inteiros) {
            if (numAtual < menorNumero) {
                menorNumero = numAtual;
            }
        }
        System.out.printf("Menor número: %d\n", menorNumero);

        maiorNumero = inteiros.get(inteiros.size() - 1);
        for (Integer numAtual : inteiros) {
            if (numAtual > maiorNumero) {
                maiorNumero = numAtual;
            }
        }
        System.out.printf("Maior número: %d\n", maiorNumero);
    }
}
