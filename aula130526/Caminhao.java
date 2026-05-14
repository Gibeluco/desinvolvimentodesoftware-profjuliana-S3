public class Caminhao implements Veiculo {
    private double capacidadeCarga;

    public Caminhao(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão com capacidade de " + capacidadeCarga + " toneladas está acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("O caminhão com capacidade de " + capacidadeCarga + " toneladas está freando...");
    }

    @Override
    public String obterTipo() {
        return "Caminhão";
    }
}