package atividadesbootcamp131123;

import java.util.Scanner;

public class vetorMATRIZ {

	public static void main(String[] args) {
		
		int matriz[][] = new int [3][3];
		int linha,coluna,somaDiagonal=0,somaDiagSec=0;
		
		Scanner ler = new Scanner(System.in);
		
		for (linha=0;linha<3;linha++){
			for(coluna=0;coluna<3;coluna++){
				System.out.println("\nEntre com um número: ");
				matriz[linha][coluna] = ler.nextInt();
				
				if (linha == coluna) {
					somaDiagonal += matriz[linha][coluna];
				}
				
				if ((linha+coluna)== 2) {
					somaDiagSec += matriz[linha][coluna];
				}
			}
		}
		
		System.out.println("\nSomatório diagonal principal: "+somaDiagonal);
		System.out.println("\nSomatório diagonal secundário "+somaDiagSec);

	}

}
