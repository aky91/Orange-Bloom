// https://leetcode.com/problems/regular-expression-matching/

 
class Solution {
public:
    
    bool isMatch(string s, string p) {
       int m=s.length();
        int n=p.length();
        int dp[m+1][n+1];
        memset(dp,0,sizeof dp);
        dp[0][0]=1;
      for(int i=1;i<=n;i++){
          if(p[i-1]=='*'){
              dp[0][i]=dp[0][i-2];
          }
      }
        for(int i=1;i<=m;i++){
          for(int j=1;j<=n;j++){
            if((s[i-1]==p[j-1]) ||( p[j-1]=='.'))
              dp[i][j]=dp[i-1][j-1];
            else if(p[j-1]=='*'){
              if(j>=2)
              dp[i][j]=dp[i][j-2];
              if(j>=2 && (p[j-2]==s[i-1] || p[j-2]=='.'))
                dp[i][j]=(dp[i][j]||dp[i-1][j]);
             }
            else
              dp[i][j]=0;
          }
        }
        return dp[m][n];
    }
};
