package programmers.lv1.p10;

/*
TODO:
    1. 복잡하게 생각할 거 없이 그냥 for문으로 간단하게 해치워버리자
    2. Array.filter를 써보고싶었는데 오히려 더 어렵네....
 */
class Solution {
    public String solution(String[] seoul) {
        int answer = 0;
        int idx = 0;

        for(String s : seoul) {
            if (s.equals("Kim")) {
                answer = idx;
                break;
            }
            idx++;
        }

        return "김서방은 " + answer + "에 있다";
    }
}
