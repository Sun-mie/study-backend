package standardprocedureofjava.chapter02.variable;

class VarEx3 {
    public static void main(String[] args) {

        int octNum = 010;
        int gexNum = 0x10;
        int binNum = 0b10;

        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        System.out.println(big);

        int i = 'A';
        long l = 123;
        double d = 3.14f;

        //int ia = 0x123456789; // int 타입의 번위는 넘는 값
        //float f =  3.14; // float 타입보다 double 타입의 범위가 넓다.

        byte b = 65;
        short s = 0x1234;


    }
}