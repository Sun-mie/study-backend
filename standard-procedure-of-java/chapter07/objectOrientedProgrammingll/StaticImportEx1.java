package standardprocedureofjava.chapter07.objectOrientedProgrammingll;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out;

public class StaticImportEx1 {
    public static void main(String[] args) {
        // System.out.println(Math.random());
        out.println(random());

        //System.out.println("Math.Pi : " + Math.PI);
        out.println("Math.PI : " + PI);
    }
}
