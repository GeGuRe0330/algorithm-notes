package programmers.lv0.p09;

// 로컬 실행용. 제출 시에는 Solution 클래스만 복사 (package 줄 제외)
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
                new String[]{"p", "o", "s"},
                new String[]{"sod", "eocd", "qixm", "adio", "soo"})); // 2
        System.out.println(s.solution(
                new String[]{"z", "d", "x"},
                new String[]{"def", "dww", "dzx", "loveaw"})); // 1
        System.out.println(s.solution(
                new String[]{"s", "o", "m", "d"},
                new String[]{"moos", "dzx", "smm", "sunmmo", "som"})); // 2
    }
}
