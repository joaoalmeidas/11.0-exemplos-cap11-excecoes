import java.util.Scanner;

public class DivididoPorZeroSemTratamento {
	
	public static int quociente(int numerador, int denominador) {
		
		return numerador / denominador;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Insira o numerador:");
		int numerador = input.nextInt();
		
		System.out.println("Insira o denominador:");
		int denominador = input.nextInt();
		
		int resultado = quociente(numerador, denominador);
		
		System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
	}

}
