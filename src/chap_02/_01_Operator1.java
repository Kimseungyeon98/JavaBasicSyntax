package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 더하기
        System.out.println(4 - 2); // 빼기
        System.out.println(4 * 2); // 곱하기
        System.out.println(4 / 2); // 나누기
        System.out.println(5 / 2); // 출력이 정수로 됨
        System.out.println(2 / 4); // 출력이 정수로 됨
        System.out.println(4 % 2); // 나머지

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println(2 + (2 * 2));

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 (바로 1 더해짐)
        System.out.println(val); // 11
        System.out.println(val++); // 11 (실행 후 1 더해짐)
        System.out.println(val); // 12

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9 (바로 1 빼기)
        System.out.println(val); // 9
        System.out.println(val--); // 9 (실행 후 1 빼기)
        System.out.println(val); // 8

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 대기 인원 : 3

    }
}
