package standardprocedureofjava.chapter07.objectOrientedProgrammingll;

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() { /*현재위치에 정지*/ }
}

class Marine extends Unit {
    void move(int x, int y) { /*지정된 위치로 이동*/ }

    void stimPack() { /*스팀팩을 사용한다*/ }
}

class Tank extends Unit {
    void move(int x, int y) { /*지정된 위치로 이동*/ }

    void changeMode() { /*공격모드를 변환*/ }
}

class Dropship extends Unit {
    void move(int x, int y) { /*지정된 위치로 이동*/ }

    void load() { /*선택된 대상을 태운다*/ }

    void unload() { /*선택된 대상을 내린다*/ }
}

class Abstract {
    public static void main(String[] args) {
        Unit[] group = new Unit[4];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Marine();
        group[3] = new Dropship();

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}