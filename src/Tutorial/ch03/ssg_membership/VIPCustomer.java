package Tutorial.ch03.ssg_membership;

import javax.naming.Name;

public class VIPCustomer extends Customer{
    public final double vip_pRate = 0.05;
    public final double vip_discount =0.02;
    double dRate;

    public VIPCustomer(int id, String name, String birth) {
        super(id, name, birth);
        pRate = vip_pRate;
        dRate = vip_discount;

    }
    @Override
    public void buy(int price){
        double myprice = (double) price * dRate;
        int checkPrice = price = (int) myprice;
        if(isAvailable(checkPrice)){
            money = money - price + (int) myprice;
            double mypoint = (double) price * pRate;
            point += mypoint;
        }else{
            System.out.println(getName() + "님의 예산이 충분하지 않습니다.");
        }
    }
}
