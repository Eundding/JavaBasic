package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name= "은띵"; // name이라는 문자열 변수 선언
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade  = 'A'; // 한글자는 보통 작은 따옴표 사용
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.141592;
        float f = 3.14159212345689F; // float 만드려면 실수값 뒤에 F or f 써주기
        System.out.println(d);
        System.out.println(f); // float은 소수점 6자리까지 출력된다.(보통 double 쓸 듯)

        long l = 1000000000000L; // Long형 자료도 정수 뒤에 L or l 넣기
        l = 1_000_000_000_000L; // 밑줄로 보기 편하게 할 수 있음. 출력은 상관없음
        System.out.println(l);
    }
}
