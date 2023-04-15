
package empresa;

public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colab01 = new Colaborador("Xampson", "Estágio", 1000.0);
        colab01.setSalario(1000.0);
        
        Colaborador colab02 = new Colaborador("William", "Genrente", 10100.0);
        
        RecursosHumanos rh = new RecursosHumanos();
        
        rh.promoverColaborador(colab01, "Dev Jr.", 3500.0);
        rh.reajustaSalario(colab01, 500.0);
        
        rh.promoverColaborador(colab02, "Diretor", 9500.0);
        
        System.out.println(colab01);
        System.out.println(colab02);
        
        System.out.println(rh);
   
    }
}
