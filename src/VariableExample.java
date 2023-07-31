class VariableExample {
	public static void main(String[] args) {
		// 변수는 프로그램에서 사용하는 데이터를 저장하기 위한 메모리 공간
		// 변수를 사용하는 목적은 데이터를 재사용하기 위해서
		// 변수 선언
		String name;//데이타타입//

		int age;

		double weight;

		//변수 초기화
		name = "이현";

		age = 30;

		weight = 69.5;
		
		//변수 사용

		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);

		// 변수의 값 수정(update)

		name = "홍길동";

		age = 40;

		weight = 70.5;

		System.out.println(name);
		System.out.println(age);
		
		int age2;
		// 변수에 변수의 값 할당
		age2 = age;

		System.out.println(age2);
		
		// 변수선언과 할당을 한방에...

		int score = 95;
		
		int a = 10, b = 20, c = 30, d = 40, e = 50;


		System.out.println(e);

		// 초기화 되지 않은 변수는 사용할 수 없다...

		int x;
		
		String firstName = "이"; //카멜표기법 권장

		String LastName =  "현";

		//자바예악어(키워드)는 변수명으로 사용할 수 없다.
	
		
		String 이름 = "홍길동";

		System.out.println(이름);
		

	}

}

																																																																																																					