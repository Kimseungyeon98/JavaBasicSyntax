package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드가 있다면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 오렌지 주스가 있으면 +1
        // 모두 없으면 아이스 아메리카노 +1

        boolean hallabongAde = false; // 한라봉 에이드
        boolean mangoJuice = true; // 망고 주스
        boolean orangeJuice = true; // 오렌지 주스

        if (hallabongAde == true) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice == true) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice == true) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");
    }
}
