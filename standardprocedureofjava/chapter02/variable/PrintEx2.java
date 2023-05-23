package standardprocedureofjava.chapter02.variable;

public class PrintEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); //f1=0.100000, 1.000000e-01, 0.100000
        System.out.printf("f1=%f, %e, %g%n", f2, f2, f2); //f1=10.000000, 1.000000e+01, 10.0000
        System.out.printf("f1=%f, %e, %g%n", f3, f3, f3); //f1=3140.000000, 3.140000e+03, 3140.00

        System.out.printf("d=%f%n", d); //d=1.234568
        System.out.printf("d=%14.10f%n", d); //d=  1.2345678900 전체 14자리 중 소수점 10자리

        System.out.printf("[1234567890]%n"); //[1234567890]
        System.out.printf("[%s]%n", url); //[www.codechobo.com]
        System.out.printf("[%20s]%n", url); //[   www.codechobo.com]
        System.out.printf("[%2s]%n", url); //[www.codechobo.com]
        System.out.printf("[%-20s]%n", url); //[   www.codechobo.com] //왼쪽정렬
        System.out.printf("[%.8s]%n", url); //[www.code] //왼쪽에서 8글자만 출력

        double dd = 1.234;
        System.out.printf("d=%14.10f", dd); //d=  1.2340000000
    }
}
