package standardprocedureofjava.chapter05.array;

public class ArrayEx08 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        // 배열의 각 요소에 1-45의 값을 저장한다.
        for(int i=0; i<ball.length; i++){
            ball[i] = i+1;
        }

        int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
        int j = 0; // 임의의 값을 얻어 저장할 변수

        // 배열의 i 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔 값을 섞는다.
        // 0번째부터 5번째 요소까지 모두 6개만 바꾼다.
        for(int i=0; i<6; i++){
            j = (int) (Math.random() * 45); //0~44번위의 임의 값
            // ball[i]와 ball[j]의 값을 서로 바꾼다.
            temp = ball[i];
            ball[i] = j;
            ball[j] = temp;
        }

        //배열 ball의 앞에서부터 6개의 요소를 출력한다.
        for(int i=0; i<6; i++)
            System.out.printf("balll[%d] = %d%n", i, ball[i]);
    }
}
