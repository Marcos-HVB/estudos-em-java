
package empresaex1;

public class RecursosHumanos {
    private Integer totalPromovidos = 0;
    private Integer totalSalarioReajustado = 0;
    
    void reajustarSalario(Colaborador colaborador, Double valorReajuste){
        
        if(valorReajuste < 0){
            System.out.println("Valor inválido!");
        }else{
            colaborador.setSalario(1400.0);
            this.totalSalarioReajustado++;
        }
        
    }
    
    void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario){
        
        if(colaborador.getSalario() >= novoSalario){
            System.out.println("Operação inválida!");
        }else{
            this.totalPromovidos++;
            colaborador.setSalario(novoSalario);
            colaborador.setCargo(novoCargo);
        }
    }
    
    
    public Integer getTotalPromovidos(){
        return this.totalPromovidos;
    }
    
    public Integer getSalarioReajuste(){
        return this.totalSalarioReajustado;
    }
    
}
