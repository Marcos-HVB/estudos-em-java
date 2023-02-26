
package com.mycompany.terceira.lista.nivelamento;

public class ClasseSocial {
    
    Double calcularQtdSalarioMinimo(Double valorSalario){
        
        Double qtdSalarioMinimo = valorSalario / 1045;
        
        return qtdSalarioMinimo;
    }
    
    
    String devolverClasseSocial(Double qtdSalarioMinimo){
        
        String classeSocial;
        
        if(qtdSalarioMinimo <= 2){
            return classeSocial = "E";
        }else if(qtdSalarioMinimo <= 4){
            return classeSocial = "D";
        }else if(qtdSalarioMinimo <= 10){
            return classeSocial = "C";
        }else if(qtdSalarioMinimo <= 20){
            return classeSocial = "B";
        }else{
            return classeSocial = "A";
        }
    }
}
