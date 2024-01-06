package standardprocedureofjava.chapter07.objectOrientedProgrammingll;

public class BindingTest2 {
    public static void main(String[] args) {
        Parents2 p = new Childs2();
        Childs2 c = new Childs2();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parents2 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Childs2 extends Parents2 {
}