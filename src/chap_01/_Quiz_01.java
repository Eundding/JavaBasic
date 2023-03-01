package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 도착 정보를 출력하는 프로그램 작성
        // 버스 번호, 남은 시간, 남은 거리 변수에 정의
        String busNo = "상암08";
        int min = 3;
        double distance = 1.5;

        System.out.println(busNo + "번 버스");
        System.out.println("약 " + min + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
