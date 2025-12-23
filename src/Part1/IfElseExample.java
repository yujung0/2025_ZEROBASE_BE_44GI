package Part1;

public class IfElseExample {
    public static void main(String[] args) {
        // 1. if-else
//        // 합격/불합격 판단
//        int score = 85;
//
//        if (score >= 60) {
//            System.out.println("합격");
//        } else {
//            System.out.println("불합격");
//        }
//
//        // 2. 학점 계산
//        int grade = 87;
//
//        if(grade >=90) {
//            System.out.println("A");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else {
//            System.out.println("C");
//        }

        // 2. 중첩 조건문
//        int score = 85;
//        int attendance = 80;
//
//        if (score >= 80) {
//            if (attendance >= 75) {
//                System.out.println("최종 합격");
//            } else {
//                System.out.println("출석 미달로 불합격");
//            }
//        } else {
//            System.out.println("성적 미달로 불합격");
//        }

        // 3. switch
        // 요일별 일정
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("월요일 : 회의");
                break;
            case 2:
                System.out.println("화요일 : 업무");
                break;
            case 3:
                System.out.println("수요일 : 휴식");
                break;
            default:
                System.out.println("다른 요일");
        }


        // 계절 판별
        String month = "January";

        switch (month) {
            case  "December":
            case  "January":
            case  "Febuary":
                System.out.println("겨울");
                break;
            case "March":
            case "May":
                System.out.println("봄");
                break;
        }

        // 문제 : if-else 문을 삼항 연산차로 치환
        int score = 85;

        if (score >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        int score1 = 85;
        String result = score1 >= 60 ? "합격" : "불합격";
        System.out.println("if-else문 -> 삼항연산자 치환 결과 : " + result);

    }

}
