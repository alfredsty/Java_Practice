package Tutorial.ch03.ssg_membership;

import java.text.DecimalFormat;

public class Customer {
    public final int MAX_BUDGET = 1000000;
    public final double normal_pRate = 0.02;

   private int id;
   private String name;
   private String birth;
   protected int money;
   protected double point;
   protected double pRate;

    public Customer(int id, String name, String birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        money = MAX_BUDGET;
        pRate = normal_pRate;
        point = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public double getpRate() {
        return pRate;
    }

    public void setpRate(double pRate) {
        this.pRate = pRate;
    }
    public void print(){
        DecimalFormat df = new DecimalFormat("###,###");
        String dfMoney = df.format(money);
        String dfPoint = df.format(point);
        System.out.printf(
                "[%d] %s (남은 돈 : %d원) 포인트 : %.0f점\n",id,name,money,point
        );
    }
    public void buy(int price){

        int checkPrice = price;
        if(isAvailable(checkPrice)){
            money = money - price;
            double mypoint = price * pRate;
            point += mypoint;
        } else {
            System.out.println(getName() + "님의 예산이 충분하지 않습니다.");
        }

    }

    public boolean isAvailable(int price){
            if(money >= price){
                return true;
            } else {
                return false;
            }
    }
}
