package programmers.lv1.p06;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10)); // 4
        System.out.println(s.solution(5)); // 3
        System.out.println(s.solution(2)); // 1 (최솟값)
        System.out.println(s.solution(1_000_000)); // 78498 (최댓값, 속도 확인용)
    }
}
