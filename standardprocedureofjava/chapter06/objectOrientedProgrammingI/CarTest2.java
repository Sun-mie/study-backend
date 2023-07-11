package standardprocedureofjava.chapter06.objectOrientedProgrammingI;

class Vehicle {
    String color;
    String gearType;
    int door;

    Vehicle() {
        this("white", "auto", 4);
    }
    Vehicle(String color) {
        this(color, "auto", 4);
    }

    Vehicle(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class CarTest2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("blue");

        System.out.println("v1의 color = " + v1.color + ", gearType = " + v1.gearType + ", door = " + v1.door);
        System.out.println("v2의 color = " + v2.color + ", gearType = " + v2.gearType + ", door = " + v2.door);
    }
}
