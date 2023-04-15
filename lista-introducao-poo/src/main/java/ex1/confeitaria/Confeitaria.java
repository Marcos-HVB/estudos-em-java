
package ex1.confeitaria;


public class Confeitaria {
    String sabor;
    Double valor;
    Integer qtdVendida = 0;
    
    void comprarBolo(Integer qtdComprada){
        if((qtdVendida + qtdComprada) >= 100)
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse lado");
        else
            qtdVendida+= qtdComprada;
        
    }
    
    void exibirRelatorio(){
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f",sabor, qtdVendida, (valor*qtdVendida)));
    }
}
