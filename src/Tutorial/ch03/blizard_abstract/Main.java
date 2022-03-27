package Tutorial.ch03.blizard_abstract;

public class Main {
    public static void main(String[] args) {
        Prove prove = new Prove();
        SCV scv = new SCV();
        Drone drone = new Drone();

        prove.work();
        scv.work();
        drone.work();

    }

}
