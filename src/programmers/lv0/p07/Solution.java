package programmers.lv0.p07;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        /* TODO
            1. 한 칸씩 커서를 옮기는건 성공 (테스트로 전체 베열에서 1을 카운트하는 코드를 돌려보니 정상 출력.)
            2. 본래 1을 기준으로 좌우 + 상하를 1로 변환할려했는데, 문제는 그러면 IOE가 발생.(끝 범위 이탈)
            3. 지뢰 주변부를 어떻게 파악할 수 있을까...
            4. 아? 지뢰 위치를 찾아서 주변 일대의 좌표를 직접 바꿔주면 되잖아? 굳이 하나하나 주변부인지 판별할 필요 없이?
            5. 아, 실시간으로 바꾸는것보단 그냥 1이 어디있는지 좌표를 먼저 찾고, 그 후에 변환하는게 나을거같네?
            6. 좋아. 지뢰 자표를 찾는건 성공했어. 이제 이걸 for문으로 해당 좌표에 정사각형 범위만큼 채우면 되겠다.
            7. 범위는 사실 고정 3X3이야.
         */
        ArrayList<int[]> mineList = new ArrayList<>();

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 1) {
                    mineList.add(new int[]{row, col});
                }
            }
        }

        for (int[] s : mineList) {
            for (int i = s[0] - 1; i < s[0] + 2; i++) {
                for (int j = s[1] - 1; j < s[1] + 2; j++) {
                    if (i < board.length && j < board[0].length && i >= 0 && j >=0) {
                        board[i][j] = 1;
                    }
                }
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 0) {
                    answer++;
                }
            }
        }
        System.out.println("지뢰 자표 :" + Arrays.deepToString(mineList.toArray()));
        System.out.println("board 결과 : " + Arrays.deepToString(board));

        return answer;
    }
}
