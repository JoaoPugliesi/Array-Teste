import java.util.Scanner;

public class ArrayTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		System.out.print("Digite quantos elementos terá o vetor: ");		
		int num = input.nextInt();
		System.out.println("");
		
		int valores [] = new int[num];
		
		for ( int i = 0; i< valores.length; i++){
			System.out.print("Digite o valor dos elementos: ");
			System.out.print("");
			int valor = input.nextInt();
				
				
			
			valores [i] = i;
			System.out.print("Índice: " + valores[i] + " recebe o valor " + valor + " multiplicado por 2: ");
			valor *= 2;
			System.out.println( valor );
			System.out.println("");
			
			soma = soma + valor;
		}
		System.out.println("A soma dos novos elementos multiplicados por 2 é: " +soma);
	}

}
