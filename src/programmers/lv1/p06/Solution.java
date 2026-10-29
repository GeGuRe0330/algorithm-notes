package programmers.lv1.p06;

/*
TODO:
    1. 소수 계산 수식을 어케할까나...
    2. 수의 절반까지만 나눴을 때 안나눠지면 (나머지가 0이면) 되지 않을까?
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                answer++;
            }
        }
        return answer;
    }
}
