package Part1;

public class TypeCastingExample {
    public static void main(String[] args) {
        // 1. 정수형 -> 실수형 형변환
//        int number = 10;
//        Double doubleNumber = (double) number;
//        System.out.println("1. 정수 -> 실수 ");
//        System.out.println("number = " + number);
//        System.out.println("doubleNumber = " + doubleNumber);
//
//        // 2. 실수형 -> 정수형 형변환
//        double score = 93.7;
//        int scoreInt = (int) score;
//        System.out.println();
//        System.out.println("2. 실수 -> 정수");
//        System.out.println("score = " + score);
//        System.out.println("scoreInt = " + scoreInt);
//
//        // 3. 논리형
//        boolean flag = true;
//        System.out.println();
//        System.out.println("3. 논리형은 형변환 불가");
//        System.out.println("flag = " + flag);
////        int bolToInt = (int) flag; // 에러 발생
//
//        // 문제 : int -> char로 서로 형변환 시 어떻게 되는지?
//        int inttochar = 100;
//        char tochar = (char) inttochar;
//        System.out.println();
//        System.out.println("int -> char : " + inttochar);
//
//        char chartoint = '가';
//        int toint = (int) chartoint;
//        System.out.println("char -> int : " + toint);


        // 1. 업캐스팅 (작은 타입 -> 큰 타입)
        System.out.println("== 업캐스팅 ==");
        int number = 10;
        double doubleNumber = number; // int -> double 자동 형변환
        System.out.println("int 값 : " + number); // 10
        System.out.println("doubleNumber 값 : " + doubleNumber); // 10.0

        // 2. 다운캐스팅 (큰 타입 -> 작은 타입)
        System.out.println();
        System.out.println("== 다운 캐스팅 ==");
        double score = 93.7;
        int scoreInt = (int)score;
        System.out.println("double 값 : " + score); // 93.7
        System.out.println("int  값 : " + scoreInt); // 93

        System.out.println();
        System.out.println("== 데이터 손실 ==");
        double pi = 3.14;
        int intPi = (int) pi;
        System.out.println("double 값 : " + pi); //3.14
        System.out.println("int 값 : " + intPi);

        int a = 333;
        byte b = (byte) a;
        System.out.println("int = " + a);
        System.out.println("b = " + b);

    }
}
