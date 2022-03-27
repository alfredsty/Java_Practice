package Tutorial.ch03.ssg_membership;

public class Main {
    public static void main(String[] args) {
        Customer jisu = new Customer(1, "지 수" , "1995-01-03");
        VIPCustomer jeny = new VIPCustomer(2, "제 니" , "1996-01-16");
        VIPCustomer rose = new VIPCustomer(3, "로 제" , "1997-06-11");
        Customer lisa = new Customer(4 , "리 사 " , "1997-03-27");

        jisu.buy(50000);
        jeny.buy(700000);
        rose.buy(650000);
        lisa.buy(12000);
        print(jisu , jeny, rose, lisa);

        jisu.buy(300000);
        jeny.buy(135000);
        rose.buy(300000);
        lisa.buy(45000);

        print(jisu , jeny, rose, lisa);

        jisu.buy(700000);
        jeny.buy(180000);
        rose.buy(69000);
        lisa.buy(943000);
        print(jisu , jeny, rose, lisa);

    }
    public static void print(Customer c1, VIPCustomer c2 , VIPCustomer c3 , Customer c4){
        System.out.println("===============================");
        c1.print();
        c2.print();
        c3.print();
        c4.print();

    }
}
