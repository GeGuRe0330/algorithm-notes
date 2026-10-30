package programmers.lv1.p14;

/*
TODO:
    1. 일단 간단히 생각하면 long타입으로 주는 자연수 n은 사실상 숫자 하나하나가 의미가 있는거니까 String 문자열로 바꿔도 무방하겠는걸.
    2. 다만 고민인게 문제를 보면 10이나 100과 같은 숫자도 그냥 붙어서 오기 때문에, 단순히 숫자 하나하나만 떼어내서 만드는건 불가능해보여.
    3. 아 잘못생각했네? 그냥 숫자 하나를 배열에 넣는거니까 그냥 숫자 하나하나 읽어서 배열에 넣으면 되네~
    4. 길이가 변칙적이니 ArrayList가 훨씬 좋겠다. -> 아니다 그냥 길이만큼의 빈 배열을 만들어서 하나하나 넣으면 되겠다.
    5. 역순으로 해야하는거도 잊으면 안대! -> sort 생각해봤는데 이건 크기순이라 정갈해져. 그냥 역순으로 차근차근 쌓아야겠다.
 */
class Solution {
    public int[] solution(long n) {
        String numStr = String.valueOf(n);
        int[] answer = new int[numStr.length()];

        for(int i = 0; i < numStr.length(); i++) {
            answer[i] = numStr.charAt(numStr.length() - i - 1) - '0';
        }

        return answer;
    }
}
