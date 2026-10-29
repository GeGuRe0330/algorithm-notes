package programmers.lv1.p07;

import java.util.Arrays;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{4, 3, 2, 1}))); // [4, 3, 2]
        System.out.println(Arrays.toString(s.solution(new int[]{10}))); // [-1]
    }
}
