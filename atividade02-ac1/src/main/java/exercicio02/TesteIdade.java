
package exercicio02;

import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Idade impressao = new Idade();
        
        System.out.println("Insira sua idade: ");
        Integer idadeUsuario = leitor.nextInt();
        
        
        impressao.classificaIdade(idadeUsuario);
        
        
    }
}
