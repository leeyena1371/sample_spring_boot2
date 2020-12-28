package com.sample.test;


import java.util.ArrayList;
import java.util.Arrays;

public class test {
	
	public static void main(String[] args) throws Exception {
		
		test fetcher = new test();
		
		fetcher.run();
	}
	private void run() throws Exception {

		
		try {
			String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
			String[] completion = {"josipa", "filipa", "vinko", "nikola"};

			String result = solution(participant,completion);
			System.out.println("result  :"+result);

		} catch (Exception e) {
			System.out.println("======= 에러 ======="+e.getMessage());
		}
	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		ArrayList<String>  fruits = new ArrayList<>(Arrays.asList(participant));
		for (int i = 0; i < fruits.size()-1; i++) {
			if (!fruits.get(i).equals(completion[i])) {
				answer = fruits.get(i);
				break;
			}
		}
		if("".equals(answer)){
			answer = fruits.get(fruits.size()-1);
		}
		return answer;
	}
}
