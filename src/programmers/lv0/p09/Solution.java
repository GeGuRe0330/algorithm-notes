package programmers.lv0.p09;

/*
TODO:
    1. 일단 직관적으로는 단어 하나를 꺼내서 각 글자가 spell 글자와 동일한지를 검사하면 될거같은데?
 */
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int trueCount = 0;
        for (String word : dic) {
            for (String ch : spell) {
                if (word.contains(ch)) {
                    trueCount++;
                }
                if (trueCount == spell.length && spell.length == word.length()) {
                    answer = 1;
                    break;
                }
            }
            trueCount = 0;
        }

        if (answer != 1) {
            answer = 2;
        }

        return answer;
    }
}
