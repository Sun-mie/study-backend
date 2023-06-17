package standardprocedureofjava.chapter05.array;

public class ArrayEx05 {
    public static void main(String[] args) {
        int sum =0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for(int i=0; i<score.length; i++){
            sum += score[i];
        }

        average = sum / (float) score.length; // int와 int간의 연산은 int로 결과를 얻기 때문에 float로 변환

        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);
    }
}
