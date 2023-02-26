
package com.mycompany.terceira.lista.nivelamento;

import java.util.Scanner;

public class TesteClasseSocial {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        ClasseSocial calculadora = new ClasseSocial();
        
        
        System.out.println("Insira o valor do seu salário: ");
        Double valorSalario = leitor.nextDouble();
        
        Double qtdSalarioMinimo = calculadora.calcularQtdSalarioMinimo(valorSalario);
        
        String classeSocial = calculadora.devolverClasseSocial(qtdSalarioMinimo);
        
      
        String msg = String.format("Sua renda: %.2f. \nVocê recebe aproximadamente %.1f. \n"
                + "Você pertence a classe social: %s.", valorSalario, qtdSalarioMinimo, classeSocial);
        
        System.out.println(msg);
        
    }
}
