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

		boolean[][] roadMap = new boolean[5003][5003];

		HashSet<Integer> visited = new HashSet<>();
		HashSet<Integer> vigilante = new HashSet<>();
		vigilante.initiate();

		for(int i = 0; i < E; i++){
			int u = scn.nextInt();
			int v = scn.nextInt();

			roadMap[u][v] = true;
		}

		Stack<Integer> st = new Stack<>();

		st.push(C);

		while(st.size() != 0){

			int u = st.pop();

			if(visited.contains(u))
				continue;

			visited.add(u);

			for(int v = V - 1; v >= 0; v--)
				if(roadMap[u][v] == true && !visited.contains(v))
					st.push(v);
		}

		Iterator<Integer> itr = visited.iterator();

		while(itr.hasNext())
			System.out.print(itr.next() + " ");

		ArrayList<Integer> vigilante = new ArrayList<>();


	}
}
