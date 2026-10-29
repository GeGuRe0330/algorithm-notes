package programmers.lv1.p11;

/*
TODO:
    1. 어... 생각해보니 숫자랑 문자랑 섞여있는 상태에서 이걸 어떻게 구별하지?
    2. ㅋㅋㅋㅋㅋㅋ try-catch문 써도 되나...?
 */
class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            for(String c : s.split("")) {
                try {
                    Integer.parseInt(c);
                } catch (NumberFormatException e) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
