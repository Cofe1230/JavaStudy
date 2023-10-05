package com.study01;

import java.util.HashMap;

class Solution2 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer> scoreMap = new HashMap<>();
        int[] result = new int[photo.length];
        for(int i=0; i<name.length; i++){
            scoreMap.put(name[i],yearning[i]);
        }
        for(int j=0; j<photo.length; j++){
            int sum=0;
            for(int k=0; k<photo[j].length; k++){
                if(scoreMap.containsKey(photo[j][k])){
                    sum+=scoreMap.get(photo[j][k]);
                }
            }
            result[j]=sum;
        }
        return result;
    }
}
public class Programmers176963 {
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
		int[] result = s.solution(name, yearning, photo);
		for(int i : result) {
			System.out.println(i);
		}
	}
}
