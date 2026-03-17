import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[10];
        int k = 0; // posição do vetor 3

        System.out.println("Digite 10 números do vetor 1:");
        for (int i = 0; i < 10; i++) {
            v1[i] = sc.nextInt();
        }

        System.out.println("Digite 10 números do vetor 2:");
        for (int i = 0; i < 10; i++) {
            v2[i] = sc.nextInt();
        }

        // procurar números em comum
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (v1[i] == v2[j]) {
                    v3[k] = v1[i];
                    k++;
                    break;
                }
            }
        }

        System.out.println("Números em comum:");

        for (int i = 0; i < k; i++) {
            System.out.print(v3[i] + " ");
        }

        sc.close();
    }
}