package numberbaseball;

import java.util.Arrays;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cumputer1 = 3;
        int cumputer2 = 8;
        int cumputer3 = 1;


        boolean isCorrect = false;
        int strike = 0;
        int ball = 0;


        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        while (!(isCorrect)) {
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            int user1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int user2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int user3 = scanner.nextInt();

            strike = 0;
            ball = 0;

            if (user1 == cumputer1) {
                strike++;
            }
            if (user2 == cumputer2) {
                strike++;
            }
            if (user3 == cumputer3) {
                strike++;;
            }

            if (user1 == cumputer2 || user1 == cumputer3) ball++;
            if (user2 == cumputer1 || user2 == cumputer3) ball++;
            if (user3 == cumputer1 || user3 == cumputer2) ball++;

            if (strike == 3) {
                System.out.println("축하합니다. 정답을 맞추셨습니다.");
                isCorrect = true;
            }
            else {
                System.out.println(strike + "스트라이크 " + ball + " 볼 ");
            }




        }

        // System.out.println("축하합니다! 정답을 맞추셨습니다.");
    }

}
