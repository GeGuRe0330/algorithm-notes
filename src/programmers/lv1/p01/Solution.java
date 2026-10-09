package programmers.lv1.p01;

class Solution {
    public int solution(int[][] signals) {
        for (int t = 1; t <= 3_200_000; t++) {
            boolean yellow = false;
            for (int[] s : signals) {
                int G = s[0], Y = s[1], R = s[2];
                int r = ( t - 1 ) % (G + Y + R);
                if (G - 1 < r && r < G + Y) {
                    yellow = true;
                } else {
                    yellow = false;
                    break;
                }
            }
            if (yellow) return t;
        }
        return -1;
    }
}