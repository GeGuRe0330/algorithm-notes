package programmers.lv0.p05;

import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] inputArray = new int[]{a, b, c, d};
        int[] diceArray = new int[6];

        for (int i : inputArray) {
            diceArray[i - 1] += 1;
        }

        // 2. 일단 총 중복 횟수를 확정하고 이후 분기를 나눠보자.
        // 그냥 일단 for문으로 p와 q를 찾자.
        int sameTimes = Arrays.stream(diceArray).max().getAsInt();
        int p = 0;
        int q = 0;

        switch (sameTimes) {
            case 4:
                return 1111 * a;

            case 3:
                for (int i = 0; i < diceArray.length; i++) {
                    if (diceArray[i] == 3) {
                        p = i + 1;
                    } else if (diceArray[i] == 1) {
                        q = i + 1;
                    }
                }
                return (10 * p + q) * (10 * p + q);

            case 2:
                for (int i = 0; i < diceArray.length; i++) {
                    if (diceArray[i] == 2 && p == 0) {
                        p = i + 1;
                        continue;
                    }
                    if (diceArray[i] == 2) {
                        q = i + 1;
                    }
                    if (q != 0) {
                        return (p + q) * Math.abs(p - q);
                    }
                }

                int pair = p;
                return Arrays.stream(inputArray)
                        .filter(i -> i != pair)
                        .reduce(1, (x, y) -> x * y);

            case 1:
                return Arrays.stream(inputArray).min().getAsInt();
            default:
                return -1;
        }
    }
}
