package programmers.lv1.p08;

import java.util.ArrayList;
import java.util.Arrays;

/*
TODO:
    1. 0 ~ 9까지 들어있는 ArrayList를 만들어서 들어있으면 해당 값을 0으로 만들고 sum 하면 되지 않을까?
    2. ArrayList도 필요 없이 그냥 배열만 있음 되겠네.
    3. 그냥 ArrayList로 해야겠다.
 */
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< 10; i++) {
            list.add(i);
        }

        for(int i : numbers) {
            list.removeIf(num -> num == i);
        }

        answer = list.stream().reduce(0, Integer::sum);

        return answer;
    }
}
