/*
 * 조건(분기)문 Switch
 */
public class SwitchExample {
	public static void main(String[] args) {
		
		
		
		/*
		 * switch문은 break;를 써줘야함 
		 * break;는 이동문 중괄호 바깥으로 이동시킴 -필수는 아니고 옵션으로..-
		 */
		
		int num = 7;
		
		switch (num) {
		case 1: System.out.println("1입니다..");
		case 2: System.out.println("2입니다..");break;
		case 3: System.out.println("3입니다..");break;
		case 4: System.out.println("4입니다..");break;
		case 5: System.out.println("5입니다..");break;
			
		default: System.out.println("일치하는 값이 없습니다");
		
		}
		
		String some = "이현";
		switch (some) {
		case "이현": System.out.println("이현입니다..");break;
		case "김현": System.out.println("김현입니다..");break;
		case "박현": System.out.println("박현입니다..");break;
		case "최현": System.out.println("최현입니다..");break;
		case "정현": System.out.println("정현입니다..");break;
			
		default: System.out.println("일치하는 값이 없습니다");
		
		}
			
		int score = 88;
		
		switch (score/10) {
			case 10: 
			case 9: System.out.println("수");break;
			case 8: System.out.println("우");break;
			case 7: System.out.println("미");break;
			case 6: System.out.println("양");break;
		
			default: System.out.println("가");
			}

		int x = 50, y = 30;
		char operator = '*';
		
		
		switch (operator) {
			case '+': System.out.println("덧셈 = " + (x + y)); break;
			case '-': System.out.println("뺄셈 = " + (x - y)); break;
			case '*': System.out.println("곱셈 = " + (x * y)); break;
			case '/': System.out.println("나눗셈 = " + (x / y)); break;
			

			default:
			break;
		}
		
		
	}
	

}
