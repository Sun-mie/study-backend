package standardprocedureofjava.chapter04.controlstatement;

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트 다운을 시작합니다.");

        while(i--!=0) {
            System.out.println(i);

            // 약간의 시간이 지연되도록하기 위한 for문.
            // 블럭 내 문장이 한 줄일 경우 한 줄에 ;로 끝낼 수 있다.
            for(int j=0; j<2_100_000_000; j++);
        }

        System.out.println("GAME OVER");
    }
}
