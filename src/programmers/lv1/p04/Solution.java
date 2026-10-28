package programmers.lv1.p04;

/*
TODO:
    1. 직원들은 일주일 동안 자신이 설정한 "출근 희망 시각 + 10분" 까지 출근. (단, 토요일 일요일의 출근 시각은 이벤트에 영향을 끼치지 않음.)
    2. 매일 한 번씩만 출근
    3. 모든 시각은 시에 100을 곱하고 분을 더한 정수
    4. 상품을 받는 조건은 평일에 한번도 늦지 않고 출근.
    매개변수 :
    schedules = 직원들의 출근 희망 시각
    timelogs = 실제 직원들이 일주일간 출근한 시각
    startday = 이벤트를 시작한 요일
    리턴 :
    상품을 받을 직원의 수
    ---------------------------------
    1. 일단 지각인지 아닌지 비교는 쉬워. 다만 그 날이 주말인지 아닌지는 구별해야해.
    2. 월요일 = 1 ~ 일요일 = 7
    3. 일단 지각인지 아닌지 먼저 구현한 다음 거기에 주말인지 아닌지에 대한 로직을 추가해볼까? (완료)
    4. 이제 여기에 startday를 시작점으로 해서 언제가 주말인지만 넣으면 될거같은데? (일주일 기준이니까 무슨 경우든 주말은 무조건 다 끼나?)
    5. 토요일의 인덱스 위치 = 7 - startday - 1 -> 일요일은 여기에 + 1
    6. 음... 인정 시각을 먼저 구하고 계산하는게 편할라나?
    7. 100으로 나눴을 때(시간단위 차이가 있을 때 와 없을 때)를 나눠서 따로 계산하자
 */
class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int count = 0;
        int targetTimeLogsIndex = 0;

        for (int setLate : schedules) {
            int[] targetTimeLogs = timelogs[targetTimeLogsIndex];
            for (int i = 0; i < targetTimeLogs.length; i++) {
                if ((7 - startday - 1) >= 0 && i == (7 - startday - 1) || i == (7 - startday)) {
                    continue;
                    //아래는 startday가 7이어서 음수가 나올 때
                } else if (i == 7 + (7 - startday - 1)) {
                    continue;
                }

                if(targetTimeLogs[i] / 100 > setLate / 100 && targetTimeLogs[i] - setLate <= 50) {
                    count++;
                } else if (targetTimeLogs[i] - setLate <= 10) {
                    count++;
                }
            }
            if (count == 5) {
                answer++;
            }
            count = 0;
            targetTimeLogsIndex++;
        }
        return answer;
    }
}
