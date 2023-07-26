package standardprocedureofjava.chapter07.objectOrientedProgrammingll;

class Cards {
    final int NUMBER; // 상수이지만 선언과 동시에 초기화 하지 않고, 생성자에서 단 한번만 초기화할 수 있다.
    final String KIND;
    static int width = 100;
    static int heigth = 250;

    Cards(String kind, int num) { // 넘겨받은 매개변수로 final 멤버변수를 초기화할 수 있다.
        KIND = kind;
        NUMBER = num;
    }

    Cards() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

class FinalCardTest {
    public static void main(String[] args) {
        Cards c = new Cards("HEART", 10);
        //c.NUMBER = 5; 에러
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c); // System.out.println(c.toString());
    }
}
