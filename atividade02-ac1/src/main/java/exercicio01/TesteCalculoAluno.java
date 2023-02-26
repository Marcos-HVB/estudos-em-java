
package exercicio01;

import java.util.Scanner;

public class TesteCalculoAluno {
    public static void main(String[] args) {
        
        CalculaAluno calculadora = new CalculaAluno();
        Scanner leitor = new Scanner(System.in);
        
        
        Double nota1, nota2;
        
        System.out.println("Insira dois números: ");
        nota1 = leitor.nextDouble();
        nota2 = leitor.nextDouble();
        
        Double mediaNota = calculadora.calculaMedia(nota1, nota2);
        
        System.out.println("Média: " + mediaNota);
        
    }
}
