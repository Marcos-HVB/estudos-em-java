
package exercicio01;

public class CalculaAluno {
    Double calculaMedia(Double nota1, Double nota2){
        Double notaFinal;
        
        notaFinal = (nota1 * 0.4) + (nota2 * 0.6);
        
        return notaFinal;
    }
}
