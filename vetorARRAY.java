package atividadesbootcamp131123;

import java.util.Scanner;

public class vetorARRAY {

    public static void main(String[] args) {
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número que você deseja encontrar: ");
        int numeroProcurado = leia.nextInt();

        int posicao = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroProcurado) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
        }
    }
}
