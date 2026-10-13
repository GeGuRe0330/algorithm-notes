package programmers.lv1.p03;

class Solution {
    public int solution(int n, int w, int num) {
        int height = (n % w == 0) ? n / w : n / w + 1;
        int target = (num % w == 0) ? num / w : num / w + 1;

        int pos = ( num - 1 ) % w;
        int col = (target % 2 == 1) ? pos : w - 1 - pos;
        int k = n - (height - 1 ) * w;

        boolean reaches = ( height % 2 == 1 )? col < k  : col >= w - k;

        int answer = height - target + 1;
        if(!reaches) {
            answer--;
        }

        return answer;
    }
}
