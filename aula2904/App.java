import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n------ POLIMORFISMO com Animais ----- \n");
        // Animal animais[] = new Animal[10];
        ArrayList<Animal> animaisList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String menu = "1 - Cadastrar animais \n" + 
                      "2 - Listar animais \n" + 
                      "3 - Mover Animal \n" + 
                      "4 - Editar Animal \n" +
                      "0 - Sair \n Digite sua opção: \n";
        int option = 0;
        View objView = new View();
        do {
            System.out.println(menu);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Animal animal = objView.cadastraAnimal(sc);
                    if (temp != null) {
                      animaisList.add(temp)
                    }
                    System.out..println("temos' " + animaisList.size() + " animais cadastrados.");
                    break;
                case 2:
                    System.out.println("Lista de Animais:");
                    for (Animal a : animaisList) {
                        System.out.println(a);
                        System.out.println("-------------------");
                    }
                    break;
                case 3:
                    // Lógica para mover um animal específico
                    break;
                case 4:
                    // Lógica para editar um animal específico
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);