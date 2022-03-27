package Tutorial.ch03.blizard_abstract;

public class Drone extends Woker{

    @Override
    public void getMinerals() {
        System.out.println("드론이 미네랄을 체취합니다.");
    }

    @Override
    public void getGas() {
        System.out.println("드론이 가스를 체취합니다.");
    }

    @Override
    public void work() {
        getGas();
        getMinerals();
    }
}
