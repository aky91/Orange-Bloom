//https://www.interviewbit.com/problems/grid-unique-paths/

public class Solution {
    public int uniquePaths(int A, int B) {
        
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        
        int ans = getPath(0, 0, A-1, B-1, map);
        
        return ans;
    }
    
    public static int getPath(int x, int y, int X, int Y, HashMap<Integer, HashMap<Integer, Integer>> map){
        
        if(map.containsKey(x) && map.get(x).containsKey(y))
            return map.get(x).get(y);
            
        if(x < 0 || x > X || y < 0 || y > Y)
            return 0;
            
        if(x == X && y == Y)
            return 1;
            
        int ans = getPath(x + 1, y, X, Y, map);
        
        ans += getPath(x, y + 1, X, Y, map);
        
        if(!map.containsKey(x)) map.put(x, new HashMap<>());
        
        map.get(x).put(y, ans);
        
        return ans;
    }
}
