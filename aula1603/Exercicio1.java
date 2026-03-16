import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = {5, 12, 8, 20, 3, 15, 7, 9, 25, 11};

        System.out.println("Valores do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nDigite o valor mínimo:");
        int min = sc.nextInt();

        System.out.println("Digite o valor máximo:");
        int max = sc.nextInt();

        boolean encontrou = false;

        System.out.println("Valores entre " + min + " e " + max + ":");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= min && numeros[i] <= max) {
                System.out.print(numeros[i] + " ");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum valor encontrado nesse intervalo.");
        }

        sc.close();
    }
}