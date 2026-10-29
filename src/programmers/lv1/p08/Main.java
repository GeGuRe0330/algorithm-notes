package programmers.lv1.p08;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0})); // 14
        System.out.println(s.solution(new int[]{5, 8, 4, 0, 6, 7, 9})); // 6
    }
}
