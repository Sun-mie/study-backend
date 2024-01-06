package standardprocedureofjava.chapter07.objectOrientedProgrammingll;

public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println(p3.getLocation());
    }
}

class Point2 {
    int x, y;

    Point2(int x, int y) {
        // 컴파일러가 super();를 여기에 삽입한다.
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point2 {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}
