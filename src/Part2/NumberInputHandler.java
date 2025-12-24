package Part2;

import java.util.Scanner;

public class NumberInputHandler  {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 숫자. (종료 : exit)");

        while (true) {
            System.out.print("입력 : ");
            String input = scanner.nextLine().trim();


            if (input.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }

            try {
                int number = Integer.parseInt(input);
                System.out.println("변환 성공. 입력한 숫자는 " + number + " 입니다.");
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아닙니다. 올바른 숫자를 입력하세요.");
            } finally {
                System.out.println("finally 사용");
            }

        }
            scanner.close();
    }
}
