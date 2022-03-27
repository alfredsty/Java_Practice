package Tutorial.ch03.ex_starcraft;

public class Dragon extends Unit implements Attacks{
    boolean isAlive = false;
    int energy = 0;

    @Override
    public void crate() {
        isAlive = true;
        energy = max_energy;
        System.out.println("프로토스: 드래곤이 생성되었습니다(에너지:"+energy+")");
    }

    @Override
    public void attack() {
        System.out.println("프로토스: 드래곤이 공격합니다.");
    }

    @Override
    public void getDamage(int dmg) {
        if(isAlive && energy > 0){
            System.out.println("프로토스: 히드라가 공격받습니다(에너지:"+energy+")");
            energy = energy - dmg;
            if(energy <= 0){
                remove();
            }
        }

    }

    @Override
    public void remove() {
        isAlive = false;
        System.out.println("프로토스: 드래곤이 소멸되었습니다(에너지:"+energy+")");
    }
}
