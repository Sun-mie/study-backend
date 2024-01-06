package standardprocedureofjava.chapter07.objectOrientedProgrammingll;

class Tv {
    boolean power; //전원상태 (on/off)
    int channel; //채널

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class VCR {
    boolean power; //전원상태 (on/off)
    int counter = 0;

    void play() {
        power = !power;
    }

    void stop() {
    }

    void rew() {
    }

    void ff() {
    }
}

class TVCR extends Tv {
    VCR vcr = new VCR(); // VCR클래스를 포함시켜 사용

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}
