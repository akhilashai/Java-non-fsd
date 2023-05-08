package com.cg.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Demo1 {

	public static void main(String[] args) {
		
		List<String> teamA = Arrays.asList("akhila","haleema");
		List<String> teamB = Arrays.asList("begum","nagoorvali");
		List<String> teamC = Arrays.asList("imran","shaik");
		
		List<List<String>> totalTeam = new ArrayList();
		totalTeam.add(teamA);
		totalTeam.add(teamB);
		totalTeam.add(teamC);
		
		totalTeam.stream().flatMap(x->x.stream()).forEach(System.out::println);
		
		
	}

}
