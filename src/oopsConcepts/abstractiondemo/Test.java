package oopsConcepts.abstractiondemo;

public class Test {

    public static void main(String[] args) {
        Remote r;
        r = new Lights();
        r.powerOn();
        r.remoteControl();
        r.powerOff();


        r = new SoundSystem();
        r.powerOn();
        r.remoteControl();
        r.powerOff();
    }
}
