
package ex4.termometro;

public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;
    
    void aumentaTemperatura(Double temperaturaEscolhida){  
        
        if(     aqaqaaswswswswstemperaturaEscolhida >= temperaturaMax)
            temperaturaAtual = temperaturaMax;
        else
            temperaturaAtual += temperaturaEscolhida;
        
        System.out.println("Tmeperatura atual: "+temperaturaAtual);

    }
    
    void diminuiTemperatura(Double temperaturaEscolhida){
        
        temperaturaEscolhida *= -1;
        if(temperaturaEscolhida <= temperaturaMin)
            temperaturaAtual = temperaturaMin;
        else
            temperaturaAtual -= temperaturaEscolhida;
              
        System.out.println("Tmeperatura atual: "+temperaturaAtual);
    }
    
    void exibeFahreinheit(){
        
        System.out.println(String.format("F%.2f", ((temperaturaAtual * 9/5) + 32)));
        
    }
}
