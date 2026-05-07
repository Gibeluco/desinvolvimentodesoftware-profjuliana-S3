import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Forma2D> formas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Triangulo tri = new Triangulo();
        tri.setLargura(5);
        tri.setAltura(3);
        formas.add(tri);

        Retangulo ret = new Retangulo();
        ret.setLargura(4);
        ret.setAltura(2);
        formas.add(ret);

        Circulo circ = new Circulo();
        circ.setRaio(2.5);
        formas.add(circ);

        do {
            System.out.println("\nMenu de cadastro de formas");
            System.out.println("1 - Cadastrar Triângulo");
            System.out.println("2 - Cadastrar Retângulo");
            System.out.println("3 - Cadastrar Círculo");
            System.out.println("4 - Mostrar áreas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Triangulo novoTri = new Triangulo();
                    System.out.print("Largura do triângulo: ");
                    novoTri.setLargura(scanner.nextDouble());
                    System.out.print("Altura do triângulo: ");
                    novoTri.setAltura(scanner.nextDouble());
                    formas.add(novoTri);
                    break;
                case 2:
                    Retangulo novoRet = new Retangulo();
                    System.out.print("Largura do retângulo: ");
                    novoRet.setLargura(scanner.nextDouble());
                    System.out.print("Altura do retângulo: ");
                    novoRet.setAltura(scanner.nextDouble());
                    formas.add(novoRet);
                    break;
                case 3:
                    Circulo novoCirc = new Circulo();
                    System.out.print("Raio do círculo: ");
                    novoCirc.setRaio(scanner.nextDouble());
                    formas.add(novoCirc);
                    break;
                case 4:
                    if (formas.isEmpty()) {
                        System.out.println("Nenhuma forma cadastrada.");
                    } else {
                        System.out.println("\nFormas cadastradas e suas áreas:");
                        for (Forma2D forma : formas) {
                            System.out.printf("%s - Área: %.2f%n",
                                    forma.getClass().getSimpleName(),
                                    forma.area());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Encerrando programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}