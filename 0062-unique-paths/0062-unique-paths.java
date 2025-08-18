class Solution {
    public int uniquePaths(int m, int n) {
      long total = m + n - 2;      
        long r = Math.min(m - 1, n - 1); 

        long ans = 1;
        for (long i = 1; i <= r; i++) {
            ans = ans * (total - r + i) / i; 
        }

        return (int) ans;
    }
}