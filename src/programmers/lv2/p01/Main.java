package programmers.lv2.p01;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1 2 3 4"));      // 1 4
        System.out.println(s.solution("-1 -2 -3 -4"));  // -4 -1
        System.out.println(s.solution("-1 -1"));        // -1 -1
    }
}
