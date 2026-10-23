package programmers.lv0.p05;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 2, 2, 2)); // 2222
        System.out.println(s.solution(4, 1, 4, 4)); // 1681
        System.out.println(s.solution(6, 3, 3, 6)); // 27
        System.out.println(s.solution(2, 5, 2, 6)); // 30
        System.out.println(s.solution(6, 4, 2, 5)); // 2
    }
}
