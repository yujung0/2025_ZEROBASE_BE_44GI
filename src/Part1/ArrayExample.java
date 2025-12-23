package Part1;

public class ArrayExample {
    public static void main(String[] args) {
        // 1. 배열
//        // 배열이 없다면
//        int score1 = 90;
//        int score2 = 80;
//        int score3 = 85;
//        int score4 = 75;
//
//        // 배열 사용 시
//        int[] score = {90, 80, 85, 75};

        // 2. 배열의 선언과 생성
        // 배열 선언
//        int[] numbers;
//
//        // 배열 생성
//        numbers = new int[5];
//
//        // 선언과 생성 동시에
//        int[] ages = new int[3];
//
//        // 선언과 동시에 초기화
//        int[] points = {95, 88, 76, 91};
//
//        // 3. 배열의 사용
//        int[] numbers2 = new int[5];
//
//        // 값 저장
//        numbers[0] = 10;
//        numbers[1] = 20;
//
//        // 값 읽기
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//
//        // 배열의 길이
//        System.out.println(numbers.length); // 배열에 할당된 길이
//
////        // 배열은 반복문을 사용해 순회 가능
//        int[] scores = {90, 80, 85, 75};
////        for(int i = 0; i < scores.length; i++) {
////            System.out.println(scores[i]);
////        }
//
//        // for-each 사용
//        for (int score : scores) {
//            System.out.println(score);
//        }
//
//        // 주의 사항
//        int[] arr = new int[1];
////        arr[2] = 3; // 예외
//
//        int[] nullArr;
////        nullArr[0];

//        // 배열과 반복문을 통해 로또 번호 생성하기
//        int[] LottoNum = {90, 80, 85, 75};
//        for (int i = 0; i <LottoNum.length; i++) {
//            System.out.println("로또 번호 : " + LottoNum[i]);
//        }

        // 1. 로또 번호를 저장할 배열 생성 (6개 숫자)
        int[] lotto = new int[6];

        // 2. 로또 번호 생성 (1~45)
        for (int i = 0; i < 6; i++) {
            // 1~45 사이의 랜덤한 숫자 생성
            int num = (int) (Math.random() * 45) + 1;

            // 중복 검사
            boolean isDuple = false;

            // 이미 생성된 번호와 비교
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    isDuple = true;
                    i--; // 중복이면 이번 회차 다시
                    break;
                }
            }

            // 중복이 아닌 경우에는 배열에 저장
            if (!isDuple) {
                lotto[i] = num;
            }
        }

        // 생성된 로또 번호 출력
        System.out.println("로또 번호 : ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.println(lotto[i] + " ");
        }

    }

}
