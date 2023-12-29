package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int pay = 4000;
        int maxPay = 30000;
        double sale = 0.5;
        String car = "일반";
        int time = 5;
        double sumPay =0 ;

        if (car == "일반") {
            sumPay = pay * time;
            if (sumPay <= maxPay) {
                System.out.println(car + " 차량 " + time + "시간 주차 시 " + (int)sumPay + "원");
            } else {
                System.out.println(car + " 차량 " + time + "시간 주차 시 " + maxPay + "원");
            }
        } else if (car == "경차") {
            sumPay = (pay * time) * sale;
            if (sumPay <= maxPay) {
            System.out.println(car + " 차량 " + time + "시간 주차 시 " + (int)sumPay + "원");
            } else {
                System.out.println(car + " 차량 " + time + "시간 주차 시 " + maxPay + "원");
            }
        } else if (car == "장애인") {
            sumPay = (pay * time) * sale;
            if (sumPay <= maxPay) {
                System.out.println(car + " 차량 " + time + "시간 주차 시 " + (int)sumPay + "원");
            } else {
                System.out.println(car + " 차량 " + time + "시간 주차 시 " + maxPay + "원");
            }
        }
    }
}
