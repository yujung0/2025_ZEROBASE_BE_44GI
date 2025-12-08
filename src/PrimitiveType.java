public class PrimitiveType {
    public static void main(String[] args) {
        // 정수형
        byte byteNum = 127; // -128 ~ 127
        short shortNum = 32767; // -32768 ~ 32767
        int intNum = 2147483647;
        long longNum = 92; //

        // 실수형
        Float floatNum = 3.14f; // float 은 접미사 필요
        double doubleNum = 3.142592; // float 보다 정밀한 실수 표현 가능

        // 문자형
        char grade = 'A'; // "" 가 아닌 '' 로 표현

        // 논리형
        boolean isFalse = true;
        boolean isFalse2 = false;

        // 문자열
        String name = "홍길동";

        // 레퍼런스 타입
        // 1. 문자열 변환이 필요할 때
        String ageStr = "25";

        // 문자열을 숫자로 변환
        int age1 = Integer.parseInt(ageStr); // 기본형으로 변환
        System.out.println(age1);

        // 기본형을 레퍼런스 타입으로 변환할 때
        Integer age2 = Integer.valueOf(ageStr);
        System.out.println(age2);

        // 레퍼런스 타입은 null 을 허용한다
        Integer age = null;
        System.out.println(age);
//        int height;

        // 최대/최소값을 확인하는 예제
        System.out.println("Integer.MAX_VALUE" + Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        int number = 42;
        System.out.println("2진수로 변환 : " + Integer.toBinaryString(number));
        System.out.println("16진수로 변환 : " + Integer.toHexString(number));

        // 박싱 & 언박싱
        int a = 5;
        Integer bb = new Integer(a);
        System.out.println("박싱 : " + a);

        // 언박싱
        Integer b = new Integer(5);
        int bbb = b.intValue();
        System.out.println("언박싱 : " + bbb);

        // JDK5 이후 부터 오토 박싱 & 오토 언박싱
        int aaa = 5;
        Integer aaa2 = aaa; // 오토 박싱
        System.out.println("오토 박싱 : " + aaa2);

        int c = aaa2; // 오토 언박싱
        System.out.println("오토 박싱 : " + c);
    }
}
