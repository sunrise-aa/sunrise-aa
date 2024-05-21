package group1;

import java.util.Hashtable;

public class excercise2 {

public static Hashtable<Integer,Integer> max=new Hashtable<Integer,Integer>();
    //纯递归版
   /* public int longestPalindromeSubseq(String s) {
        int maxlen=1;
        for(int i=0;i<s.length();i++){
            maxlen=Math.max(longestPalindromeSubseq(i,s),maxlen);
        }

        return maxlen;


    }
    public int longestPalindromeSubseq(int i,String s){
        int n=s.length();
        int maxlen=1;
        if(i==n-1){
            return 1;
        }

        char c1=s.charAt(i);
        for(int j=i+1;j<n;j++){
            char c2=s.charAt(j);
            if(c1==c2){
                maxlen= Math.max(maxlen,longestPalindromeSubseq(j,s)+1);
            }

        }

        return maxlen;
    }*/





  /*
    //带备忘录的递归(mem)&递归树的修剪（pruning)
    public int longestPalindromeSubseq(String s) {
        int[] max=new int[s.length()];
        for(int i=0;i<s.length();i++){
            max[i]=-1;
        }

        int maxlen=1;
        for(int i=0;i<s.length();i++){
            maxlen=Math.max(longestPalindromeSubseq(i,s,max),maxlen);
        }

        return maxlen;


    }
    public int longestPalindromeSubseq(int i,String s,int[] max){

        if(max[i]!=-1){
            return max[i];
        }
        int n=s.length();
        int maxlen=1;


        if(i==n-1){
            return 1;
        }

        char c1=s.charAt(i);
        for(int j=i+1;j<n;j++){
            char c2=s.charAt(j);
            if(c1==c2){
                maxlen= Math.max(maxlen,longestPalindromeSubseq(j,s,max)+1);
            }

        }
        max[i]=maxlen;

        return maxlen;
    }

*/


    public int  lengthOfLIS(int[] nums) {
        int[] max=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max[i]=-1;
        }

        int maxlen=1;
        for(int i=0;i<nums.length;i++){
            maxlen=Math.max(lengthOfLIS(i,nums,max),maxlen);
        }

        return maxlen;


    }
    public int lengthOfLIS(int i,int[] nums,int[] max){

        if(max[i]!=-1){
            return max[i];
        }
        int n=nums.length;
        int maxlen=1;


        if(i==n-1){
            return 1;
        }


        for(int j=i+1;j<n;j++){

            if(nums[i]<nums[j]){
                maxlen= Math.max(maxlen,lengthOfLIS(j,nums,max)+1);
            }

        }
        max[i]=maxlen;

        return maxlen;
    }






}
