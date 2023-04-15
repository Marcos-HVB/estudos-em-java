
package empresa;

public class RecursosHumanos {
    private Integer totalPromocoes;
    private Integer totalSalariosReajustados;

    public RecursosHumanos() {
        this.totalPromocoes = 0;
        this.totalSalariosReajustados = 0;
    }

 
    public void reajustaSalario(Colaborador colaborador, Double novoSalario){
       if(novoSalario > 0){
            Double salarioAtual = colaborador.getSalario();
            colaborador.setSalario(novoSalario + salarioAtual);
            totalSalariosReajustados++;
       }else
            System.out.println("Valor inválido");
    }
    
    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario){
        if(novoSalario > colaborador.getSalario() && !novoCargo.equals(colaborador.getCargo())){
            colaborador.setSalario(novoSalario);
            colaborador.setCargo(novoCargo);
            totalPromocoes++;
        }else
            System.out.println("Operação inválida!");
    }
    
    public Integer getTotalPromocoes() {
        return totalPromocoes;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    @Override
    public String toString() {
        return String.format("Recursos Humanos: \nTotal de Reajustes: %d \nTotal de Promoçoes: %d", totalSalariosReajustados, totalPromocoes);
    }

    
}
