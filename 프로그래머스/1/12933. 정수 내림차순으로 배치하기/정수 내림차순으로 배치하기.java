import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int x = ((int)Math.log10(n)+1);
        for(int i=0;i<x;i++){
            arr.add(i,(int)(n%10));
            n/=10;
        }
        Collections.sort(arr);
        String z ;
        for (int i =0;i<arr.size();i++){
            answer += arr.get(i)*Math.pow(10,i);
        }
        return answer;
        }
    }


