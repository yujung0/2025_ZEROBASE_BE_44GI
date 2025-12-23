package Part2;

import java.util.HashSet;

public class HashSetDuPlicateExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        // 추가
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);

        // 삭제
        set.remove("C");
        set.remove("B");
        System.out.println(set);

        // 중복 방지 확인
        set.add("A");
        System.out.println(set);
    }
}
