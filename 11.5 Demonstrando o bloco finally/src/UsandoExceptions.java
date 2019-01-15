
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
			
			System.out.println("M�todo throwException.\n");
			throw new Exception();
			
		}catch(Exception exception) {
			
			System.err.println("Exception tratada no m�todo throwException().");
			throw exception;
			
		}finally {
			
			System.err.println("Finally executado no m�todo throwException().");
			
		}
		
	}
	
	public static void doesNotThrowException(){
		
		try {
			
			System.out.println("M�todo doesNotThrowException.");
			
		}catch(Exception exception) {
			
			System.err.println("Exception tratada no m�todo throwException().");
			
		}finally {
			
			System.err.println("Finally executado no m�todo doesNotThrowException().");
			
		}
		
		System.out.println("Fim da execu��o do M�todo doesNotThrowException.");
		
	}

}
