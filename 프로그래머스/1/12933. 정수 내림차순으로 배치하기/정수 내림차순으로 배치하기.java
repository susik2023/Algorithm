import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        if(n>=10){
            int x = ((int)Math.log10(n)+1);
            for(int i=0;i<x;i++){
                arr.add(i,Long.valueOf(n%10).intValue());
                n/=10;
            }
        }else arr.add((int)n);
        Collections.sort(arr);
        String z ;
        for (int i =0;i<arr.size();i++){
            answer += arr.get(i)*Math.pow(10,i);
        }
        return answer;
    }
}