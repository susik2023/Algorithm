import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {

    String[] answer = {};

    ArrayList<String> z = new ArrayList<>();

    for(int i =0;i<strings.length;i++){
      String s =strings[i].substring(n,n+1);
      z.add(i,s+strings[i]);

    }
    Collections.sort(z);

    answer = new String[z.size()];
    for(int i =0;i<z.size();i++){

      answer[i] = z.get(i).substring(1,z.get(i).length());


    }

        return answer;
    }
}