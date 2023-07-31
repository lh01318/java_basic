/*
 * 반복문 While
 */
public class WhileExample {
	public static void main(String[] args) {
		int index = 0;
		while(index < 10) {
			System.out.println("이현바보!!");
		index++;
	}
	
		// System.out.println(index);
		
		int oddSum = 0, evenSum = 0;
		
		index = 1;
		while (index <= 100) {
//			result = result = index;
			if (index % 2 == 0) {
				evenSum += index; //짝수
				
			} else { oddSum += index; //홀수

			}
				
			
			
			index++;					// 홀수짝수나누는거 퍼센트로...
			
		} 									
	
		System.out.println("짝수합" + evenSum);
		System.out.println("홀수합" + oddSum);
		System.out.println("누적합" + (oddSum + evenSum));
		
		
		
		index = 0;
		
		do {
			System.out.println("자바자바");
			index ++;
			
		} while (index < 10);
		
		
	}
	

}
