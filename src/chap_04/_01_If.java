package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        // if 문 내에서 2개 이상의 문장을 실행할 떄 {} 꼭 필요
        int hour = 10; // am 10
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 #1");
        System.out.println();

        // 2 p.m. 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; // 모닝커피
//        if ( hour < 14 && morningCoffee == false) {
        if ( hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
        System.out.println();

        // 2pm 이후이거나 모닝 커피를 마신 경우
        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee){
            System.out.println("아이스 아메리카노(디카페인) +1");
        }
        System.out.println("커피 주문완료 #3");
    }
}
