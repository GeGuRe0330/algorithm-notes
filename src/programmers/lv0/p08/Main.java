package programmers.lv0.p08;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}})); // 1
        System.out.println(s.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}})); // 0
    }
}
