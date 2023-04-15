
package ex1.confeitaria;

public class App {
    public static void main(String[] args) {
        Confeitaria boloMorango = new Confeitaria();
        boloMorango.sabor = "Morango";
        boloMorango.valor = 5.0;
        
        
        Confeitaria boloChocolate = new Confeitaria();
        boloChocolate.sabor = "Chocolate";
        boloChocolate.valor = 8.0;
        
        Confeitaria boloBanana = new Confeitaria();
        boloBanana.sabor = "Banana";
        boloBanana.valor = 10.0;
        
        for(int i=0; i <5; i++){
            boloMorango.comprarBolo(2);
            boloChocolate.comprarBolo(5);
            boloBanana.comprarBolo(8);
        }
        
        boloMorango.exibirRelatorio();
        boloChocolate.exibirRelatorio();
        boloBanana.exibirRelatorio();
    }
}
