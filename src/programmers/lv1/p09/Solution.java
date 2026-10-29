package programmers.lv1.p09;

/*
TODO:
    1. ...엥? 너무 쉽게 풀리는데
 */
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() % 2 == 0) {
            sb.append(s.charAt(s.length() / 2 - 1));
            sb.append(s.charAt(s.length() / 2));
        } else {
            sb.append(s.charAt(s.length() / 2));
        }

        return sb.toString();
    }
}
