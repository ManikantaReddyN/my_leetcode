public class DecodeWays {
    private static int fun(String s){
        int n;
        n = s.length();
        if(n==0)
         return 0;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0)!='0'?1:0;
        for(int i=2;i<=n;i++){
            int first = Integer.valueOf(s.substring(i-1, i));
            int second = Integer.valueOf(s.substring(i-2, i));
            if(first>=1 && first <=9){
               dp[i] = dp[i]+dp[i-1];
            }
            if(second >=10 && second<=26){
               dp[i] = dp[i]+dp[i-2];
            }

        }

        return dp[n];
    }
    public static void main(String[] args) {
        String s = "226";
        System.out.println(fun(s));
    }
    
}
