package standardprocedureofjava.chapter06.objectOrientedProgrammingI;

class Data1 {
    int value;
}

class Data3 {
    int value;

    Data3(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        //Data3 d2 = new Data3(); //compile error발생
        Data3 d2 = new Data3(2);
    }
}
