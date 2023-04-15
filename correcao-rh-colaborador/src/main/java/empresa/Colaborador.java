
package empresa;


public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;
    
    // Construtor:
    // sempre é public
    // sempre tem o msm nome que a classe
    // Nunca possui retorno especificado

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0.0;
    }
  

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Colaborador: \nNome: %s \nCargo: %s \nSalário: %.2f\n", nome, cargo,salario);
   
               
    }
    
    
    
}
