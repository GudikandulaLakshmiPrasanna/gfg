class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        int count = 0;
        for(int i = 0; i<n;i++){
            if(Math.pow(2,i) == n){
                count++;
                return true;
            }
        }
        return false;
        
        
    }
}