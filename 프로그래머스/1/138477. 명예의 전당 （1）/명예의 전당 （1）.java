import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public int[] solution(int k, int[] score) {
    int[] answer = new int [score.length];
    List<Integer> king = new ArrayList<>();
    for(int i = 0; i<score.length;i++){
      king.add(score[i]);
      Collections.sort(king);
      if (king.size()>k){
        king.remove(Collections.min(king));
      }
      answer[i]=Collections.min(king);


    }
        return answer;
    }
}