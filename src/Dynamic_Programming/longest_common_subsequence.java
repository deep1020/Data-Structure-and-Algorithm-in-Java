package Dynamic_Programming;


public class longest_common_subsequence {
    public static int LCS(String str1,String str2,int i,int j,int dp[][]){
        if(i==0 || j==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(str1.charAt(i-1)==str2.charAt(j-1)){
            return 1+LCS(str1,str2,i-1,j-1,dp);
        }
        else{
            return Math.max(LCS(str1,str2,i,j-1,dp),LCS(str1,str2,i-1,j,dp));
        }
    }
    public static void main(String[] args) {
//        String str1 = "10110110";
//        String str2 = "00100100";
        String str1 = "11010001";
        String str2 = "00111001";
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<str1.length()+1;i++){
            for(int j=0;j<str2.length()+1;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(LCS(str1,str2,str1.length(),str2.length(),dp)); // Output: 4 -> GTAB
    }
}
// T.C -> O(m*n) where m= length of str1 and n= length of str2
// S.C -> O(m*n) recursive stack

// Recursion Method:

//public static int LCS(String str1,String str2,int i,int j){
//    if(i==0 || j==0){
//        return 0;
//    }
//    if(str1.charAt(i-1)==str2.charAt(j-1)){
//        return 1+LCS(str1,str2,i-1,j-1);
//    }
//    else{
//        return Math.max(LCS(str1,str2,i,j-1),LCS(str1,str2,i-1,j));
//    }
//}
//public static void main(String[] args) {
//    String str1 = "AGGTAB";
//    String str2 = "GXTXAYB";
//    System.out.println(LCS(str1,str2,str1.length(),str2.length()));
//}

// T.C -> O(2^i+j)
// S.C -> O(1)