import static java.lang.Integer.parseInt;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
    for(int i =0;i<=t.length()-p.length();i++){
      Long k = Long.parseLong(t.substring(i,p.length()+i));
      System.out.println(k);
      if(k<=Long.parseLong(p)){
          answer++;
      }
    }
        return answer;
    }
}