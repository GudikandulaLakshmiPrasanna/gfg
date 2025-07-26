class Solution {
    int convertfive(int num) {
        // Your code here
        String m = String.valueOf(num);
        m= m.replace('0','5');
        return Integer.parseInt(m);
    }
}