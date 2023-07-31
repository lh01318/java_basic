import java.util.Iterator;

public class test1 {

	public static void main(String[] args) {
			// 배열 변수 선언과 배열 생성
			String[] sesason = {"Spring","summer","Fall","Winter"};
			
			//배열의 항복값 읽기
			
			System.out.println("sesason[0] :" + sesason[0]);
			System.out.println("sesason[1] :" + sesason[1]);
			System.out.println("sesason[2] :" + sesason[2]);
			System.out.println("sesason[3] :" + sesason[3]);
			
			//인덱스 1번 항목의 값 변경
			
			sesason[1] = "여름";
			
			System.out.println(sesason[1]);
			
			int[] scores = {90,93,50};
			
			int sum = 0;
			
			for (int i = 0; i < scores.length; i++) {
				
				sum += scores[i]; 
			}
			System.out.println("총합 :" + sum);
			double avg = (double)sum/scores.length;
			System.out.println("평균 :" + avg);
			
			
			
			
		
		}

	

}
