package oopsConcepts.abstractiondemo;

public abstract class Remote {

 // abstract method (does not have a body)
    abstract void remoteControl();

    // concrete method (has a body)
    void powerOn() {
        System.out.println("Power On");
    }

    void powerOff() {
        System.out.println("Power Off");
    }
}
