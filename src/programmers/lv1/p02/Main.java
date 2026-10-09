package programmers.lv1.p02;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("here is muzi here is a secret message", new int[][]{{0, 3}, {23, 28}}));  // 1
        System.out.println(s.solution("my phone number is 01012345678 and may i have your phone number",
                new int[][]{{5, 5}, {25, 28}, {34, 40}, {53, 59}}));                                              // 4
    }
}
