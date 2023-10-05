package com.study01;

class Solution155652 {
    public String solution(String s, String skip, int index) {
    	//문자열 s, skip , 자연수 index
    	//s => index수만큼 뒤의 알파벳 z를 넘어갈시 a
    	//skip에 있는 알파벳은 건너뛴다
    	//s와 skip은 소문자만
    	//skip에 있으면 s에는 없다
    	//a = 97, z=122
    	String answer = "";
    	
    	for(int i=0; i<s.length(); i++) {
    		char c = s.charAt(i);
    		for(int j=0; j<index; j++) {
    			c++;
    			if(c > 'z') {
    				c-=26;
    			}
    			if(skip.contains(String.valueOf(c))) {
    				j--;
    			}
    		}
    		answer+=c;
    	}
        return answer;
    }
}

public class Programmers155652 {

	public static void main(String[] args) {
		Solution155652 solution = new Solution155652();
		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
		String answer = solution.solution(s, skip, index);
		System.out.println(answer);
	}

}
