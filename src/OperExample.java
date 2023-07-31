/*
 * 자바에서 지원하는 연산자들
 */
public class OperExample {

	public static void main(String[] args) {
		int x = 30, y = 5;
		
		// 산술연산자
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y); // 나머지 연산자
		
//		+ 연산자 오버로딩(중복정의)
		System.out.println(10 + 50);
		System.out.println("이현" + "바보");
		System.out.println(10 + 50 + "이현"   );
		System.out.println("이현" + 10 + 50);
		System.out.println("이현" + (10 + 50));
		
//		복합대입연산자(+=, -=, *=, /=, %=)
		
//		x = x + 5;
		x += 5;
		System.out.println(x);
		x -= 5;
		System.out.println(x);
		x *= 5;
		System.out.println(x);
		x /= 5;
		System.out.println(x);
		
		x = 10;
		y = 5;
		
//		비교연산자(==, !=, >, >=, .....)
		
		System.out.println(x==y); // 같으면 true
		System.out.println(x!=y); // 부정,같지않으면 true
		System.out.println(x>y);
		System.out.println(x>=y);
		
//		증감연산자 (++, --);
		
//		x = x+1;
//		x += 1;
		x ++;
		
		System.out.println(x);
		x--;
		System.out.println(x);
		
		
		x = 10;
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		
		x = 10;
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		
		x =  30;
		y = 50;
		
		System.out.println(x >= 30 && y <= 50); // x와 y가 모두 true인 경우 true
		System.out.println(x < 30 && y <= 50); // x와 y가 모두 true인 경우 true 얘는 false
		System.out.println(x <30 || y <= 50); // 과 중 둘 중 하나 이상이 true인 경우 true
		System.out.println(!true);
		
		
//		조건삼항연산자 
		int score = 85;
		
		String result = score >= 60 ? "통과 " : "실패";
		
		System.out.println(result);
		
//		기본데이터타입 형변환
//		자동형변환(프로모션 - 업캐스팅)
		double some = 50; // 자동형변환으로 안넘어가려면 50.0으로 기입해야함
		
//		강제형변환(디모션 - 다운캐스팅)
		double avg = 85.35344; //출력할때 소수점을 잘라내고 싶다면
		System.out.println(avg);
		System.out.println((int)avg);
		
		int avg2 = (int)avg; 
		
		System.out.println(avg2);
		
		
		
		
		
		
		
		
		
	}

}





