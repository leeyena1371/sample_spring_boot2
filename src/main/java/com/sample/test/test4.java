package com.sample.test;


import java.util.HashMap;
import java.util.Map;

public class test4 {
	
	public static void main(String[] args) throws Exception {
		
		test4 fetcher = new test4();
		
		fetcher.run();
	}
	private void run() throws Exception {

		
		try {
			String[] genres = {"classic", "pop", "classic", "classic", "pop"};
			int[] plays = {500, 600, 150, 800, 2500};

			int[] result = solution(genres,plays);
			System.out.println("result  :"+result);

		} catch (Exception e) {
			System.out.println("======= 에러 ======="+e.getMessage());

		}
	}

	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		Map<String, Integer> genresMap = new HashMap<>();

		for(int i=0; i < genres.length; i++){
			if(genresMap.size() > 0){
				if(genres[i].equals(genresMap.get(i))){

				}
			}else{
				genresMap.put(genres[i],plays[i]);
			}


		}


		return answer;
	}
}
