package standardprocedureofjava.chapter02.variable;

public class OverflowEx {
    public static void main(String[] args) {
        short sMin = -32768; //short는 절반은 음수에 절반은 양수에 사용된다. 따라서 범위는 2의 15승 ~ 2의 15승-1
        short sMax = 32767;
        char cMin = 0; // char는 모두 양수에 사용되므로 0 ~ 2의16승-1
        char cMax = 65535;

        System.out.println("sMin = " + sMin); // sMin = -32768
        System.out.println("sMin-1 = " + (short)(sMin-1)); // sMin-1 = 32767
        System.out.println("sMax = " + sMax); //sMax = 32767
        System.out.println("sMax+1 = " + (short)(sMax+1)); //sMax+1 = -32768
        System.out.println("cMin = " + (int)cMin); //cMin = 0
        System.out.println("cMin-1 = " + (int)--cMin); //cMin-1 = 65535
        System.out.println("cMax = " + (int)cMax); //cMax = 65535
        System.out.println("cMin+1 = " + (int)++cMax); //cMin-1 = 0
    }
}
