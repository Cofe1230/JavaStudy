package com.level2;

class Solution181187 {
    public long solution(int r1, int r2) {
    	long answer = 0;
    	for(int i=0; i<r2-r1; i++) {
    		answer+=(2*r1+i)*4;
    		if(r2*r2<(r2-1)*(r2-1))
    			answer-=4;
    	}
    	answer+=4;
        return answer;
    }
}

public class Programmers181187 {

	public static void main(String[] args) {
		Solution181187 solution = new Solution181187();
		int r1 = 2;
		int r2 = 3;
		long answer = solution.solution(r1, r2);
		System.out.println(answer);
		

	}

}
