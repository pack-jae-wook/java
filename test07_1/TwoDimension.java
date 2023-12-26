package test07_1;

import java.util.Arrays;

public class TwoDimension {

	public static void main(String[] args) {
		
		//2차원 배열의 생성과 동시에 데이터값을 초기화 시키는 방법
		int [][]arr = {
				
				
		  //[0]열, [1]열, [2]열		
			{100,200,300},//0행
			{400,500,600} //1행
				
		};
		
		//이중 for문으로 2차원 배열 출력하기
        //이중 for문의 특징 : 바깥 for문이 1번 수행될동안 안쪽 for문은 반복횟수를 모두 수행해야 한다.
		
		int i,j;//초기화 변수
		
		for (i= 0; i < 2; i++) { //1번 수행될 동안
			
			for (j= 0; j < 3; j++) { //1번 수행될 동안
				
				System.out.print("arr["+i+"]["+j+"]=");
				System.out.println(arr[i][j]);
				
			}	
			
		}
		System.out.println("------------------------------");
		
		//2차원 배열 요소값 수정과 출력
        
		arr [0][1] =2000;
		System.out.println("1차원 배열 출력="+Arrays.toString(arr));
		System.out.println("2차원 배열 출력="+Arrays.deepToString(arr));
		System.out.println("------------------------------");
		
		
		
		System.out.println("행의 개수: arr.length=" + arr.length);
		
		//각 행이 가지고 있는 열의 개수
		System.out.println("0행의 열의 개수 arr[0].length="+ arr[0].length);
		System.out.println("1행의 열의 개수 arr[1].length="+ arr[1].length);
		System.out.println("------------------------------");
		
		for ( i = 0; i < arr.length; i++) {
			for( j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"]=");
				System.out.println(arr[i][j]);
				
			}
			
		}
		
		System.out.println("-------------------------------");
	}

}
