package standardprocedureofjava.chapter02.variable;
import java.util.*; // Scanner클래스를 사용하기 위해 추가

public class ScannerEx {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 자리 정수를 하나 입력하세요.>");
        // nextLine()이라는 메서드를 호출하면 입력대시 상태에 있다가 입력을 마치고 엔터를 누르면 입력한 내용이 문자열로 반환된다.
        String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
        int num = Integer.parseInt(input);  // 입력받은 내용을 int타입의 값으로 변환

        System.out.println("입력내용: "+input);
        System.out.printf("num=%d%n", num);

        int nums = scanner.nextInt(); // 정수를 입력받아 변수에 저장
    }
}
