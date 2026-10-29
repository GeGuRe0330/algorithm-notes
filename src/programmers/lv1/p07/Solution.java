package programmers.lv1.p07;

import java.util.Arrays;

/*
TODO:
    1. 이건 배열 길이가 유동적이니까 ArrayList로 연산을 수행하고 최종적으로 배열로 리턴시키는게 더 좋겠다.
    2. 해보니까 Integer[]로 변형해야하는데 int[]로 반환해야해서 오히려 귀찮네. 그냥 배열로 해야겠다.
 */
class Solution {
    public int[] solution(int[] arr) {
        int answerLength = arr.length - 1;
        int min = Arrays.stream(arr).min().getAsInt();
        int idx = 0;

        if (answerLength == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[answerLength];
        for (int i : arr) {
            if (i == min) {
                continue;
            }
            answer[idx++] = i;
        }

        return answer;
    }
}
