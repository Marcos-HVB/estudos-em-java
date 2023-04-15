
package frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Frutas {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        List<String> frutas = new ArrayList<>();
        
        frutas.add("melância");
        frutas.add("morango");
        frutas.add("laranja");
        frutas.add("manga");
        
        System.out.println("Digite o nome de uma fruta: ");
        String frutaEscolhida = leitor.nextLine().toLowerCase();
        Boolean frutaExiste = true;
        
        for(String fruta : frutas){
            if(fruta.equals(frutaEscolhida)){
                System.out.println(String.format("A fruta %s existe na lista", frutaEscolhida));
                frutaExiste = false;
                break;
            }
        }

        if(frutaExiste){
            System.out.println(String.format("Não existe a fruta %s na lista.", frutaEscolhida));
        }
        
    }
}
