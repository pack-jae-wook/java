package test07_1;

import java.util.Arrays;

public class ObjectCopy2 {

	public static void main(String[] args) {

       //객체 배열 2개 생성
       Book[] bookArray1 = new Book[3];//원본 배열
       Book[] bookArray2 = new Book[3];//대상 배열	
	   
       System.out.println("bookArray1[]=" + Arrays.toString(bookArray1));
       System.out.println("bookArray2[]=" + Arrays.toString(bookArray2));
       System.out.println("---------------");
       bookArray1[0] = new Book("태백산맥","조정래");
       bookArray1[1] = new Book("데이얀","헤르만 헤세");
       bookArray1[2] = new Book("어떻게 살 것인가","유시민");
       
       System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
       
       for (int i = 0; i < bookArray2.length; i++) {
    	
    	 System.out.print("bookArray1["+i+"]=");   
    	 System.out.println(bookArray1[i]);   
		bookArray2[i].show();
	  }
       System.out.println("--------------");
       
       //객체 멤버 데이터값 수정
       bookArray1[0].setBookName("나목");
       bookArray1[0].setBookName("박완서");
       for (int i = 0; i < bookArray1.length; i++) {
       	
      	 System.out.print("bookArray1["+i+"]=");   
      	 System.out.println(bookArray1[i]);   
  		bookArray1[i].show();
  	  }
         System.out.println("--------------");
	}

}
