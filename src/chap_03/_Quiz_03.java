package chap_03;

public class _Quiz_03 {
    // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램 작성
    // 주민등록번호는 13자리
    // 앞 6자리는 생년월일, 뒷 7자리 중 첫번쨰 숫자는 성별
    // 입력 데이터는 -을 포함한 14자리 문자열 형태
    // ex) "901231-1234556"인 경우 901231-1 출력

    public static void main(String[] args) {
        String jumin = "901231-1234566";
        System.out.println(jumin.substring(0, jumin.indexOf("-")+2));
        // System.out.println(jumin.substring(0, 8)); same
    }

}
