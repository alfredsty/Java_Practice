package Tutorial.ch03.ex_starcraft;

public class Main{
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Goliat goliat = new Goliat();
        Hydra hydra = new Hydra();

        //생성하기
        dragon.crate();
        hydra.crate();
        goliat.crate();

        //전투시나리오
        dragon.attack();
        dragon.attack();
        dragon.attack();
        dragon.getDamage(10);
        dragon.getDamage(10);
        dragon.getDamage(10);
        dragon.getDamage(10);
        dragon.getDamage(10);

        //전투시나리오2
        for(int i =0; i <20; i++){
            hydra.attack();
        }
        hydra.getDamage(25);
        hydra.getDamage(25);
        hydra.getDamage(25);

        //전투시나리오3

        goliat.attack();
        goliat.attack();
        goliat.attack();

        goliat.getDamage(5);
        goliat.getDamage(5);
        goliat.getDamage(5);
        goliat.getDamage(5);
        goliat.getDamage(5);

    }
}
