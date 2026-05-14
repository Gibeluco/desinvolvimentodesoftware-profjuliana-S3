import java.util.ArrayList;
import java.util.List;


interface Veiculo 
    void acelerar();
    void frear();
    String obterTipo();
}


class Carro implements Veiculo {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro " + modelo + " está freando.");
    }

    @Override
    public String obterTipo() {
        return "Carro";
    }
}


class Bicicleta implements Veiculo {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void acelerar() {
        System.out.println("A bicicleta do tipo " + tipo + " está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta do tipo " + tipo + " está freando.");
    }

    @Override
    public String obterTipo() {
        return "Bicicleta";
    }
}

class Caminhao implements Veiculo {
    private double capacidadeCarga;

    public Caminhao(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão com capacidade de "
                + capacidadeCarga + " toneladas está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O caminhão com capacidade de "
                + capacidadeCarga + " toneladas está freando.");
    }

    @Override
    public String obterTipo() {
        return "Caminhão";
    }
}

public class TestaVeiculos {
    public static void main(String[] args) {


        List<Veiculo> veiculos = new ArrayList<>();


        veiculos.add(new Carro("Fusca"));
        veiculos.add(new Bicicleta("Montanha"));
        veiculos.add(new Caminhao(15.5));


        for (Veiculo v : veiculos) {
            System.out.println("Tipo: " + v.obterTipo());
            v.acelerar();
            v.frear();
            System.out.println("-------------------");
        }
    }
}