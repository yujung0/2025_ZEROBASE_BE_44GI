package Part1;

public class ForExample {
    public static void main(String[] args) {

        // 1. 구구단 2단 출력
//        for (int i = 1; i <= 9; i++) {
//            System.out.println("2 x " + i + " = " + (2 * i));
//        }
//
//        // 2. 합계 구하기
//        // 1+2+... + 10=55
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println("1 부터 10 까지의 합 : " + sum);

        // 2. while문
//        int num = 1; // 초기화
//        while (num <= 5) { // 조건식
//            System.out.println(num);
//            num++;
//        }
//
//        // 카운트다운
//        int count = 5;
//        while (count > 0) {
//            System.out.println(count);
//            count--;
//        }
//        System.out.println("발사");

        // 무한루프
//        int i = 0;
//        while (true) {
//            System.out.println("무한반복 횟수 : " + i);
//            i++;
//        }

        // 3. break, continue
//        //break
//        int sum = 0;
//        int num = 1;
//
//        while (true) {
//            sum += num;
//            if (sum > 100) {
//                break;
//            }
//            num++;
//        }
//        System.out.println("마지막에 더한 수 : " + num);
//        System.out.println("최종 합계 : " + sum);
//
//        // continue
//        int number = 0;
//        while (number < 10) {
//            number++;
//            if(number % 2 != 0) { // 홀수
//                continue;
//            }
//            System.out.println(number);
//        }
//
//        // 4. 구구단 작성
//
//        for (int dan = 2; dan <=9; dan++) {// 2단 부터 9단 까지 반복
//            // 단수 표시
//            System.out.println("\n" + dan + "단");
//
//            // 1부터 9 까지 곱하기
//            for (int i = 1; i <= 9; i++) {
//                System.out.println(dan + " x " + i + " = " + (dan+i));
//            }
//        }

        // 문제 : 1 부터 100 까지 반복을 사용해서 합 구하기
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 부터 100 까지 합 : " + sum);
    }



}
