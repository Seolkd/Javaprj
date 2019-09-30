package 예외;

public class Calculator {
	//API
	public static int add(int x, int y) throws 너무커서반환할수없는예외 {
	int result = x + y;
	
	if(result > 10000)
		throw new 너무커서반환할수없는예외();
	
	return result;
	}

public static int sub(int x, int y) {
	int result = x-y;
	return result;
	}
public static int div(int x, int y) {
	int result = x/y;
	return result;
	}
	

}
