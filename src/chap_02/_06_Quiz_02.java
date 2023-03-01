package chap_02;

public class _06_Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이기구 탑승 가능 여부 확인 프로그램
        // 조건
        // - 키가 120cm 이상이 경우에만 탑승 가능
        // - 삼항 연산자 이용
        int tall = 121;
        String result = (tall >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + tall + "cm 이므로 탑승 " + result + "합니다.");

    }
}
