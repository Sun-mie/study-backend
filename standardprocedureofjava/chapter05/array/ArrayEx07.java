package standardprocedureofjava.chapter05.array;

public class ArrayEx07 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0; i<numArr.length; i++){
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i<100; i++){
            int n = (int) (Math.random() * 10); // 0-9 중 한 값을 임의로 얻는다.
            // numArr[0]와 numArr[n]의 값을 서로 바꾼다.
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for(int i=0; i<numArr.length; i++){
            System.out.print(numArr[i]);
        }
    }
}
