package programmers.lv0.p06;

class Solution {
    public int solution(int[] common) {

        // 등차수열 일 때
        if (common[2] - common[1] == common[1] - common[0]) {
            return common[common.length-1] + common[1] - common[0];
        }

        // 등비수열 일 때
        if (common[2] / common[1] == common[1] / common[0]) {
            return common[common.length-1] * common[1] / common[0];
        }
        return -1;
    }
}
