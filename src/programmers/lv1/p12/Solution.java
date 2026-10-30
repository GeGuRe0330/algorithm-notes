package programmers.lv1.p12;

/*
TODO:
    1. 전화번호 뒤에 네 자리만 빼고 나머지는 다 가리면 되는거네? replace를 쓰면 되겠다. -> 근데 이건 1:1 대응 비교를 해야하는데 사실상 불가능.
    2. 아니면 전화번호 뒤에 네 자리만 따로 빼서 새로 String을 만들까?
    3. 지금 해보는 방안으론 subString으로 뒷 네자리만 떼어놓고, 따로 별도 String 문자열을 만들어 리턴하는게 가장 효율적일거같은데?
 */
class Solution {
    public String solution(String phone_number) {
        int starLength = phone_number.length() - 4;
        String backNumber = phone_number.substring(phone_number.length() - 4);

        return "*".repeat(starLength) + backNumber;
    }
}
