package test07_1;

public class ObjectCopy3 {

	public static void main(String[] args) {
		
		//객체 배열 생성
		Book[]bookArray1 = new Book[3];
		Book[]bookArray2 = new Book[3];
		
		//bookArray1 배열
        bookArray1[0] = new Book("태백산맥","조정래");
        bookArray1[1] = new Book("데미안","헤르만해세");
        bookArray1[2] = new Book("어떻게 살 것인가","유시민");
		
        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();
        
        for(int i = 0; i< bookArray1.length; i++) {
        	bookArray2[i].setBookName(bookArray1[i].getBookName());
        	bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }
        for(int i = 0; i< bookArray1.length; i++) {
        	bookArray2[i].show();
        	
        }
        System.out.println("----------------------------");
        for(int i = 0; i< bookArray2.length; i++) {
        	bookArray2[i].show();
        	
        }
        //bookArray1 첫 번째 배열 요소값 수정과 출력
        //bookArray1 배열 요소값만 수정되고 bookArray2 배열 요소값은 수정되지 않는다.!!!
        bookArray1[0].setBookName("나목"); 
        bookArray1[0].setBookName("박완서");
        
        System.out.println("=== bookArray1 ===");
        for(int i = 0; i < bookArray1.length; i++) {
        	bookArray1[i].show();//bookArray1 배열 요소값 출력
        	
        }
        
        for(Book book:bookArray1) {
        	System.out.println(book);
        	System.out.println(book.getBookName());
        	System.out.println(book.getAuthor());
        	
        }
        
        System.out.println("=== bookArray2 ===");
        for(int i = 0; i < bookArray2.length; i++) {
        	bookArray2[i].show();
        	
        }
        
        
	}

}
