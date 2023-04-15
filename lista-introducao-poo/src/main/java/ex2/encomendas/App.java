
package ex2.encomendas;

public class App {
    public static void main(String[] args) {
        Encomendas encomendaMouse = new Encomendas();
        
        encomendaMouse.distancia = 40.0;
        encomendaMouse.enderecoDestinatario = "Rua Francisco, 211";
        encomendaMouse.enderecoEncomenda = "Rua Freitas, 334";
        encomendaMouse.tamanho = "P";
        encomendaMouse.valorEncomenda = 266.0;
     
        encomendaMouse.calcularFrete();
        
        encomendaMouse.emitirEtiqueta();
    }
}
