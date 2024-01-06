package standardprocedureofjava.chapter07.objectOrientedProgrammingll;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D2 p3 = new Point3D2();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
    }
}

class Point3 {
    int x = 10, y = 20;

    Point3(int x, int y) {
        // 컴파일러가 super();를 여기에 삽입한다.
        this.x = x;
        this.y = y;
    }
}

class Point3D2 extends Point3 {
    int z = 30;

    Point3D2() {
        this(100, 200, 300);
    }

    Point3D2(int x, int y, int z) {
        super(x, y); // Point3(int x, int y)를 호출한다.
        this.z = z;
    }

}
