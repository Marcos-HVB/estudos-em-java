
package petshop;


public class PetShop {
    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }
    
    public void darBanho(Pet pet, Double valor){
        if(valor > 0){
            pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valor);
            pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
            faturamentoTotal += valor;
        }else
            System.out.println("Valor inválido");
    }
    
    public void darBanho(Pet pet, Double valor, Integer desconto){
         if(valor > 0 && desconto > 0){
            Double descontoPorcentagem = new Double(desconto) / 100;
            pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + (valor * descontoPorcentagem));
            pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
            faturamentoTotal += (valor * descontoPorcentagem);
        }else
            System.out.println("Valor inválido");
    }

    @Override
    public String toString() {
        return String.format("PetShop: \nNome: %s\nfaturamento Total: %.2f",nome, faturamentoTotal);
    }
    
    
}
