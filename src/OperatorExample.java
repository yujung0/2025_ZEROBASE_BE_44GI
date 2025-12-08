public class OperatorExample {
    public static void main(String[] args) {
        // 1. 산술 연산자 (사칙연산)
//        int a = 10 + 5;
//        System.out.println("a = " + a);
//
//        int b = 10-5;
//        System.out.println(b);
//
//        int c = 10 * 5;
//        System.out.println(c);
//
//        int d = 10 /5;
//        System.out.println(d);
//
//        int e = 10% 3;
//        System.out.println(e);
//
//        // 2. 대입 연산자
//        int number = 10;
//        String name = "홍길동";
//
//        // 3. 증감 연산자
//        int count = 1;
//        count++;
//        System.out.println("count = " + count);
//
//        count--;
//        System.out.println("count = " + count);
//
//        // 4. 비교 연산자
//        int x = 10;
//        int y = 20;
//        // x가 y 보다 큰가?
//        boolean aa = x > y;
//        System.out.println("aa = " + aa);
//
//        //x가 y 보다 작은가?
//        boolean bb = x < y;
//        System.out.println(bb);
//        // x가 y와 같은가?
//        boolean cc = x == y;
//        System.out.println(cc);
//
//        // 5. 논리 연산자
//        boolean 비가온다 = true;
//        boolean 춥다 = true;
//        boolean result = 비가온다&&춥다;
//        System.out.println("result = " + result);

        // 삼항연산자
//        // 1. 합격/불합격 판단
//        int score = 85;
//        String result = score >= 60 ? "합격" : "불합격";
//        System.out.println(result);
//
//        // 2. 양수/음수 판단
//        int num = 6;
//        String eventOdd = num % 2 == 0 ? "짝수" : "홀수";
//        System.out.println(eventOdd);
//
//        // 3. 더 큰 수 찾기
//        int a = 10, b = 20;
//        int bigger = a > b ? a : b;
//        System.out.println(bigger);
//
//        // 4. 할인 적용
//        int price = 10000;
//        boolean isMember = true;
//        int finalPrice = isMember ? price - 10000 : price;
//        System.out.println("회원 할인가 : " + finalPrice);

        
        // 문자열 연결
        // 1. 문자열 끼리 합치기
        String 인사 = "안녕하세요." + "반갑습니다.";
        System.out.println(인사);

        // 2. 문자열과 숫자 합치기
        String 자기소개 = "제 나이는 " + 20 + "세 입니다.";
        System.out.println(자기소개);

        // 3. 문자열과 정수 변수 합치기
        int age = 25;
        System.out.println("제 나이는 "+ age + "살 입니다.");
        
        // 4. 문자열 + 숫자 계산
        int price = 1000;
        int count = 3;
        System.out.println("총 가격은 " + price * count + "원");

        // 주의 사항
        // 숫자 + 숫자 + 문자열
        System.out.println(1 + 2 + "번"); // 3번
        // 동작방식 : 먼저 1+2 계산 후 문자열 합쳐짐

        // 문자열 + 숫자 + 숫자
        System.out.println("번호 " + 1 + 2); //번호 12
        // 동작 방식 : 문자열 이후 다 문자로 인식

        // 괄호 사용
        System.out.println("결과 : "+ (1 + 2)); // 결과 : 3
        System.out.println("결과 : " + 1 + 2);

        // 문제 : 10,000원으로 3,500원 짜리 물건 샀을 때 거스름돈을 계산해서 출력
        int money = 10000;
        int buy = 3500;
        System.out.println("거스름돈 : " + (money-buy));
    }
}
