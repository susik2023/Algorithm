import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        int[] answer;
        if (list.size() > 0) {
            answer = new int[list.size()];
            for (int x = 0; x < list.size(); x++)
                answer[x] = list.get(x);
        } else {answer = new int[1];
            answer[0] = -1;}
        return answer;
    }
}