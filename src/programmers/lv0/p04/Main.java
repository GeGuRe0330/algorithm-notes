package programmers.lv0.p04;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{0, 1}, {2, 5}, {3, 9}})); // 2
        System.out.println(s.solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}})); // 0
        System.out.println(s.solution(new int[][]{{0, 5}, {3, 9}, {1, 10}})); // 8
    }
}
