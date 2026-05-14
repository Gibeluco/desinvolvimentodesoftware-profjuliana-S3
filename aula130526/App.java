import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Fiat Uno"));
        veiculos.add(new Bicicleta("Caloi"));
        veiculos.add(new Caminhao(10.0));

        for (Veiculo veiculo : veiculos) {
            System.out.println("Tipo do veículo: " + veiculo.obterTipo());
            veiculo.acelerar();
            veiculo.frear();
            System.out.println();
        }
    }
}