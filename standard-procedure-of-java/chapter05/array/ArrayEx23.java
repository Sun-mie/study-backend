package standardprocedureofjava.chapter05.array;

import java.util.Scanner;

public class ArrayEx23 {
    public static void main(String[] args) {
        String[][] words = {
                {"row", "행"},
                {"column", "열"},
                {"multiplication", "곱셈"},
                {"utilization", "활용"}
        };

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<words.length; i++){
            System.out.printf("Q%d. %s의 뜻은? >", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])){
                System.out.printf("정답입니다.%n%n");
            }else{
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
            }
        }

    }
}
