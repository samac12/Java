package 연습.part4;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.printf("가위(1), 주먹(2), 보(3) 중 하나를 입력하시오:");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = (int) (Math.random() * 3) + 1;
        System.out.println("당신은"+user+"입니다.");
        System.out.println("컴은"+com+"입니다.");

        switch (user-com){
            case 2: case -1 :
                System.out.printf("당신이 졌습니다");
                break;

            case 1: case -2:
                System.out.printf("당신이 이겼습니다");
                break;
            case 0:
                System.out.printf("비겼습니다.");
                break;
        }
    }
}
