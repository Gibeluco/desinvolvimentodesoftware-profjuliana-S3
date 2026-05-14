import java.util.Scanner;

public class Bicicleta implements Veiculo {
    private String estrada; // "Montanha" ou "Estrada"

    public Bicicleta(String estrada) {
        this.estrada = estrada;
    }

    @Override
    public void acelerar() {
        System.out.println("Qual a intensidade da aceleração");
        Scanner sc = new Scanner(System.in);
        int intensidade = sc.nextInt();
        System.out.println("A bicicleta tipo " + estrada + " acelerou com intensidade " + intensidade + "...");
        sc.close();
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta tipo " + estrada + " está freando...");
    }

    @Override
    public String obterTipo() {
        return "Bicicleta";
    }
}