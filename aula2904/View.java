import java.util.Scanner;

public class View {
   public Animal cadastraAnimal(Scanner sc){
    System.out.println("Digite o tipo do animal: 1-Animal 2-Peixe 3-Passaro 4-Anfibio");
    int tipoAnimal = sc.nextInt();
    System.out.println("Digite o nome do animal");
    String nome = sc.next(); //
    System.out.println("Digite a quantidade de patas do animal");
    int patas = sc.nextInt();
    System.out.println("Digite a velocidade do animal");
    double velocidade = sc.nextDouble();
    System.out.println("Digite um valor inteiro de localização");
    int localizacao = sc.nextInt();

    switch (tipoAnimal){
        case 1:
            return new Animal(nome, patas, velocidade, localizacao);
        case 2:
            System.out.println("Digte em qual tipo de água este peixe vive\n"+
                               "0 - água doce \n1 - água salgada");
            int agua = sc.nextInt();
            return new Peixe(nome, patas, velocidade, localizacao, agua);
        case 3:
            return new Ave(nome, patas, velocidade, localizacao);
        case 4:
            return new Anfibio(nome, patas, velocidade, localizacao);
        default:
            System.out.println("Tipo de animal inválido. Cadastro cancelado.");
            return null;
    }
   }
}