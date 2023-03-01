package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 아니면 false
        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 아니면 false (대소문자 구분)

        // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이, 같으면 true

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 이모지의 비밀번호 정보(참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false (참조하는 곳이 다름)

        // 자바에서 문자열 비교할 때는 == 보다 equals 쓰는 게 좋다

    }
}
