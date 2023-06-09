package standardprocedureofjava.chapter04.controlstatement;

import java.util.Scanner;

public class FlowEx03 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력하세요 > ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input == 0) // 블럭 내의 문장이 하나뿐이 ㄴ경우 괄호 {}를 생략할 수 있다.
            System.out.println("입력하신 숫자는 0입니다.");
        else
            System.out.println("입력하신 숫자는 0이 아닙니다.");
    }
}
