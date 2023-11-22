class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
    int gcd = 0;
    int lcm = 0;
    for (int i = 1;i<=n&&i<=m;i++){
      if(n%i==0&&m%i==0){
          gcd = i;
      }
    }
    lcm = (m*n)/gcd;
    answer= new int[]{gcd, lcm};
            
        return answer;
    }
}