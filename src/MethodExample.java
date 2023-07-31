import java.util.Iterator;

/*
 *  메소드(함수) 정의 및 사용
 */
public class MethodExample {
	
	/*
	 * 구구단을 출력하는 메소드 정의
	 */
	static void printGugudan() {
		for (int i = 2; i < 10; i++) { 

			for (int j = 1; j < 10; j++) { 
				System.out.print(i+"*"+j+"="+ (i*j) + "\t");
			}
			System.out.println();
		}
		
	}
	
	/*
	 * 단을 입력 받아 해당 단을 출력하는 기능
	 */			//매개변수
	static void printDan(int dan){
		for (int i = 1; i < 10 ; i++) {
			System.out.print( dan + "*" + i +"=" + (dan*i) + "\t");
			
		}
		System.out.println();
	}
	
	
	/*
	 * 두개의 정수를 전달 받아 해당 정수에 합을 반환 기능
	 * 타입과 리턴값이 같아야함 예) char는 int와 불가능. double 은 int와 가능
	 */
	
	static int sum (int x,int y) {
//		return;
		return x + y;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("구구단 출력하기");
		
		//구구단 출력 메소드를 호출 (재사용가능)
		printGugudan();
		System.out.println("프로그램~~~~~~"); 
		printGugudan();
		
//		5단출력
		System.out.println("프로그램~~~~~~"); 
		System.out.println("프로그램~~~~~~"); 
		System.out.println("프로그램~~~~~~"); 
		System.out.println("프로그램~~~~~~"); 
		
		printDan(5);
		
		int x = 500, y = 100;
	
		int result = sum(x, y);
		
		System.out.println(result);
		
		System.out.println(sum(5, 10));
		System.out.println(15);
	}

}
