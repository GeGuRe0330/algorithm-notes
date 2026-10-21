package programmers.lv0.p01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sumAngle = angle1 + angle2;

        int wholeCycle = (sumAngle / 360) * 360;

        int result = sumAngle - wholeCycle;

        System.out.println(result);
    }
}
