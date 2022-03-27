package Tutorial.ch02.count_oop;

public class Main {
    public static void main(String[] args) {
        OOP oop1 = new OOP( 1000 ,3);
        oop1.printBaeCount();
        oop1.printBaeTotal();
        OOP oop2 = new OOP( 1000 ,7);
        oop2.printBaeCount();
        oop2.printBaeTotal();
        OOP oop3 = new OOP( 1000 ,23);
        oop3.printBaeCount();
        oop3.printBaeTotal();
    }
}

class OOP{
    private final int max;
    private final int bae;
    public OOP(int m, int b){
        this.max = m;
        bae = b;
    }
    public void printBaeCount(){
        int count = 0;
        for(int i= 1; i<=max; i++){
            if(i%bae==0){
                count++;
            }
        }
        System.out.printf("1부터 %d까지 %d의  배수의 개수는 %d개 입니다\n",max,bae,count);
    }
    public void printBaeTotal(){
        int total = 0;
        for(int i =1; i<=max; i++){
            if(i % bae == 0){
                total += i;
            }
        }
        System.out.printf("1부터 %d까지 %d의  배수의 개수는 %d개 입니다\n",max,bae,total);
    }
}
