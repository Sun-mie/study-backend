package standardprocedureofjava.chapter04.controlstatement;

public class FlowEx18 {
    public static void main(String[] args) {
        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.printf("%d x %d = %d%n", i, j, i*j);
            }
        }

        //위와 같은 결과
        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++)
                System.out.printf("%d x %d = %d%n", i, j, i*j);
        }
    }
}
