package standardprocedureofjava.chapter02.variable;

public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("     123456789012345678901234%n");
        System.out.printf("f  : %f%n", f); // 9.123457 7자리에서 반올림되었음.
        System.out.printf("f  : %24.20f%n", f); // 9.12345695495605500000
        System.out.printf("f2 : %24.20f%n", f2); // 1.23456788063049320000
        System.out.printf("d  : %24.20f%n", d); // 9.12345678901234600000
    }
}
