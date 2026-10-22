package programmers.lv0.p04;

import java.util.Arrays;

class Solution {
    public int solution(int[][] lines) {
        int min = lines[0][0];
        int max = lines[0][1];
        int answer = 0;

        for (int s[] : lines) {
            min = Math.min(min, s[0]);
        }

        for (int s[] : lines) {
            max = Math.max(max, s[1]);
        }

        int[][] fullArray = new int[lines.length][max - min];


        for (int i = 0; i < fullArray.length; i++) {
            int targetMin = lines[i][0];
            int targetMax = lines[i][1];
            Arrays.fill(fullArray[i], targetMin - min, targetMax - min, 1);
        }

        for(int col = 0; col < fullArray[0].length; col++) {
            int sum = 0;
            for (int i = 0; i < fullArray.length; i++) {
                sum += fullArray[i][col];
            }
            if (sum >= 2) {
                answer++;
            }
        }


        return answer;
    }
}
