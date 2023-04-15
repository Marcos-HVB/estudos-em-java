package empresaex1;

public class Colaborador {

    private String nome;
    private String cargo;
    private Double salario;

    public String getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }   
    
    public void setNome(String nome) {
        this.nome = nome;
    }
     
     public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
