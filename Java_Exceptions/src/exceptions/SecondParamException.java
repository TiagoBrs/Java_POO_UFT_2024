package exceptions;

public class SecondParamException extends RuntimeException{
	
	public SecondParamException(String msg) {
		super(msg);
	}
	
	public SecondParamException(String msg, Throwable t) {
		super(t);
	}
	
	public SecondParamException() {
		super("Error! Param1 > Param2");
	}
	
}
