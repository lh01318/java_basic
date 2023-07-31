

/*
 * For 반복문
 */
public class ForExample {

	public static void main(String[] args) {

		for (int index = 0; index < 100; index++)
		// 1번 실행 ; 2번 실행 ; 참이면 3번 중괄호로 갔다가
		// 4번 index++ 증감한숫자로 2번 다시 실행 > 3번> 4번 반복
		{System.out.println("이현바보");} // 3번

		// 안에서 바깥 정보는 접근 가능한데 바깥에서 안의 정보 접근 불가

		int result = 0;

		for (int index = 1; index <= 100; index++) {
			result += index;
		}
		System.out.println(result);

//		중첩for문을 이용한 사각형 출력

		for (int i = 0; i < 5; i++) { // 행반복

			for (int j = 0; j < 5; j++) { // 열반복 ln 빼버림
				System.out.print('*');  // 안에있는 for문 반복과정이 끝나면 없어짐. i로 갔다가 0부터 재실행됨
			}
			System.out.println();
		}

		for (int i = 0; i < 10; i++) { 

			for (int j = 0; j <=i; j++) { 
				System.out.print(j + " ");  
			}
			System.out.println();
		}
		for (int i = 0; i < 10; i++) { 

			for (int j = 9; j >= i; j--) { 
				System.out.print(j + " ");  
			}
			System.out.println();
		}
		
//		중첩for문을 활용한 구구단 출력
		
		for (int i = 2; i < 10; i++) { 

			for (int j = 1; j < 10; j++) { 
				System.out.print(i+"*"+j+"="+ (i*j) + "\t");
			}
			System.out.println();
		}
		
		
	}

}
