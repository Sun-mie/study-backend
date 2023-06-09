package standardprocedureofjava.chapter04.controlstatement;

import java.util.Scanner;

public class FlowEx04 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하세요 > ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else
            grade = 'D';

        System.out.printf("당신의 학점은 %c입니다.", grade);
    }
}
