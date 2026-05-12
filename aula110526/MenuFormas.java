import java.util.Scanner;

public class MenuFormas {
    private Scanner sc;

    public MenuFormas() {
        sc = new Scanner (System.in);
    }
    public void encerraSistema(){
        sc.close();

    }

    public int exibirMenu(){
        String texto = "----FORMAS 2D----\n" +
                        "1 - Cadastrar Forma\n" +
                        "2 - Listar Formas\n" +
                        "3 - Calcular Área\n" +
                        "4 - Sair\n" +
                        "Escolha uma opção: ";
                        "-------------------";
    System.out.print(texto);
    return sc.nextInt();

    }

    public Forma2D cadastraForma2D(){
        System.out.println("Qual forma deseja cadastrar? (1 - Circulo \n" +
                            "2 - Triangulo \n" +
                            "3 - Retangulo \n" +
                            "4 - Quadrado  \n");
        int optionForma = sc.nextInt();
        System.out.println("Digite o nome da forma: ");
        String nome = sc.next();
        System.out.println("Digite a altura da forma:");
        double altura = sc.nextDouble();
        System.out.println("Digite a largura da forma:");
        double largura = sc.nextDouble();
        switch (optionForma) {
            case 1:
                Circulo c = new Circulo(altura, nome);
                return c;
           case 2:
             if(altura == largura){
                Retangulo r = new Retangulo(largura, altura, nome);
                return r;
             }else{
                Retangulo r = new Retangulo(altura, largura);
                return r;
             }
            case 3:
                System.out.println("Digite o estilo do triangulo;");
                String estilo = sc.next();
                Triangulo t = new Triangulo(estilo, largura, altura);
                return t;
            default;
               break;
            }
        return null;

    }
}
