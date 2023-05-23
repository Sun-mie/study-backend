package standardprocedureofjava.chapter02.variable;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);

        System.out.println( 7 + 9 ); // 16
        System.out.println( 7 + " " ); // "7 "
        System.out.println( " " + 7 ); // " 7"
        System.out.println( " " + 7 + 7); // " 77"
        System.out.println( 7 + "7" ); // "77"
        System.out.println( true + ""); // "true"
        System.out.println( null + ""); // "null"

    }
}
