// Akash Yadav
// @Hudson Lane, Delhi
// 28th June 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class TestClass{

	//http://codeforces.com/problemset/problem/999/E

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int V = scn.nextInt();
		int E = scn.nextInt();
		int C = scn.nextInt();

		HashMap<Integer, HashSet<Integer>> roadMapO = new HashMap<>();
		HashMap<Integer, HashSet<Integer>> roadMapI = new HashMap<>();
		HashMap<Integer, Boolean> judgement = new HashMap<>();

		for(int i = 1; i <= V; i++){
			roadMapO.put(i, new HashSet<>());
			roadMapI.put(i, new HashSet<>());
			judgement.put(i, false);
		}

		for(int i = 0; i < E; i++){
			int u = scn.nextInt();
			int v = scn.nextInt();

			roadMapO.get(u).add(v);
			roadMapO.get(v).add(u);
		}

		// main dfs for finding bad vertices
		Stack<Integer> st = new Stack<>();
		st.push(C);

		HashSet<Integer> visited = new HashSet<>();

		while(st.size() != 0){

			int u = st.pop();

			//skip if already visited
			if(visited.contains(u)) continue;

			visited.add(u);
			judgement.put(u, true);

			//if no outgoing roads then skip
			if(roadMapO.get(u).size() == 0) continue;

			//put all unvisited cities in stack
			for(int v : roadMapO.get(u))
				if(!visited.contains(v))
					st.push(v);
		}

		//now traverse through all bad cities 

		HashMap<Integer, Integer> crimes = new HashMap<>();
		HashMap<Integer, HashSet<Integer>> fir = new HashMap<>();

		for(int city = 1; city <= V; city++){

			if(judgement.get(city)) continue;

			fir.put(city, new HashSet<>());

			//start DFA from this city and count no. of bad cities visited
			st = new Stack<>();
			st.push(city);
			visited = new HashSet<>();

			int killCount = 0;

			while(st.size() != 0){

				int c = st.pop();

				if(visited.contains(c)) continue;

				if(judgement.get(c) == false){

					if(!fir.get(city).contains(c))
						fir.get(city).add(c);

					killCount++;
				}

				visited.add(c);

				for(int neighbour : roadMapO.get(c))
					if(!visited.contains(neighbour) && )
						st.push(neighbour);
			}

			crimes.put(city, killCount);
		}

		//here we go again

		ArrayList<Integer> list = new ArrayList<>(crimes.keySet());

		int newRoad = 0;

		//traverse through all bad cities
		for(int city : list){

			if(roadMapI.get(city).size() == 0){
				newRoad++;

			}
		}

		System.out.print(newRoad);
	}
}
