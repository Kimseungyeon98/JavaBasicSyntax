package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 도착 정보를 출력하는 프로그램을 작성하시오.
        // 각 정보는 적절한 자료형의 변수에 정의합니다.
        String busNo = "1234";
        int lastTime = 3;
        double lastDistance = 1.5;

        System.out.println(busNo + "번 버스");
        System.out.println("약 " + lastTime + "분 후 도착");
        System.out.println("남은 거리 "+ lastDistance + "km");
    }
}
