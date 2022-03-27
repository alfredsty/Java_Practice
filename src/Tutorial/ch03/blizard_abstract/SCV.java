package Tutorial.ch03.blizard_abstract;

public class SCV extends Woker implements Repair,Attack{

    @Override
    public void getMinerals() {
        System.out.println("테란이 미네랄을 채취합니다");
    }

    @Override
    public void getGas() {
        System.out.println("테란이 가스를 채취합니다.");
    }

    @Override
    public void work() {
    getGas();
    getMinerals();
    }

    @Override
    public void repair() {

    }

    @Override
    public void attack(){

    }
}
