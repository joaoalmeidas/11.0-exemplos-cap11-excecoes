
public class UsandoExceptions {
	
	public static void main(String[] args) {
		
		try {
			
			throwException();
			
		}catch(Exception exception) {
			
			System.err.println("Exception tratada no main.");
			
		}
		
		doesNotThrowException();
		
	}
	
	public static void throwException() throws Exception{
		
		try {
			
			System.out.println("Método throwException.\n");
			throw new Exception();
			
		}catch(Exception exception) {
			
			System.err.println("Exception tratada no método throwException().");
			throw exception;
			
		}finally {
			
			System.err.println("Finally executado no método throwException().");
			
		}
		
	}
	
	public static void doesNotThrowException(){
		
		try {
			
			System.out.println("Método doesNotThrowException.");
			
		}catch(Exception exception) {
			
			System.err.println("Exception tratada no método throwException().");
			
		}finally {
			
			System.err.println("Finally executado no método doesNotThrowException().");
			
		}
		
		System.out.println("Fim da execução do Método doesNotThrowException.");
		
	}

}
