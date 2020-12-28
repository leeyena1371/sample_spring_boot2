package com.sample.test;


import java.util.Arrays;

public class test2 {
	
	public static void main(String[] args) throws Exception {
		
		test2 fetcher = new test2();
		
		fetcher.run();
	}
	private void run() throws Exception {

		
		try {
			String[] phone_book = {"119", "97674223", "1195524421"};

			boolean result = solution(phone_book);
			System.out.println("result  :"+result);

		} catch (Exception e) {
			System.out.println("======= 에러 ======="+e.getMessage());
		}
	}

	public boolean solution(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);

		/*for(int i=1; i< phone_book.length; i++){
			//for(int j=i+1; j< phone_book.length; j++){
				if(phone_book[i].startsWith(phone_book[0])){
					answer=false;
					break;
				}
			//}
		}*/

		for(int i=0; i<phone_book.length-1; i++) {
			for(int j=i+1; j<phone_book.length; j++) {
				if(phone_book[i].startsWith(phone_book[j])) {return false;}
				if(phone_book[j].startsWith(phone_book[i])) {return false;}
			}
		}

		return true;
	}
}
