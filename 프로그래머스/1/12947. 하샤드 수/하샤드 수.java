class Solution {
    public boolean solution(int x) {
        int input = x;
        boolean answer = true;
        double z = 0;
        int y = (int) Math.log10(x)+1;
        for(int i=0;i<y;i++){
            z += (int) (x % 10);
            x/=10;
        }
        if(input%z!=0){
            answer = !answer;
        }
        return answer;
    }
}