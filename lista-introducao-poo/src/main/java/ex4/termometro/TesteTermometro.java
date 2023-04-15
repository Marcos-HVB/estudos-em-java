
package ex4.termometro;

public class TesteTermometro {
    public static void main(String[] args) {
        
        Termometro teste1 = new Termometro();
        
        teste1.temperaturaAtual = 30.0;
        teste1.temperaturaMax = 60.0;
        teste1.temperaturaMin = -2.0;
        
        teste1.aumentaTemperatura(200.0);
        teste1.diminuiTemperatura(300.0);
        
        teste1.exibeFahreinheit();
        
    }
}
