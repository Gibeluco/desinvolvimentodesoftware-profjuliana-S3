import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        System.out.println("Digite 10 números para o vetor 1:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite 10 números para o vetor 2:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = sc.nextInt();
        }

        System.out.println("Interseção dos vetores:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (vetor1[i] == vetor2[j]) {

                    boolean repetido = false;

                    for (int k = 0; k < i; k++) {
                        if (vetor1[i] == vetor1[k]) {
                            repetido = true;
                        }
                    }

                    if (!repetido) {
                        System.out.print(vetor1[i] + " ");
                    }
                }
            }
        }

        sc.close();
    }
}