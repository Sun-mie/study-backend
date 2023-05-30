package standardprocedureofjava.chapter03.operator;

public class OperatorEx4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i;
        System.out.println(i); // -10 부호연산자 +는 하는 이ㅣㄹ이 없음.

        i = -10;
        i = -i;
        System.out.println(i); // 10 -는 음수를 양수로 양수를 음수로 만든다.
    }
}
