class Solution {
    public int[] solution(int[] arr) {
        if (arr.length-1<1) {
           int[] answer= {-1}; 
        return answer;}
        int [] answer =new int[arr.length-1];
        int min = arr[0];
        for (int i =0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        int x= 0;
        for (int j =0;j<arr.length;j++){
            if(min!=arr[j]){
                answer[x] = arr[j];
                x++;
            }
        }
        return answer;
    }
}