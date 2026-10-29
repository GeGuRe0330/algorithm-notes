package programmers.lv1.p05;

/*
  TODO:
    1. 먼저 quiz 배열에서 하나 꺼낸다음 split을 하면 되겠다.
    2. switch문으로 사칙연산(조건에 + or - 만 있다했으니 더 쉽겠네.)을 구별해서 계산한다음 맞는지 비교하는 로직만 넣으면 되겠네.
    3. quiz의 길이는 최대 10개, 리턴은 "O"인지 "X"인지 들어있는 배열.
 */
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String operator = "";
        int num1 = 0, num2 = 0, result = 0, count = 0;

        for (String targetQuiz : quiz) {
            num1 = Integer.parseInt(splitMethod(targetQuiz, 0));
            operator = splitMethod(targetQuiz, 1);
            num2 = Integer.parseInt(splitMethod(targetQuiz, 2));
            result = Integer.parseInt(splitMethod(targetQuiz, 4));

            switch (operator) {
                case "+":
                    if (num1 + num2 == result) {
                        answer[count++] = "O";
                    } else {
                        answer[count++] = "X";
                    }
                    break;
                case "-":
                    if (num1 - num2 == result) {
                        answer[count++] = "O";
                    } else {
                        answer[count++] = "X";
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
                    return answer;
            }
        }

        return answer;
    }

    private String splitMethod(String input, int index) {
        return input.split(" ")[index];
    }
}
