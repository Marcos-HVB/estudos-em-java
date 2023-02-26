
package exercicio05;

import java.util.Scanner;

public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        
        ValidacaoNumerica calcula = new ValidacaoNumerica();
        Scanner leitor = new Scanner(System.in);
        
        Integer numeroDigitado;
        do{
            System.out.println("Digite valores positivos e inteiro(negativo se quiser sair): ");
            numeroDigitado = leitor.nextInt();
            
            calcula.verificarPrimo(numeroDigitado);
            
        }while(numeroDigitado >= 0);
    }
}
