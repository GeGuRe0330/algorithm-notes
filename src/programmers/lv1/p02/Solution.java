package programmers.lv1.p02;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;
        Set<String> hidden = new HashSet<>();
        Set<String> visible = new HashSet<>();
        int i = 0;

        while (i < message.length()) {
            if (message.charAt(i) == ' ') {
                i++;
                continue;
            }
            int start = i;
            while (i < message.length() && message.charAt(i) != ' ') i++;
            int end = i - 1;
            String word = message.substring(start, end + 1);

            boolean isHidden = false;

            for (int[] range : spoiler_ranges) {
                if(!(end < range[0] || range[1] < start)) isHidden = true;
            }

            if (isHidden) {
                hidden.add(word);
            } else  {
                visible.add(word);
            }
        }
        hidden.removeAll(visible);
        answer = hidden.size();
        return answer;
    }
}
