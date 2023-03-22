import java.util.Scanner;
public class Operator2 {
	public static void main (String[] args) {
		/**사칙연산(+,=,*,/)계산기(2)**/
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		String m = scanner.next();
		String op = scanner.next();
		String n = scanner.next();
		float num1 = Float.parseFloat(m);
		float num2 = Float.parseFloat(n);
		float result = 0.0f;
		
		switch (op) {
		case "+": 
			result = num1 + num2;
			break;
		case "-": 
			result = num1 - num2;
			break;
		case "*": 
			result = num1 * num2;
			break;
		case "/": 
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}
			else {
			result = num1 / num2;
			break;
			}
		}
		System.out.println(m+op+n+"의 계산 결과는 "+result);
		scanner.close();
	}
}
