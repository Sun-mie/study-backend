package standardprocedureofjava.chapter02.variable;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;

        System.out.printf("score=" + score); // score=85
        System.out.printf("d=" + d); //d=85.4 <- 형변환 후에도 피연산자는 아무런 변화가 없다.
    }
}
