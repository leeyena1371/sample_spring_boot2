package com.sample.test;


import java.util.Arrays;

public class test6 {

	public static void main(String[] args) throws Exception {

		test6 fetcher = new test6();

		fetcher.run();
	}
	private void run() throws Exception {


		try {
			int[] a = {1, 3, 6, 4, 1, 2};

			int result = solution(a);
			System.out.println("result  :"+result);

		} catch (Exception e) {
			System.out.println("======= 에러 ======="+e.getMessage());
		}
	}
	public int solution(int[] A) {
		// write your code in Java


		Arrays.sort(A);
		int temp = 0;
		for(int i=0; i< A.length; i++){
			if (A[i] > 0 && A[i] <= 100000)
			{
				System.out.println("A[i]:: "+A[i]);
				if(temp == 0 || temp == A[i]){
					temp = A[i];
				}else if(temp+1 == A[i]){
					temp = A[i];
				}else if(temp+1 != A[i]){
					break;
				}
				System.out.println("temp:: "+temp);
			}
		}


		System.out.println("temp:: "+temp);
		return temp+1;
	}

}
