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

		HashMap<Integer, HashSet<Integer>> roadMap = new HashMap<>();

		HashSet<Integer> visited = new HashSet<>();
		HashSet<Integer> vigilante = new HashSet<>();

		for(int i = 1; i <= V; i++)
			vigilante.add(i);

		for(int i = 0; i < E; i++){
			int u = scn.nextInt();
			int v = scn.nextInt();

			if(!roadMap.contains(u)) roadMap.put(new HashSet<>());

			roadMap.get(u).add(v);
		}

		// main dfs for finding vigilante vertices
		Stack<Integer> st = new Stack<>();
		st.push(C);

		while(st.size() != 0){

			int u = st.pop();

			if(visited.contains(u))
				continue;

			visited.add(u);

			for(int v = V; v > 0; v--)
				if(roadMap[u][v] == true && !visited.contains(v))
					st.push(v);
		}

		Iterator<Integer> itr = visited.iterator();

		while(itr.hasNext())
			vigilante.remove(itr.next());

		//now we have all unreachable cities in vigilante

		HashMap<Integer, Integer> crime = new HashMap<>();
		HashMap<Integer, ArrayList<Integer>> bank = new HashMap<>();

		itr = vigilante.iterator();

		while(itr.hasNext()){
			
			int center = itr.next();

			//start dfs form center and count the reachable vigilante cities

			st = new Stack<>();
			visited = new HashSet<>();
			int killCount = 0;

			st.push(center);

			while(st.size() != 0){

				int u = st.pop();

				if(u != center && vigilante.contains(u)){
					if(!bank.containsKey(center))	bank.put(center, new ArrayList<>());
					bank.get(center).add(u);
					killCount++;
				}

				if(visited.contains(u))
					continue;

				visited.add(u);

				for(int v = V; v > 0; v--)
					if(roadMap[u][v] == true && !visited.contains(v))
						st.push(v);
				
			}

			crime.put(center, killCount);
		}

		ArrayList<Integer> cities = new ArrayList<>(crime.keySet());

		Collections.sort(cities, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {

				int a = crime.get(o1);
				int b = crime.get(o2);

				//decending order
				if(a < b) return 1;
				if(a > b) return -1;
				return 0;
			}
		});

		visited = new HashSet<>();
		int roads = 0;

		for(int city : cities){
			
			if(visited.contains(city))	continue;

			visited.add(city);

			roads++;

			if(bank.get(city) == null) continue;

			for(int target : bank.get(city))
				visited.add(target);
		}

		System.out.println(roads);
	}
}
