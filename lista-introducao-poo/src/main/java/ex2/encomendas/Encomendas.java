
package ex2.encomendas;

public class Encomendas {
    String tamanho;
    String enderecoEncomenda;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    Double valorFrete;
    
    void calcularFrete(){
        Double jurosTamanho = .0;
        Double jurosDistancia;
        
        switch(tamanho){
            case "P":
                jurosTamanho = 0.1;
                break;
            case "M":
                jurosTamanho = 0.3;
                break;
            case "G":
                jurosTamanho = 0.5;
                break;
        }
        
        if(distancia <= 50)
            jurosDistancia = 3.0;
        else if(distancia <=200)
            jurosDistancia = 5.0;
        else
            jurosDistancia = 7.0;
        
        valorFrete = jurosDistancia + (valorEncomenda * jurosTamanho);
    }
    
    void emitirEtiqueta(){
        System.out.println(String.format("***** ETIQUETA PARA ENVIO ******** \n"
                + "Endereço do remetente: %s\n"
                + "Endereço do destinatário: %s\n"
                + "Tamanho: %s\n"
                + "-------------------------\n"
                + "Valor encomenda: %.2f\n"
                + "Valor frete: %.2f\n"
                + "-------------------------\n"
                + "Valor total: %.2f\n", enderecoEncomenda, enderecoDestinatario, tamanho, valorEncomenda, valorFrete, (valorEncomenda + valorFrete)));
    }
}
