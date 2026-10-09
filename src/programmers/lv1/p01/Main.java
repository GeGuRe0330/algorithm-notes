package programmers.lv1.p01;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        programmers.lv1.p01.Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{2, 1, 2}, {5, 1, 1}}));                       // 13
        System.out.println(s.solution(new int[][]{{2, 3, 2}, {3, 1, 3}, {2, 1, 1}}));            // 11
        System.out.println(s.solution(new int[][]{{3, 3, 3}, {5, 4, 2}, {2, 1, 2}}));            // 193
        System.out.println(s.solution(new int[][]{{1, 1, 4}, {2, 1, 3}, {3, 1, 2}, {4, 1, 1}})); // -1
    }
}
