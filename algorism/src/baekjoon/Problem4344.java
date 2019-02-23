package baekjoon;

import java.util.Scanner;

public class Problem4344 {
	static int total;
	
	static int totalScore;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = Integer.parseInt(s.nextLine());
		// 첫번째 입력만큼 for문 돌려주기. 
		for(int i=0; i<num; i++) {
			/* total : 점수의 갯수 
			 * totalScore : 점수의 합  
			 * for문 끝날때마다 0으로 다시 초기화 해주어야한다.
			 */
			total = 0; totalScore = 0;
			String str = s.nextLine();
			
			calAverage(str);
		
		}
		
	
		
	}
	// 평군구하는 함수
	static private void calAverage(String str) {
		
		//3 10 20 30 을 " " 공백으로 split해서 배열로 담기 .
		String[] strArray = str.split(" ");
		int num = 0;
		// 총 검사할 인원은 항상 0번째 배열에담겨있다.
		// parseInt 함수를 써서 String -> Int로 변환 작업
		total += Integer.parseInt(strArray[0]);
		
		/* split한 배열중 0번째는 총 인원수.
		 * 1번째부터 마지막 배열은 점수의 관한 배열이므로 
		 * 하나하나씩 더해준다.
		 */
		for(int i=1; i<strArray.length; i++) {
			totalScore += Integer.parseInt(strArray[i]);
		}
		
		/* totalScore/total 는 그 줄의 관한 평균 
		 * 만약 1~마지막배열 까지 평균과 비교해서 그 평균을 넘으면 
		 * num 변수를 ++ 해준다.
		 */
		for(int i=1; i<strArray.length; i++) {
			if(Integer.parseInt(strArray[i]) > totalScore/total) {
				num++;
			}
		}
		/* 평균이넘은 점수의 갯수 / 배열의길이 -1 (첫번째배열은몇개 입력할것인지 이기때문에.)
		 *  * 100 으로 출력해주면 된다. 
		 */
		System.out.printf("%.3f%% \n",(double)num / ((double)strArray.length-1)* 100);
		
	}
	

}
