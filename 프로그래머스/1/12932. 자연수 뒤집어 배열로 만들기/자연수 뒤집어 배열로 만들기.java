import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int[] solution(long n) {
        int N = (int)Math.log10(n)+1;
        int[] result = new int[N];
      for(int i=0;i<N;i++){
          result[i]=(int)(n%10);
          n/=10;
      }

        return result;
  }
}