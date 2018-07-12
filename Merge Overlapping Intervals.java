//https://www.interviewbit.com/problems/merge-overlapping-intervals/

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        
        int N = intervals.size();
        
        ArrayList<Interval> ans = new ArrayList<>();
        
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
        
                int a1 = o1.start;
                int a2 = o1.end;
                
                int b1 = o2.start;
                int b2 = o2.end;
                
                
                if(a1 < b1) return -1;
                if(a1 > b1) return 1;
                
                //start is same
                if(a2 < b2) return -1;
                if(a2 > b2) return 1;
                
                return 0;
            }
        });
        
        for(int i = 0; i < N;){
            
            Interval val = intervals.get(i);
            
            Interval next = new Interval(val.start, val.end);
            
            
            //see how far this interval goes
            i++;
            
            while(i < N){
                
                Interval can = intervals.get(i);
                
                if(!doesOverlap(next, can))
                    break;
                    
                next.start = Math.min(next.start, can.start);
                next.end = Math.max(next.end, can.end);
                
                i++;
            }
            
            ans.add(next);
        }
        
        return ans;
    }
    
    public static boolean doesOverlap(Interval v1, Interval v2){
        
        if((v1.start < v2.start && v1.end < v2.start) || (v1.start > v2.end && v1.end > v2.end))
            return false;
    
        return true;
    }
}
