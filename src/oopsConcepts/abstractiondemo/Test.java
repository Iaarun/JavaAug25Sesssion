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

        SoundSystem ss = new SoundSystem(); // creating object of SoundSystem class or instance

         Remote r1 = new Remote(){ // Anonymous class
            @Override
            void remoteControl() {
                System.out.println("AC On/Off");
            }
         };
    }
}
