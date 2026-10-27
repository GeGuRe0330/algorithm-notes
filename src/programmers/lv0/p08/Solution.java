package programmers.lv0.p08;

/*
TODO:
    1. 일단 두 점을 짝지어서 기울기를 구한다.
    2. 그 기울기가 서로 같은지 교차곱셈을 이용해 구별한다.
 */
class Solution {
    public int solution(int[][] dots) {
        int answer = -1;

        if(isParallel(dots, 0, 1, 2, 3) ||
                isParallel(dots, 0, 2, 1, 3) ||
                isParallel(dots, 1, 2, 0, 3) ||
                isParallel(dots, 1, 3, 2, 0)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }

    private boolean isParallel(int[][] dots, int dot1, int dot2, int dot3, int dot4) {
        int dx1 = 0, dy1 = 0, dx2 = 0, dy2 = 0;

        dx1 = dots[dot2][0] -  dots[dot1][0];
        dy1 = dots[dot2][1] -  dots[dot1][1];
        dx2 = dots[dot4][0] -  dots[dot3][0];
        dy2 = dots[dot4][1] -  dots[dot3][1];

        if(dx2*dy1 == dy2*dx1) {
            return true;
        } else {
            return false;
        }
    }
}
