package com.study01;

import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            hm.put(players[i],i);
        }
        
        for(int j=0; j<callings.length; j++){
            int idx=hm.get(callings[j]);
            hm.put(players[idx],idx-1);
            hm.put(players[idx-1],idx);
            String temp=players[idx-1];
            players[idx-1]=players[idx];
            players[idx]=temp;
        }
        
        String[] answer = players;
        return answer;
    }
}

public class Programmers178871 {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		String[] answer = s.solution(players, callings);
		for(String a : answer) {
			System.out.println(a);
		}
		
	}
}
