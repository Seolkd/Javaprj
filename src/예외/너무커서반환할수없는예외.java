package 예외;

public class 너무커서반환할수없는예외 extends Exception {
@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return "10000을 넘는 값이 반환되어서는 안되는 오류가 발생하였습니다.";
}
}
