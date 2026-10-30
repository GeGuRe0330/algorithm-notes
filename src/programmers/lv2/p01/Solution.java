package programmers.lv2.p01;

/*
TODO:
    1. 공백으로 구분된 숫자가 저장되어있는 문자열
    2. 그 숫자 중 최소값과 최대값을 찾아 "[최소값] [최대값]" 형태의 문자열을 반환하는 함수를 완성하라.
    3. 공백으로 나뉘어져 있으니 split을 쓰면 되겠는걸?
    4. 최대값과 최소값을 구하는 메서드를 직접 구현할법도 하지만... 그냥 나눈 값을 배열로 저장해서 min과 max으로 구하면 더 편하고 빠를거같아.
    5. 그냥 뭐 ArrayList든 뭐든 다 필요없네 막상 짜보니

 */
class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(String num : strArr) {
            if(min > Integer.parseInt(num)) {
                min = Integer.parseInt(num);
            }
            if(max < Integer.parseInt(num)) {
                max = Integer.parseInt(num);
            }
        }

        return min + " " + max;
    }
}
