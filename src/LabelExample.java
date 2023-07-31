/*
 * Label
 */
public class LabelExample {

	public static void main(String[] args) {
		// 레이블 선언 (올대문자로 쓰는것이 관례)
		OUT:
		for(int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
			
				System.out.println(i + ", " + j);
				
					if(j == 5) {
					
					//	break;
						break OUT;
					
				}
			}
			
		}

	}

}
