package programmers.lv1.p05;

import java.util.Arrays;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(
                new String[]{"3 - 4 = -3", "5 + 6 = 11"}))); // [X, O]
        System.out.println(Arrays.toString(s.solution(
                new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}))); // [O, O, X, O]
    }
}
