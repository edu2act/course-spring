package simpletypeconstructdi;

public class MathUtil {
	private int num1;
	private String num2;

	public MathUtil(int num1, String num2) {
		this.num1 = num1;
		this.num2 = num2 + 3;
	}
	
	public void show(){
		System.out.println(num1+"::"+num2);
	}
}
