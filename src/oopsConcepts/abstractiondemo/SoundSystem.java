package oopsConcepts.abstractiondemo;

public class SoundSystem extends Remote implements Interface1, Interface2 {


    @Override
    void remoteControl() {
        System.out.println("Volume up/Down");
    }

    @Override
    public void method1() {
        System.out.println("Method 1 from Interface1 and Interface2");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 from Interface1 and Interface2");
    }
}
