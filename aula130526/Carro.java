import java.util.Scanner;

public class Carro implements Veiculo {
    public Carro(String modelo) {
    }

    @Override
    public void acelerar()      {
        System.out.println("Qual a intensidade da aceleração");
        Scanner sc = new Scanner(System.in);
        int intensidade = sc.nextInt();
        System.out.println("O carro acelerou com intensidade " + intensidade + "...");
        sc.close();
    }

 @Override
 public void frear()            {
        System.out.println("O carro está freando...");
    }
 
 @Override
 public String obterTipo()      {
    return "Carro";
   }
}