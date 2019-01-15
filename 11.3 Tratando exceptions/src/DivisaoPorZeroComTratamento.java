import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoPorZeroComTratamento {
	
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		
		return numerador / denominador;
	
	}
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean continuaLoop =  true;
		
		do {
			
			try {
				
				System.out.println("Insira o numerador:");
				int numerador = input.nextInt();
				
				System.out.println("Insira o denominador:");
				int denominador = input.nextInt();
				
				int resultado = quociente(numerador, denominador);
				
				System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
				continuaLoop = false;
			}catch (InputMismatchException inputMismatchException){
				
				System.err.printf("%nException: %s%n", inputMismatchException);
				input.nextLine();
				System.out.printf("Os números precisam ser do tipo inteiro. Tente novamente.%n%n");
				
			}catch (ArithmeticException arithmeticException){
				
				System.err.printf("%nException: %s%n", arithmeticException);
				System.out.printf("Zero é um operador inválido. Tente novamente.%n%n");
				
			}
			
		}while(continuaLoop == true);
		
		
		
		
		

	}

}
