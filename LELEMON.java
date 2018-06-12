import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://www.codechef.com/problems/LELEMON

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();
			int M = scn.nextInt();

			int[] P = new int[M];

			for(int i = 0; i < M; i++)
				P[i] = scn.nextInt();

			//int[] rooms = new int[N][128];

			ArrayList<Integer>[] rooms = new ArrayList[N];

			for(int i = 0; i < N; i++){

				rooms[i] = new ArrayList<Integer>();

				int bottles = scn.nextInt();

				for(int j = 0; j < bottles; j++)
					rooms[i].add(scn.nextInt());

				Collections.sort(rooms[i]);
			}

			long volume = 0;

			for(int i = 0; i < M; i++){

				int room_no = P[i];

				if(rooms[room_no].size() > 0)
					volume += rooms[room_no].remove(rooms[room_no].size() - 1);
			}

			System.out.println(volume);
		}	

	}
}