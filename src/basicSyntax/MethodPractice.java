package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 36;
		int b = 12;
		
		show(add(a, b));
		show(sub(a, b));
		show(mul(a, b));
		show(div(a, b));
	}
	
	public static void show(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
	
	public static int add(int a, int b) {
		return(a + b);
	}
	
	public static int sub(int a, int b) {
		return(a - b);
	}
	
	public static int mul(int a, int b) {
		return(a * b);
	}
	
	public static int div(int a, int b) {
		return(a / b);
	}

}
