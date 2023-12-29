package chap_05_;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length ; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("----------------------");

        // enhanced for (for-each) 반복문 -> coffees 라는 배열을 coffee 라는 변수로 하나하나 순회
        for (String coffee:
             coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
