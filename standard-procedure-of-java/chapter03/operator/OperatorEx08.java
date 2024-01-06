package standardprocedureofjava.chapter03.operator;

public class OperatorEx08 {
    public static void main(String[] args) {
        int a = 1_000_000; // 1,000,000 1백만
        int b = 2_000_000; // 2,000,000 2백만

        long c = a * b; // a * b = 2,000,000,000,000 ?
        System.out.println(c); //-1454759936

        long d = (long)a * b;
        System.out.println(d); //2000000000000
    }
}
