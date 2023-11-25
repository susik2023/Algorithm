class Solution {
    public int solution(int[][] sizes) {
            int answer=0;
    int ww =0;
    int hh =0;


    for(int i =0;i<sizes.length;i++) {
        int w = Math.max(sizes[i][0],sizes[i][1]);
        int h = Math.min(sizes[i][0],sizes[i][1]);
        ww = Math.max(w,ww);
        hh = Math.max(h,hh);
    }
    answer = ww*hh;
        return answer;
    }
}
