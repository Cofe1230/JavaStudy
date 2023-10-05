package com.level2;

import java.util.Arrays;

class Solution181188 {
    public int solution(int[][] targets) {
        int answer = 1;
        int s = 0;
        int e = 100000000;
        //s 오름차순 정렬 같으면 e 내림차순 정렬
        Arrays.sort(targets,(int[] a, int[] b)->{
        	if(a[0]==b[0]) return b[1]-a[1];
        	return a[0] - b[0];
        });
        
        for(int[] target : targets) {
        	int tarS = target[0];
        	int tarE = target[1];
        	
        	if(tarS>=s && tarE<=e) {
        		s = tarS;
        		e = tarE;
        		continue;
        	}
        	if(tarS<e && tarE>=e) {
        		s = tarS;
        	}
        	if(tarS>= e) {
        		answer++;
        		s = tarS;
        		e = tarE;
        	}
        }
        return answer;
    }
}
public class Programmers181188 {
	public static void main(String[] args) {
		Solution181188 s = new Solution181188();
		int[][] targets = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
		int answer = s.solution(targets);
		System.out.println(answer);
	}
}
