package carros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCarro {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        Carro carro1 = new Carro("Golf", 45000.0, 2000, "Volksvagen");
        Carro carro2 = new Carro("Uno", 4000.0, 2019, "Volksvagen");
        Carro carro3 = new Carro("Palio", 3000.0, 2020, "Renault");
        Carro carro4 = new Carro("Punto", 45000.0, 2005, "Ferrari");
        Carro carro5 = new Carro("Corsa", 45000.0, 2010, "Volksvagen");

        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);

        System.out.println("Ano maior que 2018: ");
        for (Carro carro : carros) {
            if (carro.getAno() > 2018) {
                System.out.println(carro);
            }
        }

        System.out.println("Valor menor que R$ 60.000,00: ");
        for (Carro carro : carros) {
            if (carro.getValor() < 60000) {
                System.out.println(carro);
            }
        }

        System.out.println("Marca Volksvagen: ");
        for (Carro carro : carros) {
            if (carro.getMarca().equals("Volksvagen")) {
                System.out.println(carro);
            }
        }
    }
}
