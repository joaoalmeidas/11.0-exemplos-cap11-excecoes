import java.util.Scanner;

public class AssertTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um número entre 1 e 10: ");
		int numero = input.nextInt();
		
		assert (numero >= 0 && numero <= 10) : "numero invalido" + numero;
		
		System.out.printf("Você inseriu %d%n", numero);

	}

}
