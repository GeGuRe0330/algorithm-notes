package programmers.lv1.p13;

/*
TODO:
   1. 조건을 읽어보니 a,b가 어느게 더 클지 모른다는게 함정인거같네.
   2. 단순히 생각하기엔 그냥 for문으로 간단히 풀릴만하겠는데? 다만 1번에서 말한것처럼 대소관계를 잘 봐야 범위 예외가 터지지 않겠구만.
   3. 큰 틀을 고민해보면 먼저 a,b 둘 중 누가 더 큰지 구별하고, 그에 맞게 for문을 돌리면 되겠다.
 */
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int bigger = 0;
        int smaller = 0;

        if (a <= b) {
            bigger = b;
            smaller = a;
        } else {
            bigger = a;
            smaller = b;
        }

        for(int i = smaller; i <= bigger; i++) {
            answer += i;
        }

        return answer;
    }
}
